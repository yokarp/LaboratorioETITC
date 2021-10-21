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
import modelo.Horario;

/**
 *
 * @author briay
 */
public class HorarioNegocio {
    
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
    
    public void insertHorario(Horario record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public Horario findById(int id) {
        this.init();
        Horario rol = new Horario();
        rol = (Horario) ss.get(Horario.class, id);
        this.push();
        return rol;
    }
    
    public void update(Horario record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Horario> findAll(){
        List<Horario> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Horario");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public Horario findByStartHour(String identification){
        Horario us = new Horario();
        this.init();
        Query query = ss.createQuery("FROM Horario U WHERE U.horaInicial = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (Horario) query.uniqueResult();
        this.push();
        return us;
    }
}
