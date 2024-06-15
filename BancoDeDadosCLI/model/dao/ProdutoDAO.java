package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Categoria;
import model.bean.Produto;

public class ProdutoDAO {
    private Connection con = null;
    
    public ProdutoDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Produto prod) {
        String sql = "insert into produto (descricao, qtd, valor, categoria_id) values (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, prod.getDescricao());
            stmt.setInt(2, prod.getQtd());
            stmt.setDouble(3, prod.getValor());
            stmt.setInt(4, prod.getCate().getId());
            
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
    
    public List<Produto> findAll() {
        String sql = "select * from vm_produtocategoria";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto prod = new Produto();
                
                prod.setId(rs.getInt("pid"));
                prod.setDescricao(rs.getString(("pdesc")));
                prod.setQtd(rs.getInt("qtd"));
                prod.setValor(rs.getDouble("valor"));
                
                Categoria cate = new Categoria();
                
                cate.setId(rs.getInt("cid"));
                cate.setDescricao(rs.getString("cdesc"));
                
                prod.setCate(cate);
                
                produtos.add(prod);
            }
        }
        catch(SQLException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
        finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
    public boolean update(Produto prod) {
        String sql = "update produto set descricao = ?, qtd = ?, valor = ?, categoria_id = ? where id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, prod.getDescricao());
            stmt.setInt(2, prod.getQtd());
            stmt.setDouble(3, prod.getValor());
            stmt.setInt(4, prod.getCate().getId());
            stmt.setInt(5, prod.getId());
            
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
    
    public boolean delete(Produto prod) {
        String sql = "delete from produto where id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, prod.getId());
            
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