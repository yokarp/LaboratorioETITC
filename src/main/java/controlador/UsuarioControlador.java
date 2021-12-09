/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;
import modelo.Grupo;
import modelo.Rol;
import modelo.Usuario;
import negocio.CarreraNegocio;
import negocio.GrupoNegocio;
import negocio.RolNegocio;
import negocio.UsuarioNegocio;

/**
 *
 * @author briay JEE2 EJB
 */
public class UsuarioControlador extends ActionSupport{

    private Usuario usuario = new Usuario();
    private UsuarioNegocio usuarioBuss = new UsuarioNegocio();
    private List<Usuario> listUsuario = new ArrayList<>();
    private List <Rol> listRol = new ArrayList<>();
    private RolNegocio rolBuss = new RolNegocio();
    private int id;
    private int idRol;
    private int idGrupoSelected;
    private List <Grupo> listGrupo = new ArrayList<>();
    private GrupoNegocio grupoBuss = new GrupoNegocio();
    private int idCarreraSelected;
    private List <Carrera> listCarrera = new ArrayList<>();
    private CarreraNegocio carreraBuss = new CarreraNegocio();
    
    Integer valorVerdadero = new Integer(1);
    Integer valorFalso = new Integer(0);
    //byte b = valor.byteValue();
    
    @Override
    public String execute(){
        this.listRol = this.rolBuss.findAll();
        this.listGrupo = this.grupoBuss.findAll();
        this.listCarrera = this.carreraBuss.findAll();
        return SUCCESS;
    }

    public String createUserStudent() {
        System.out.println(id);
        Usuario usLocal = new Usuario();
        try {
            usLocal = usuarioBuss.findById(id);
            if (usLocal == null) {
                this.usuario.setRol(this.rolBuss.findById(idRol));
                this.usuario.setGrupo(this.grupoBuss.findById(idGrupoSelected));
                this.usuario.setCarrera(this.carreraBuss.findById(idCarreraSelected));
                usuarioBuss.insertUsuario(usuario);
                System.out.println(usuario);
                return SUCCESS;
            } else {
                return ERROR;
                //Error por pantalla
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
        return ERROR;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public List<Rol> getListRol() {        
        return this.listRol;
    }

    public void setListRol(List<Rol> listRol) {
        this.listRol = listRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdGrupoSelected() {
        return idGrupoSelected;
    }

    public void setIdGrupoSelected(int idGrupoSelected) {
        this.idGrupoSelected = idGrupoSelected;
    }

    public List<Grupo> getListGrupo() {
        return listGrupo;
    }

    public void setListGrupo(List<Grupo> listGrupo) {
        this.listGrupo = listGrupo;
    }

    public List<Carrera> getListCarrera() {
        return listCarrera;
    }

    public void setListCarrera(List<Carrera> listCarrera) {
        this.listCarrera = listCarrera;
    }

    public int getIdCarreraSelected() {
        return idCarreraSelected;
    }

    public void setIdCarreraSelected(int idCarreraSelected) {
        this.idCarreraSelected = idCarreraSelected;
    }

    public CarreraNegocio getCarreraBuss() {
        return carreraBuss;
    }

    public void setCarreraBuss(CarreraNegocio carreraBuss) {
        this.carreraBuss = carreraBuss;
    }

}
