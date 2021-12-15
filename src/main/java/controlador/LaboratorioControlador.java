/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import modelo.Laboratorio;
import negocio.LaboratorioNegocio;

/**
 *
 * @author briay
 */
public class LaboratorioControlador {
    
    
    private List<Laboratorio> laboratorios = new ArrayList<>();
    private LaboratorioNegocio laBuss = new LaboratorioNegocio();
    private String nameLabo;
    
     public String execute() {
        laboratorios = laBuss.findAll();
        System.out.println(laboratorios);
        System.out.println();
        return SUCCESS;
    }
     
    public LaboratorioControlador() {
        System.out.println("Hola mundo constructor");
    }
     
    
    public void createLaboratorio(){
        /*Laboratorio labLocal = new Laboratorio();
        try {
            List<Laboratorio> listLaboratorio = new ArrayList<>();
            listLaboratorio = laBuss.findAll();
            Stack<String> names = new Stack<String>();
            
            for(Laboratorio u : listLaboratorio){
                names.push(u.getNombreLaboratorio());
            }
            
            labLocal = laBuss.findByName(nameLabo);
            
            for(String name:names){
                if(name != labLocal.getNombreLaboratorio()){
                    //Crear laboratorio
                    laBuss.insertLaboratorio(laboratorio);
                }else{
                    //Error por pantalla
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }*/
        
    }
    
}
