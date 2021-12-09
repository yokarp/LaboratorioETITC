/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import modelo.Horario;
import negocio.HorarioNegocio;
import org.apache.struts2.ServletActionContext;
import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 *
 * @author briay
 */
public class HorarioControlador extends ActionSupport {

    private Horario horario = new Horario();
    private HorarioNegocio hrBuss = new HorarioNegocio();

    public String execute() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String ss = (String) session.getAttribute("login");
        if (ss != null && !ss.equals("")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public void createHorario() {
        try {
            hrBuss.insertHorario(horario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }

}
