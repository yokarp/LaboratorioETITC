/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import modelo.Usuario;
import negocio.UsuarioNegocio;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author briay
 */
public class LoginControlador extends ActionSupport implements SessionAware{

    private String user;
    private String pass;
    private String nombres;
    private String apellidos;
    private UsuarioNegocio usrBuss = new UsuarioNegocio();
    private Usuario selectedUsuario = new Usuario();
    private Map<String, String> sessionMap;

    
    public String execute() {
        if((!user.isEmpty()) && (!pass.isEmpty())){
            selectedUsuario = usrBuss.findByCredential(user, pass);
            this.sessionMap.put("login", "true");
            return SUCCESS;
        }else{
            return INPUT;
        }
        /*
        if (user.equals("admin")) {
            return SUCCESS;
        } else {
            return ERROR;
        }*/
    }    
    
    public void setSession(Map map){
        this.sessionMap = (SessionMap) map;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Usuario getSelectedUsuario() {
        return selectedUsuario;
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }    

}
