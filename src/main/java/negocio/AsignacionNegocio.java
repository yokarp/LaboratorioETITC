/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import modelo.Asignacion;

/**
 *
 * @author briay
 */
public class AsignacionNegocio {
    
    private SessionFactory sf = HibernateUtil.getSessionFactory();
    private Session ss = sf.openSession();
    private Transaction tst = ss.beginTransaction();

    private void init() {
        sf = HibernateUtil.getSessionFactory();
        ss = sf.openSession();
        tst = ss.beginTransaction();
    }
    
    private void push(){
        ss.flush();
        tst.commit();
        ss.close();   
    }
    
    public void insertAsignacion(Asignacion record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public Asignacion findById(int id) {
        this.init();
        Asignacion rol = new Asignacion();
        rol = (Asignacion) ss.get(Asignacion.class, id);
        this.push();
        return rol;
    }
    
    public void update(Asignacion record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Asignacion> findAll(){
        List<Asignacion> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Asignacion");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public Asignacion findByDate(Date fecha){
        Asignacion us = new Asignacion();
        this.init();
        Query query = ss.createQuery("FROM Asignacion U WHERE U.fechaAsiganacion = :date");
        query.setParameter("date", fecha);
        us = (Asignacion) query.uniqueResult();
        this.push();
        return us;
    }
    
}
