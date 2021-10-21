/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import modelo.FormularioCovid;

/**
 *
 * @author briay
 */
public class FormularioCovidNegocio {
    
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
    
    public void insertFormularioCovid(FormularioCovid record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public FormularioCovid findById(int id) {
        this.init();
        FormularioCovid rol = new FormularioCovid();
        rol = (FormularioCovid) ss.get(FormularioCovid.class, id);
        this.push();
        return rol;
    }
    
    public void update(FormularioCovid record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<FormularioCovid> findAll(){
        List<FormularioCovid> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from FormularioCovid");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public FormularioCovid findByDate(Date identification){
        FormularioCovid us = new FormularioCovid();
        this.init();
        Query query = ss.createQuery("FROM FormularioCovid U WHERE U.fechaVacunacion = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (FormularioCovid) query.uniqueResult();
        this.push();
        return us;
    }
}
