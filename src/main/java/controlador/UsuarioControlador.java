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
 */
public class UsuarioControlador {
    
    Usuario usuario = new Usuario();
    UsuarioNegocio usuarioBuss = new UsuarioNegocio();
    List<Usuario> listUsuario = new ArrayList<>();
    
    public void createUser() {
        
        try {
            usuarioBuss.insertUsuario(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        
    }
    
}
