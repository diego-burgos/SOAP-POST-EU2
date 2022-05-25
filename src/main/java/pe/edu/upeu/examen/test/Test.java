/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.examen.test;

import com.google.gson.Gson;
import pe.edu.upeu.examen.config.Conexion;
import pe.edu.upeu.examen.dao.UsuarioDao;
import pe.edu.upeu.examen.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author ACER
 */
public class Test {
    static Gson gson = new Gson();
    static UsuarioDao u = new UsuarioDaoImpl(); 
    public static void main(String[] args) {
        if (Conexion.getConex() != null) {
            System.out.println("conectado");
        } else {
            System.out.println("error");
        }
        System.out.println(gson.toJson(u.readAll2()));
    }
}
