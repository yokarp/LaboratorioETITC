/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.FormularioCovid;
import negocio.FormularioCovidNegocio;

/**
 *
 * @author briay
 */
public class FormularioCovidControlador {
    
    private FormularioCovid fc = new FormularioCovid();
    private FormularioCovidNegocio fcBuss = new FormularioCovidNegocio();
    
    public void creteFormularioCovid(){
        try {
            fcBuss.insertFormularioCovid(fc);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
    
}
