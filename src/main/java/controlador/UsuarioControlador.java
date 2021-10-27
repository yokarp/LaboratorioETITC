/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
import negocio.UsuarioNegocio;

/**
 *
 * @author briay
 * JEE2 EJB
 */
public class UsuarioControlador {

    private Usuario usuario = new Usuario();
    private UsuarioNegocio usuarioBuss = new UsuarioNegocio();
    private List<Usuario> listUsuario = new ArrayList<>();
    private int id;

    public void createUser() {
        Usuario usLocal = new Usuario();
        try {
            usLocal = usuarioBuss.findById(id);
            if (usLocal.getIdUsuario() == 0) {
                usuarioBuss.insertUsuario(usuario);
            } else {
                //Error por pantalla
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }

}
