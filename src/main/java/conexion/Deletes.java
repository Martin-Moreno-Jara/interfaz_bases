/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.Conexion.getConexion;
import static conexion.Inserts.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hexaw
 */
public class Deletes {
    static Connection conexion = Conexion.getConexion();
    
    public static void eliminarProyecto(String nombre){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL eliminarProyecto(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nombre);

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Proyecto eliminado exitosamente");
          
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    public static void eliminarPublicacion(String nombre){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL eliminarPaperPorNombre(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nombre);

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Publicación eliminada exitosamente");
          
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
}
