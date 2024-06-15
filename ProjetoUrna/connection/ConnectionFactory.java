package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String DRIVER = "org.postgresql.jdbc";
    private static final String URL = "jdbc:postgresql://localhost:5432/dburna";
    private static final String USER = "postgres";
    private static final String PASS = "admin";
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void closeConnection(Connection con) {
        if(con != null) {
            try {
                con.close();
            }
            catch(SQLException ex) {
                System.err.println("ERRO: " + ex.getMessage());
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        if(stmt != null) {
            try {
                stmt.close();
            }
            catch(SQLException ex) {
                System.err.println("ERRO: " + ex.getMessage());
            }
        }
        
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            }
            catch(SQLException ex) {
                System.err.println("ERRO: " + ex.getMessage());
            }
        }
        
        closeConnection(con, stmt);
    }
}
