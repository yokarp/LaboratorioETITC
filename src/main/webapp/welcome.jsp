<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link href="../global.css" rel="stylesheet" type="text/css">
    </head>
    <body style="display: flex; flex-direction: row; margin: 0px;">
        <div class="panel">
            <img src="<s:property value="selectedUsuario.imagenUsuario"/>" style="width: 100px; border-radius: 0.2em; margin-top: 20px;"></img>
            <h4 style="margin: 2px">
                <s:property value="selectedUsuario.idUsuario"/><br/>
                <s:property value="selectedUsuario.nombre"/><br/>
                <s:property value="selectedUsuario.apellido"/><br/>
                <s:property value="selectedUsuario.correo"/><br/>
                <s:property value="selectedUsuario.celular"/><br/>
                <s:property value="selectedUsuario.carrera.nombreCarrera"/><br/>
                <s:property value="selectedUsuario.carrera.facultad"/><br/>
            </h4>
                <a href="../index.html"><button type="button" class="buttonBlue">Inicio</button></a>
                <!-- <button type="button" class="buttonBlue"> <a href="http://localhost:13602/LaboratoriosETITC/view/laboratories.jsp"/>Laborarorios</a></button>-->
                <button type="button" class="buttonBlue"> <a href="<s:url action="redirectLaboratories"/>" style="text-decoration: none; color: white;"/>Laborarorios</a></button>
                <button type="button" class="buttonBlue">Solicitud laboratorio</button>
                <button type="button" class="buttonBlue">Historial</button>
                <a href="https://etitc.edu.co/archives/res1332018.pdf" target="_blank"><button type="button" class="buttonBlue">Reglas</button></a>
            <div style="margin-top: 45vh;">
                <button type="button" class="buttonRed"><a htref="/.exitSession">Salir</a></button>
            </div>
           
        <%--<s:form style="display: flex; flex-direction: column; background-color: blue;">
            <s:label>Identificacion: </s:label>
            <s:property value="selectedUsuario.idUsuario"/>
            <s:label>Nombres: </s:label>
            <s:property value="selectedUsuario.nombre"/>
            <s:label>Apellidos: </s:label>
            <s:property value="selectedUsuario.apellido"/>
        </s:form>
        --%>
        </div>
        <div class="dashboard">
            <img src="http://www.sapote.co/itc/wp-content/uploads/2016/11/etitc-logo-1.png" alt="logo" class="imagenD"></img>
            <h2 class="text-center">Bienvenido a la seleccion de laboratorios <br/>
            <p>
                La institución actualmente entra en el área de la investigación y requiere laboratorios idóneos y
                con tecnología de punta para llevar a cabo esta tarea, la cual entra a llevar a cabo. 
                Las directivas en su plan de desarrollo tiene como objetivo impulsar la creación de nuevos 
                laboratorios acordes con las necesidades académicas institucionales.
            </p>
            </h2>
            <div>
                <img src="https://www.etitc.edu.co/uploads/images/products/60a69e8531033505552102.jpeg" class="imagenT">
            </div>
           
        </div>
       
    </body>
</html>