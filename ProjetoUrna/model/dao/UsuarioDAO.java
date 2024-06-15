package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Usuario;
import utils.CriptSenha;

public class UsuarioDAO {
    private Connection con = null;
    
    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Usuario u) {
        PreparedStatement stmt = null;
        String sql = "insert into usuario (login, senha) values (?, ?)";
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, u.getLogin());
            stmt.setString(2, CriptSenha.encripta(u.getSenha(), "SHA-1"));
            
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
    
    public boolean checkLogin(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from usuario where login = ? and senha = ?";
        
        boolean checkagem = false;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, login);
            stmt.setString(2, CriptSenha.encripta(senha, "SHA-1"));
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                checkagem = true;
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Autenticar!\n\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return checkagem;
    }
}