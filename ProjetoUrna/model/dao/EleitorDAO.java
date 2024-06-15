package model.dao;

import connection.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Eleitor;

public class EleitorDAO {
    private Connection con = null;
    
    public EleitorDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Eleitor e) {
        PreparedStatement stmt = null;
        String sql = "insert into eleitor (nome, cpf, cep, rua, bairro, numero) values (?, ?, ?, ?, ?, ?)";
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, e.getNome());
            stmt.setString(2, e.getCpf());
            stmt.setString(3, e.getCep());
            stmt.setString(4, e.getRua());
            stmt.setString(5, e.getBairro());
            stmt.setInt(6, e.getNumero());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Eleitor> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from eleitor";
        
        List<Eleitor> eleitores = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Eleitor elei = new Eleitor();
                
                elei.setId(rs.getInt("id"));
                elei.setNome(rs.getString("nome"));
                elei.setCpf(rs.getString("cpf"));
                elei.setCep(rs.getString("cep"));
                elei.setRua(rs.getString("rua"));
                elei.setBairro(rs.getString("bairro"));
                elei.setNumero(rs.getInt("numero"));
                
                eleitores.add(elei);
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Consultar\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return eleitores;
    }
    
    public void delete(Eleitor e) {
        PreparedStatement stmt = null;
        String sql = "delete from eleitor where id = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, e.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}