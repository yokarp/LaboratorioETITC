/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import modelo.Carrera;

/**
 *
 * @author briay
 */
public class CarreraNegocio {
    
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
    
    public void insertCarrera(Carrera record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public Carrera findById(int id) {
        this.init();
        Carrera rol = new Carrera();
        rol = (Carrera) ss.get(Carrera.class, id);
        this.push();
        return rol;
    }
    
    public void update(Carrera record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Carrera> findAll(){
        List<Carrera> lst = new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Carrera");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public Carrera findByFaculty(String identification){
        Carrera us = new Carrera();
        this.init();
        Query query = ss.createQuery("FROM Carrera U WHERE U.facultad = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (Carrera) query.uniqueResult();
        this.push();
        return us;
    }
    
}
