package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utils.CriptSenha;

public class UsuarioDAO {
    private Connection con = null;
    
    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
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
