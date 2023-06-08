/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bases.investigacion;

import bases.investigacion.interfaz.Login;
import conexion.Conexion;

/**
 *
 * @author Hexaw
 */
public class Investigacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Login login = new Login();
        Conexion.conectar();
            
        
    }
}
