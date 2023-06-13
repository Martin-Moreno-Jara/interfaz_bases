/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.Conexion.getConexion;
import static conexion.Consultas.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Verificar {
        public static int currentUser=-1;
        public static String currentRol="";
        
    public static void setCerrarSesion(){
        currentUser=-1;
    }
    //LOGINS****************************************************************************************************************************************************
    public static int verificarLoginEstudiante(String correo,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_estudiante(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                currentUser=verify;
                currentRol="estudiante";
            }
            System.out.println(verify);
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    
    public static int verificarLoginProfesor(String correo,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_profesor(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                 currentUser=verify;
                 currentRol="profesor";
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    public static int verificarLoginEmpleado(String correo,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_empleado(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                 currentUser=verify;
                 currentRol="empleado";
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    public static int verificarLoginGrupo(String nom,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_grupo(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nom);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                 currentUser=verify;
                 currentRol="grupo";
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    
}
