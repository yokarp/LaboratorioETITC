/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Asignacion;
import negocio.AsignacionNegocio;

/**
 *
 * @author briay
 */
public class AsignacionControlador {
    
    private Asignacion asignacion = new Asignacion();
    private AsignacionNegocio asignacionBuss = new AsignacionNegocio();
    
    public void createAsignacion(){
        Asignacion asignacionLocal = new Asignacion();
        try {
            /*String fecha = "2021-10-21 14:00:00";
            SimpleDateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date date = fechaFormat.parse(fecha);
                asignacionLocal.getFechaAsiganacion() = asignacionBuss.findByDate(date);
                System.out.println(Asignacion.getIdAsignacion());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            asignacionLocal = asignacionBuss.findByDate(fecha);*/
            asignacionLocal = asignacionBuss.findByDate(asignacion.getFechaAsiganacion());
            if(asignacionLocal.getIdAsignacion() >= 1){
                //Ya existe la asignacion
            } else {
                //Asignación exitosa
                asignacionBuss.insertAsignacion(asignacion);
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
    
}
