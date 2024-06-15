package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Categoria;

public class CategoriaDAO {
    private Connection con = null;
    
    public CategoriaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Categoria cate) {
        String sql = "insert into categoria (descricao) values (?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cate.getDescricao());
            
            stmt.executeUpdate();
            
            return true;
        }
        catch(SQLException ex) {
            System.err.println("ERRO: " + ex.getMessage());
            
            return false;
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Categoria> findAll() {
        String sql = "select * from categoria";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Categoria cate = new Categoria();
                
                cate.setId(rs.getInt("id"));
                cate.setDescricao(rs.getString("descricao"));
                categorias.add(cate);
            }
        }
        catch(SQLException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
    }
    
    public boolean update(Categoria cate) {
        String sql = "update categoria set descricao = ? where id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cate.getDescricao());
            stmt.setInt(2, cate.getId());
            
            stmt.executeUpdate();
            
            return true;
        }
        catch(SQLException ex) {
            System.err.println("ERRO: " + ex.getMessage());
            
            return false;
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete(Categoria cate) {
        String sql = "delete from categoria where id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cate.getId());
            
            stmt.executeUpdate();
            
            return true;
        }
        catch(SQLException ex) {
            System.err.println("ERRO: " + ex.getMessage());
            
            return false;
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}