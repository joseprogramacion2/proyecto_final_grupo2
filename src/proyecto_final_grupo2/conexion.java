/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final_grupo2;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    Connection conectar=null;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/parqueo_vehiculo","root","1234");
            JOptionPane.showMessageDialog(null, "Conexión exitosa", "Conexión", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Sin conexión" +e, "Conexión", JOptionPane.ERROR_MESSAGE);
            
        }
        return conectar;
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
