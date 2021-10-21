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
import modelo.Laboratorio;

/**
 *
 * @author briay
 */
public class LaboratorioNegocio {
    
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
    
    public void insertLaboratorio(Laboratorio record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public Laboratorio findById(int id) {
        this.init();
        Laboratorio rol = new Laboratorio();
        rol = (Laboratorio) ss.get(Laboratorio.class, id);
        this.push();
        return rol;
    }
    
    public void update(Laboratorio record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Laboratorio> findAll(){
        List<Laboratorio> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Laboratorio");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public Laboratorio findByName(String identification){
        Laboratorio us = new Laboratorio();
        this.init();
        Query query = ss.createQuery("FROM Laboratorio U WHERE U.nombreLaboratorio = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (Laboratorio) query.uniqueResult();
        this.push();
        return us;
    }
}
