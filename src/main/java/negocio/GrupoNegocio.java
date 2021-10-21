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
import modelo.Grupo;
/**
 *
 * @author briay
 */
public class GrupoNegocio {
    
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
    
    public void insertGrupo(Grupo record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public Grupo findById(int id) {
        this.init();
        Grupo rol = new Grupo();
        rol = (Grupo) ss.get(Grupo.class, id);
        this.push();
        return rol;
    }
    
    public void update(Grupo record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Grupo> findAll(){
        List<Grupo> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Grupo");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public Grupo findByResponsable(String identification){
        Grupo us = new Grupo();
        this.init();
        Query query = ss.createQuery("FROM Grupo U WHERE U.responsable = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (Grupo) query.uniqueResult();
        this.push();
        return us;
    }
    
}
