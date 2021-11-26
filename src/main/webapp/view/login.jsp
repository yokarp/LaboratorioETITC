<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión</title>
        <link href="../global.css" rel="stylesheet" type="text/css">
    </head>
    <body class="bodyLogin">
        <div class="cardLogin">
            <img src="http://www.sapote.co/itc/wp-content/uploads/2016/11/etitc-logo-1.png" alt="logo" class="imgETITC"></img>
            <h2 class="text-center">INICIAR SESIÓN</h2>
            <div class="center">
                <s:form action="redirectWelcome">
                <s:textfield name="user" placeholder="Usuario" cssClass="input"></s:textfield>
                <s:password name="pass" placeholder="Contraseña" cssClass="input"></s:password>
                <s:fielderror fieldName="user"/>
                <s:submit value="INICIAR SESIÓN" style="width:98%" cssClass="buttonGreen"></s:submit>
                </s:form>
            </div>
            <div class="text-center" style="margin: 10px">
                <a href="createUser.jsp" class="green">Crear usuario</a>
            </div>
        </div>
    </body>
</html>
