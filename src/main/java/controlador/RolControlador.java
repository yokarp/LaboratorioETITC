/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Rol;
import negocio.RolNegocio;

/**
 *
 * @author briay
 */
public class RolControlador {
    
    private Rol rol = new Rol();
    private RolNegocio rolBuss = new RolNegocio();
    private String nameRol;
    
    public void creteRol(){
        Rol rolLocal = new Rol();
        try {
            rolLocal = rolBuss.findByNameRol(nameRol);
            if(rolLocal.getNombreRol() == "Admin"){
                //No se crea
            }else {
                rolBuss.insertRol(rol);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
    
}
