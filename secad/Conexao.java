package secad;

//Importações
import java.sql.*;
import java.util.logging.*;

public class Conexao {
    private String dbURL = "jdbc:mysql://127.0.0.1:3306/SECad";
    private String username = "root";
    private String password = "";
    private Connection conn;
    
    public Conexao() {
        abrir();
    }
    public void abrir() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn !=null){
                System.out.println("Conectado");
           
            }
            
        } catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fechar(){
        try{
            getConn().close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public Connection getConn() {
        return conn;
    }
    public void setConn(Connection conn){
        this.conn = conn;
    }
}
