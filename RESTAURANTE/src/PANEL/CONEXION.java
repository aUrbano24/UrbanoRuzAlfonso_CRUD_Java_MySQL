package PANEL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * INTEGRANTES DE GRUPO
 * JOSE ANDRES CANDAMIL CANDAMIL
 * JHONN FREDDY ARIAS SERNA
 * JORGE ALEJANDRO ZAPATA CALLE
*/
public class CONEXION {
    
    private static final Connection Conn = null;

	public static java.sql.Connection getConnection(){
        
        java.sql.Connection conexion =null;
      
        try{
           
            Class.forName("com.mysql.jdbc.Driver");        
            conexion = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/restaurante", "root", "2104");
              
        }catch(ClassNotFoundException | SQLException | HeadlessException ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);

        }return conexion;
        
    }
     
}