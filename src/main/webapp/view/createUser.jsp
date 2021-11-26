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
                <s:form action="redirectWelcome">
                <s:textfield type="number" name="id" placeholder="Identificación" cssClass="input"></s:textfield>
                <s:textfield name="name" placeholder="Nombre" cssClass="input"></s:textfield>
                <s:textfield name="last_name" placeholder="Apellido" cssClass="input"></s:textfield>
                <s:textfield name="email" placeholder="Correo" cssClass="input" required="required"></s:textfield>
                <s:textfield name="phone" placeholder="Celular" cssClass="input"></s:textfield>
                <s:password name="pass" placeholder="Contraseña" cssClass="input"></s:password>
                <s:select name = "status" list = "{'Activo','Inactivo'}" cssClass="selectStatus"></s:select>
                <s:textfield name="img" placeholder="Url imagen" cssClass="input"></s:textfield>
                <s:textfield name="semester" placeholder="Semestre" cssClass="input"></s:textfield>
                <s:textfield name="team" placeholder="Grupo" cssClass="input"></s:textfield>
                <s:textfield name="carrera" placeholder="Carrera" cssClass="input"></s:textfield>
                <s:select name="rol" list = "{'Estudiante','Docente'}" cssClass="selectStatus"></s:select>
                <s:select name="rol" list = "{'Tengo vacuna covid','No estoy vacunado'}" cssClass="selectStatus"></s:select>
                <s:fielderror fieldName="user"/>
                <s:submit value="CREAR USUARIO" style="width:98%" cssClass="buttonGreen"></s:submit>
                </s:form>
            </div>
        </div>
    </body>
</html>
