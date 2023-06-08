/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hexaw
 */
public class Conexion {
    private static Connection conexion;

    public static Connection getConexion() {
        return conexion;
    }
    private static String bd="investigacion";
    private static String user="root";
    private static String password="rraxxerr420";
    private static String host="localhost";
    private static String
            server="jdbc:mysql://"+host+"/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void conectar(){
        //conectar
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server,user,password);
            System.out.println("Conexion a base de datos "+server+" ... OK");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion con "+server+" ... FAIL");
        }
    }
    public static boolean conectarUsuario(String user,String contra){
        //conectar
        boolean ingresar=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server,user,contra);
            System.out.println("Conexion a base de datos "+server+" con usuario "+user+" ... OK");
            System.out.println("Conexión exitosa");
            ingresar=true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion: "+ex.toString());
        }
        return ingresar;
    }
    
    public static void desconectar(){
        //desconectar
        try {
            conexion.close();
            System.out.println("Cerrar conexion con "+server+" ... OK");
        } catch (SQLException ex) {
            System.out.println("Imposible cerrar conexion ... FAIL");
        }
    }
    public static void printTable(String table){
        //realizar consulta
        try {
// Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery ("select * from "+table+" where "+table+".est_cedula =2");
// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.

            while (rs.next())
            {
                System.out.println(
                        "ID: " +rs.getInt (1) +
                                "\tNombre: " + rs.getString (2)+
                                "\tTipo: " + rs.getString(3)+
                                "\tCosto: "+ rs.getInt(4)+
                                "\tExpo: " + rs.getString(5)
                );
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }
    }
    public static void createUser(String nombre,String contra){
        //realizar consulta
        try {
// Preparamos la consulta
            Statement s = conexion.createStatement();
           s.executeUpdate("CREATE USER '"+nombre+"'@'localhost' IDENTIFIED BY '"+contra+"'");
// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.

            System.out.println("usuario creado");
        } catch (SQLException ex) {
            System.out.println("No se ha podido crear el usuario: "+ex.toString());
        }
    }
   
    
}
