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
import modelo.Usuario;

/**
 *
 * @author briay
 */
public class UsuarioNegocio {
    
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
    
    public void insertUsuario(Usuario record){
        this.init();
        ss.save(record);
        this.push();
    }
    
    public Usuario findById(int id) {
        this.init();
        Usuario rol = new Usuario();
        rol = (Usuario) ss.get(Usuario.class, id);
        this.push();
        return rol;
    }
    
    public void update(Usuario record){
        this.init();
        ss.update(record);
        this.push();
    }
    
    public List<Usuario> findAll(){
        List<Usuario> lst= new ArrayList<>();
        this.init(); //Select *
        Query query = ss.createQuery("from Usuario");
        lst = query.list();
        this.push();
        return lst;
    }
    
    public Usuario findByEmail(String identification){
        Usuario us = new Usuario();
        this.init();
        Query query = ss.createQuery("FROM Usuario U WHERE U.correo = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identification);
        us = (Usuario) query.uniqueResult();
        this.push();
        return us;
    }
    
}
