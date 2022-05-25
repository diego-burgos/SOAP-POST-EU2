/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examen.ws;

import pe.edu.upeu.examen.dao.UsuarioDao;
import pe.edu.upeu.examen.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.examen.models.Usuario;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author ACER
 */
@WebService(serviceName = "UsuarioWebService")
public class UsuarioWebService {

    private UsuarioDao dao = new UsuarioDaoImpl();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "readAllUsuario")
    public List<Usuario> readAllUsuario() {
        return dao.readAll();
    }
}
