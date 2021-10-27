/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Carrera;
import negocio.CarreraNegocio;

/**
 *
 * @author briay
 */
public class CarerraControlador {
    
    private Carrera carrera = new Carrera();
    private CarreraNegocio carreraBuss = new CarreraNegocio();
    private String carreraNew;
    
    public void createCarrera(){
        Carrera carreraComparacion = new Carrera();
        try{
            carreraComparacion = carreraBuss.findByFaculty(carreraNew);
            if(carreraComparacion.getFacultad() == carrera.getFacultad()){
                //Procedemos a crearlo
                carreraBuss.insertCarrera(carrera);
            }else{
                //Error por pantalla
            }
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
    
}
