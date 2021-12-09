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
                    <s:textfield type="number" name="usuario.idUsuario" placeholder="Identificación" cssClass="input"></s:textfield>
                    <s:textfield name="usuario.nombre" placeholder="Nombre" cssClass="input"></s:textfield>
                    <s:textfield name="usuario.apellido" placeholder="Apellido" cssClass="input"></s:textfield>
                    <s:textfield name="usuario.correo" placeholder="Correo" cssClass="input" required="required"></s:textfield>
                    <s:textfield name="usuario.celular" placeholder="Celular" cssClass="input"></s:textfield>
                    <s:password name="usuario.contrasena" placeholder="Contraseña" cssClass="input"></s:password>
                    <s:select  name ="usuario.activo" list = "{'Activo','Inactivo'}" cssClass="selectStatus"></s:select>
                    <s:textfield name="usuario.imagenUsuario" placeholder="Url imagen" cssClass="input"></s:textfield>
                    <s:textfield name="usuario.semestre" placeholder="Semestre" cssClass="input"></s:textfield>
                    <s:select name="idGrupoSelected" listKey="idGrupo" list="listGrupo" listValue="nombreGrupo" cssClass="selectStatus"></s:select>
                    <s:select name="idCarreraSelected" listKey="idCarrera" list="listCarrera" listValue="nombreCarrera" cssClass="selectStatus"></s:select>
                    <s:select name="idRol" list = "listRol" listKey="idRol" listValue="nombreRol" cssClass="selectStatus"></s:select>
                    <s:select name="usuario.formularioCovid" list = "{'Tengo vacuna covid','No estoy vacunado'}" cssClass="selectStatus"></s:select>
                    <s:submit value="CREAR USUARIO" style="width:98%" cssClass="buttonGreen"></s:submit>
                </s:form>
            </div>
        </div>
    </body>
</html>
