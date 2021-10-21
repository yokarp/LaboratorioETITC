/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import modelo.Rol;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author briay
 */
public class RolNegocio {
    
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
    
    public void insertRol(Rol record){
        this.init();
        ss.save(record);
        this.push();
    }
    
     public Rol findById(int id) {
        this.init();
        Rol rol = new Rol();
        rol = (Rol) ss.get(Rol.class, id);
        this.push();
        return rol;
    }
     
    public void update(Rol record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Rol> findAll(){
        List<Rol> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Rol");
        lst = query.list();
        this.push();
        return lst;
    }
      
    public Rol findByNameRol(String identification){
        Rol us = new Rol();
        this.init();
        Query query = ss.createQuery("FROM Rol U WHERE U.nombreRol = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (Rol) query.uniqueResult();
        this.push();
        return us;
    }
    
}
