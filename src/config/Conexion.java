package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    
    public Conexion(){
        
      try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/negocio","root","");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" +e);
        }

       }

    public Connection getConnection(){
        return con;
    }
}
