/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.examen.dao;

import pe.edu.upeu.examen.models.Usuario;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ACER
 */

public interface UsuarioDao {
    List<Usuario> readAll();
    int create(Usuario user);
    int update(Usuario user);
    Usuario read(int id);
    int delete(int id);
    List<Map<String, Object>> readAll2();
}
