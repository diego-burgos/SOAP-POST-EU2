/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examen.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Conexion {
    
    private static final String URL ="jdbc:postgresql://ec2-34-231-177-125.compute-1.amazonaws.com/df23irat9mnqan";
    private static final String  DRIVER ="org.postgresql.Driver";
    private static final String PASS="7975706b9e461093d670e076aeca63b6994bebd6e5913efdf482e8884b86375b";
    private static final String USER="tojkumbsajsihk";
    private static Connection cx = null;

    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
        return cx;
    }
    
}
