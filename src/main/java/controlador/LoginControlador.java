/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author briay
 */
public class LoginControlador extends ActionSupport {

    String user;
    String pass;

    @Override
    public String execute() {
        try {
            if (user.equals("admin") && pass.equals("1234")) {
                return SUCCESS;
            } else {
                return ERROR;
            }
        } catch (Exception ex) {
            System.out.println("Exception in" + ex.getMessage());
        }
        return ERROR;
    }

}
