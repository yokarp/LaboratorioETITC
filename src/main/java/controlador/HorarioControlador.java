/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Horario;
import negocio.HorarioNegocio;

/**
 *
 * @author briay
 */

public class HorarioControlador {
    
    private Horario horario = new Horario();
    private HorarioNegocio hrBuss = new HorarioNegocio();
    
    public void createHorario(){
        try {
            hrBuss.insertHorario(horario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
    
}
