/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Grupo;
import negocio.GrupoNegocio;

/**
 *
 * @author briay
 */
public class GrupoControlador {
    
    private Grupo grupo = new Grupo();
    private GrupoNegocio grupoBuss = new GrupoNegocio();
    
    public void createGrupo(){
        Grupo grupoLocal = new Grupo();
        try {
            //grupoLocal = usuarioBuss.findById(id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
        
    
     /*
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

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }*/
    
}
