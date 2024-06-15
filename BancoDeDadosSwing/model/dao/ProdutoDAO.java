package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
    private Connection con = null;
    
    public ProdutoDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Produto p) {
        PreparedStatement stmt = null;
        String sql = "insert into produto (descricao, qtd, preco) values (?, ?, ?)";
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());
            
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
    
    public List<Produto> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from produto";
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto prod = new Produto();
                
                prod.setId(rs.getInt("id"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setQtd(rs.getInt("qtd"));
                prod.setPreco(rs.getDouble("preco"));
                
                produtos.add(prod);
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Consultar!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
    public List<Produto> read(String desc) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from produto where descricao ilike ?";
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, '%' + desc + '%');
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto prod = new Produto();
                
                prod.setId(rs.getInt("id"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setQtd(rs.getInt("qtd"));
                prod.setPreco(rs.getDouble("preco"));
                
                produtos.add(prod);
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Consultar!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return produtos;
    }
    
    public void update(Produto p) {
        PreparedStatement stmt = null;
        String sql = "update produto set descricao = ?, qtd = ?, preco = ? where id = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Produto p) {
        PreparedStatement stmt = null;
        String sql = "delete from produto where id = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, p.getId());
            
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