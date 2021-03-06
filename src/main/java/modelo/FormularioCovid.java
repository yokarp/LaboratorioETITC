package modelo;
// Generated 11/10/2021 11:04:01 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FormularioCovid generated by hbm2java
 */
public class FormularioCovid  implements java.io.Serializable {


     private Integer idFc;
     private byte estadoCovid;
     private Date fechaVacunacion;
     private Set usuarios = new HashSet(0);

    public FormularioCovid() {
    }

	
    public FormularioCovid(byte estadoCovid) {
        this.estadoCovid = estadoCovid;
    }
    
    public FormularioCovid(byte estadoCovid, Date fechaVacunacion, Set usuarios) {
       this.estadoCovid = estadoCovid;
       this.fechaVacunacion = fechaVacunacion;
       this.usuarios = usuarios;
    }
    
    public FormularioCovid(byte estadoCovid, Date fechaVacunacion) {
       this.estadoCovid = estadoCovid;
       this.fechaVacunacion = fechaVacunacion;
    }
   
    public Integer getIdFc() {
        return this.idFc;
    }
    
    public void setIdFc(Integer idFc) {
        this.idFc = idFc;
    }
    public byte getEstadoCovid() {
        return this.estadoCovid;
    }
    
    public void setEstadoCovid(byte estadoCovid) {
        this.estadoCovid = estadoCovid;
    }
    public Date getFechaVacunacion() {
        return this.fechaVacunacion;
    }
    
    public void setFechaVacunacion(Date fechaVacunacion) {
        this.fechaVacunacion = fechaVacunacion;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    //Dummy | + ", usuarios=" + usuarios |
    @Override
    public String toString() {
        return "FormularioCovid{" + "idFc=" + idFc + ", estadoCovid=" + estadoCovid + ", fechaVacunacion=" + fechaVacunacion + '}';
    }




}


