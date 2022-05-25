/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examen.models;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author ACER
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuario {
    private int estado;
    private int idusuario;
    private String username;
    private String password;
    private int idpersona;
    private int idrol;
    private String fecha;
}
