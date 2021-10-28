/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Laboratorio;
import negocio.LaboratorioNegocio;

/**
 *
 * @author briay
 */
public class LaboratorioControlador {
    
    private Laboratorio laboratorio = new Laboratorio();
    private LaboratorioNegocio laBuss = new LaboratorioNegocio();
    private String nameLabo;
    
    public void createLaboratorio(){
        Laboratorio labLocal = new Laboratorio();
        try { 
            Laboratorio Laboratorio = new Laboratorio();
            List<Laboratorio> listLaboratorio = new ArrayList<>();
            listLaboratorio = laBuss.findAll();
            for(Laboratorio u : listLaboratorio){
                System.out.println(u.toString());
            }
            /*
            Laboratorio Laboratorio = new Laboratorio();
            List<Laboratorio> listLaboratorio = new ArrayList<>();
            listLaboratorio = LaboratorioBuss.findAll();
            for(Laboratorio u : listLaboratorio){
            System.out.println(u.toString());
            }
        }
            */
            labLocal = laBuss.findByName(nameLabo);
            if(labLocal.getNombreLaboratorio() == ""){
                    
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        
    }
    
    
    /**
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
     **/
}
