import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Stack;
import modelo.Asignacion;
import modelo.Carrera;
import modelo.FormularioCovid;
import modelo.Grupo;
import modelo.Horario;
import modelo.Laboratorio;
import modelo.Rol;
import modelo.Usuario;
import negocio.AsignacionNegocio;
import negocio.CarreraNegocio;
import negocio.FormularioCovidNegocio;
import negocio.GrupoNegocio;
import negocio.HorarioNegocio;
import negocio.LaboratorioNegocio;
import negocio.RolNegocio;
import negocio.UsuarioNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author briay
 */
public class Main {
    
       public static void main(String[] args) {
         
        //ROL
        RolNegocio rolBuss = new RolNegocio();
        //Insert
        /*Rol rol = new Rol(2, "Docente");
        rolBuss.insertRol(rol);
        System.out.println("Registro rol exitoso");*/
        
        //Return and change field
        /*Rol rol = new Rol();
        rol = rolBuss.findById(1);
        System.out.println(rol.toString());
        rol.setNombreRol("Estudiante");
        rolBuss.update(rol);
        System.out.println(rol.toString());*/
        
        //Return all
        /*Rol rol = new Rol();
        List<Rol> listRol = new ArrayList<>();
        listRol = rolBuss.findAll();
        for(Rol u : listRol){
            System.out.println(u.toString());
        }*/
        
        //Search for name rol
        Rol rol = new Rol();
        rol = rolBuss.findByNameRol("Admin");
        System.out.println(rol.toString());
        
        //CARRERA
        CarreraNegocio carreraBuss = new CarreraNegocio();
        
        //Insert
        /*Carrera carrera = new Carrera("Ingenieria Mecatronica", "Mecatronica");
        carreraBuss.insertCarrera(carrera);
        System.out.println("Registro carrera exitoso");*/
        
        //Return and change field
        /*Carrera carrera = new Carrera();
        carrera = carreraBuss.findById(1);
        System.out.println(carrera.toString());
        carrera.setNombreCarrera("Ingenieria de sistemas");
        carreraBuss.update(carrera);
        System.out.println(carrera.toString());*/
        
        //Return all
        /*Carrera carrera = new Carrera();
        List<Carrera> listCarrera = new ArrayList<>();
        listCarrera = carreraBuss.findAll();
        for(Carrera u : listCarrera){
            System.out.println(u.toString());
        }*/
        
        //Search for name faculty
        /*Carrera carrera = new Carrera();
        carrera = carreraBuss.findByFaculty("Sistemas");
        System.out.println(carrera.toString());*/
        
        
        //GRUPO
        GrupoNegocio grupoBuss = new GrupoNegocio();
        
        //Insert
        /*Grupo grupo = new Grupo("Los peores", 4, "Cristian Roduiguez");
        grupoBuss.insertGrupo(grupo);
        System.out.println("Registro grupo exitoso");*/
        
        //Return and change field
        /*Grupo grupo = new Grupo();
        grupo = grupoBuss.findById(1);
        System.out.println(grupo.toString());
        grupo.setResponsable("Enrrique Caballero");
        grupoBuss.update(grupo);
        System.out.println(grupo.toString());*/
        
        //Return all
        /*Grupo grupo = new Grupo();
        List<Grupo> listGrupo = new ArrayList<>();
        listGrupo = grupoBuss.findAll();
        for(Grupo u : listGrupo){
            System.out.println(u.toString());
        }*/
        
        //Search for name resposable
        /*try{
            Grupo grupo = new Grupo();
            grupo = grupoBuss.findBynameGroup("S7R");
            System.out.println("Paso");
        }catch(Exception e){
            //System.out.println(e.getMessage());
            //System.out.println(e.getCause());
            System.out.println("Fallo");
        }*/
        //System.out.println(grupo.getIdGrupo());
        
        //FormularioCovid
        FormularioCovidNegocio FormularioCovidBuss = new FormularioCovidNegocio();
        Integer valor = new Integer(1);
        byte b = valor.byteValue();
        
        //Insert
        /*Integer valor = new Integer(1);
        byte b = valor.byteValue();
        Date fecha = new Date();
        FormularioCovid FormularioCovid = new FormularioCovid(b, fecha);
        FormularioCovidBuss.insertFormularioCovid(FormularioCovid);
        System.out.println("Registro FormularioCovid exitoso");*/
        
        //Return and change field
        /*FormularioCovid FormularioCovid = new FormularioCovid();
        FormularioCovid = FormularioCovidBuss.findById(1);
        System.out.println(FormularioCovid.toString());
        FormularioCovid.setEstadoCovid(b);
        FormularioCovidBuss.update(FormularioCovid);
        System.out.println(FormularioCovid.toString());*/
        
        //Return all
        /*FormularioCovid FormularioCovid = new FormularioCovid();
        List<FormularioCovid> listFormularioCovid = new ArrayList<>();
        listFormularioCovid = FormularioCovidBuss.findAll();
        for(FormularioCovid u : listFormularioCovid){
            System.out.println(u.toString());
        }*/
        
        //Search for Date
        /*Date fecha = new Date();
        FormularioCovid FormularioCovid = new FormularioCovid();
        FormularioCovid = FormularioCovidBuss.findByDate(fecha);
        System.out.println(FormularioCovid.toString());*/
        
        
        //Horario
        HorarioNegocio HorarioBuss = new HorarioNegocio();
        
        //Insert
        /*Horario Horario = new Horario("18:00", "20:00", "[0,1,1,1,1,1,0]");
        HorarioBuss.insertHorario(Horario);
        System.out.println("Registro Horario exitoso");*/
        
        //Return and change field
        /*Horario Horario = new Horario();
        Horario = HorarioBuss.findById(1);
        System.out.println(Horario.toString());
        Horario.setHoraInicial("13:00");
        HorarioBuss.update(Horario);
        System.out.println(Horario.toString());*/
        
        //Return all
        /*Horario Horario = new Horario();
        List<Horario> listHorario = new ArrayList<>();
        listHorario = HorarioBuss.findAll();
        for(Horario u : listHorario){
            System.out.println(u.toString());
        }*/
        
        //Search for start hour
        /*Horario Horario = new Horario();
        Horario = HorarioBuss.findByStartHour("13:00");
        System.out.println(Horario.toString());*/
        
        
        //Laboratorio
        LaboratorioNegocio LaboratorioBuss = new LaboratorioNegocio();
        
        //Insert
        /*Horario horario = new Horario();
        horario = HorarioBuss.findById(2);
        Laboratorio Laboratorio = new Laboratorio(3, horario, "Pailis", "Pailis", "No", b);
        LaboratorioBuss.insertLaboratorio(Laboratorio);
        System.out.println("Registro Laboratorio exitoso");*/
        
        //Return and change field
        /*Laboratorio laboratorio = new Laboratorio();
        laboratorio = LaboratorioBuss.findById(1);
        System.out.println(laboratorio.toString());
        laboratorio.setDescripcionLaboratorio("La chingadas");
        LaboratorioBuss.update(laboratorio);
        System.out.println(laboratorio.toString());*/
        
        //Return all
        Laboratorio Laboratorio = new Laboratorio();
        List<Laboratorio> listLaboratorio = new ArrayList<>();
        listLaboratorio = LaboratorioBuss.findAll();
        Stack<String> names = new Stack<String>();
        for(Laboratorio u : listLaboratorio){
            System.out.println(u.toString());
            names.push(u.getNombreLaboratorio());
        }
        System.out.println(names);
        
        //Search for enabled
        /*Laboratorio Laboratorio = new Laboratorio();
        Laboratorio = LaboratorioBuss.findByName("Pailis");
        System.out.println(Laboratorio.toString());*/
        
        
        //Asignacion
        AsignacionNegocio AsignacionBuss = new AsignacionNegocio();
        
        //Insert
        /*Grupo grupo = new Grupo();
        grupo = grupoBuss.findById(1);
        Laboratorio laboratorio = new Laboratorio();
        laboratorio = LaboratorioBuss.findById(1);
        Date fechaAsignacion = new Date();
        Asignacion Asignacion = new Asignacion(grupo, laboratorio, fechaAsignacion);
        AsignacionBuss.insertAsignacion(Asignacion);
        System.out.println("Registro Asignacion exitoso");*/
        
        //Return and change field
        /*Grupo grupo = new Grupo();
        grupo = grupoBuss.findById(2);
        Asignacion Asignacion = new Asignacion();
        Asignacion = AsignacionBuss.findById(1);
        System.out.println(Asignacion.toString());
        Asignacion.setGrupo(grupo);
        AsignacionBuss.update(Asignacion);
        System.out.println(Asignacion.toString());*/
        
        
        
        
        
        
        //Return all
        /*Asignacion Asignacion = new Asignacion();
        List<Asignacion> listAsignacion = new ArrayList<>();
        listAsignacion = AsignacionBuss.findAll();
        for(Asignacion u : listAsignacion){
            System.out.println(u.toString());
        }*/
        
        //Search for date
        Asignacion Asignacion = new Asignacion();
        
        /*String fecha = "2021-10-21 14:00:00";
        SimpleDateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            {
            try {
                Date date = fechaFormat.parse(fecha);
                Asignacion = AsignacionBuss.findByDate(date);
                System.out.println(Asignacion.getIdAsignacion());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }*/
        
        
        //Usuario
        UsuarioNegocio UsuarioBuss = new UsuarioNegocio();
        
        //Insert
        /*Carrera carrera = new Carrera();
        carrera = carreraBuss.findById(1);
        FormularioCovid formularioCovid = new FormularioCovid();
        formularioCovid = FormularioCovidBuss.findById(1);
        Grupo grupo = new Grupo();
        grupo = grupoBuss.findById(2);
        Rol rol = new Rol();
        rol = rolBuss.findById(1);
        Usuario Usuario = new Usuario(1019141498, carrera, formularioCovid, grupo, rol,
                "Johan", "Sogamoso", "jasogamosoc@itc.edu.co", "3123811528", "123456", b, "no", 7);
        UsuarioBuss.insertUsuario(Usuario);
        System.out.println("Registro Usuario exitoso");*/
        
        //Return and change field
        /*Usuario Usuario = new Usuario();
        Usuario = UsuarioBuss.findById(1019141498);
        System.out.println(Usuario.getApellido());*/
        /*Usuario.setApellido("Rojas");
        UsuarioBuss.update(Usuario);
        System.out.println(Usuario.toString());*/
        
        //Return all
        /*Usuario Usuario = new Usuario();
        List<Usuario> listUsuario = new ArrayList<>();
        listUsuario = UsuarioBuss.findByGroup(1);
        for(Usuario u : listUsuario){
            System.out.println(u.toString());
        }*/
        
        //Search for email
        /*Usuario Usuario = new Usuario();
        Usuario = UsuarioBuss.findByEmail("bfrojasg@itc.edu.co");
        System.out.println(Usuario.toString());*/
        
        
        /*
        Integer valor = new Integer(1);
        byte b = valor.byteValue();
        Usuario usuario = new Usuario(1030657289, 1, 1, 1, 1, "Brian", "Rojas", "bfrojasg@itc.edu.co", "3197194914", "123456", b, "https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_960_720.png", 1);
        UsuarioNegocio userBuss = new UsuarioNegocio();
        userBuss.insertUsuario(usuario);
        System.out.println("Registro exitoso");
        Usuario usuario = new Usuario();
        usuario = userBuss.findById(2);
        System.out.println(usuario.toString());
        usuario.setNombre("JUAN ROBERTO");
        userBuss.update(usuario);
        usuario = userBuss.findById(2);
        System.out.println(usuario.toString());
        System.out.println("Registro exitoso");
        */
    }
  
}
