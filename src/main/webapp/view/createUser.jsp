<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear usuario</title>
        <link href="../global.css" rel="stylesheet" type="text/css">
    </head>
    <body class="bodyLogin">
        <div class="cardLogin" style="margin-top: 8%">
            <img src="http://www.sapote.co/itc/wp-content/uploads/2016/11/etitc-logo-1.png" alt="logo" class="imgETITC"></img>
            <h2 class="text-center">CREAR USUARIO</h2>
            <div class="center">
                <s:form action="createUser">
                    <s:textfield type="number" name="usuario.idUsuario" placeholder="Identificación" cssClass="input" label="Documento"></s:textfield>
                    <s:textfield name="usuario.nombre" placeholder="Nombre" cssClass="input" label="Nombre"></s:textfield>
                    <s:textfield name="usuario.apellido" placeholder="Apellido" cssClass="input" label="Apellido"></s:textfield>
                    <s:textfield name="usuario.correo" placeholder="ejemplo@itc.edu.co" cssClass="input" required="required" label="Correo electrónico"></s:textfield>
                    <s:textfield name="usuario.celular" placeholder="Celular" cssClass="input" label="Número celular"></s:textfield>
                    <s:password name="usuario.contrasena" placeholder="Contraseña" cssClass="input" label="Constraseña segura"></s:password>
                    <s:select name="idActive" list = "listActive" listKey="idActive" cssClass="selectStatus" label="Activo: (1) Sí (0) No"></s:select>
                    <s:textfield name="usuario.imagenUsuario" placeholder="http://imagen.png" cssClass="input" label="Url imagen"></s:textfield>
                    <s:textfield name="usuario.semestre" placeholder="Semestre" cssClass="input" label="Semestre cursante"></s:textfield>
                    <s:select name="idGrupoSelected" listKey="idGrupo" list="listGrupo" listValue="nombreGrupo" cssClass="selectStatus" label="Grupo que pertenece"></s:select>
                    <s:select name="idCarreraSelected" listKey="idCarrera" list="listCarrera" listValue="nombreCarrera" cssClass="selectStatus" label="Carrera cursante"></s:select>  
                    <s:select name="idRol" list = "listRol" listKey="idRol" listValue="nombreRol" cssClass="selectStatus" label="Rol que representa"></s:select>
                    <s:select name="idFc" list = "listCovid" listKey="idFc" listValue="estadoCovid" cssClass="selectStatus" label="Covid: (1) Sí (0) No"></s:select>
                    <s:submit value="CREAR USUARIO" style="width:98%" cssClass="buttonGreen"></s:submit>
                </s:form>
            </div>
        </div>
    </body>
</html>
