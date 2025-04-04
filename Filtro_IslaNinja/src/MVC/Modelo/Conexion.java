package MVC.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection conectar = null;
    
    String Url = "jdbc:mysql://uy5u0bgqndxzt8gt:wTJoJl24oG5CLR3vax1q@brimwnbovlwuasr2q03z-mysql.services.clever-cloud.com:3306/brimwnbovlwuasr2q03z";
    String usuario = "uy5u0bgqndxzt8gt";
    String pass = "wTJoJl24oG5CLR3vax1q";
    
    public Connection getConexion(){
        try{
            conectar = DriverManager.getConnection(Url,usuario,pass);
            System.out.println("Conexion exitosa.");
        }catch(SQLException e){
            System.out.println("Error de conexion." + e.getMessage());
        }
        return conectar;
    }
}
