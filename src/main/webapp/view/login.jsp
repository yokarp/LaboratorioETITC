<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
    </head>
    <body style="background: radial-gradient(circle, rgba(158,189,19,1) 0%, rgba(0,133,82,1) 100%);">
        <div style="background-color: white; width: 20%; margin: 18% 0% 0% 40%; border-radius: 1em;">
            <img src="http://www.sapote.co/itc/wp-content/uploads/2016/11/etitc-logo-1.png" alt="logo" style="width: 60%; margin-left: 20%; margin-bottom: -7%;"></img>
            <h2 style="text-align: center" class="primary">INICIAR SESIÓN</h2>
            <div style="align-items: center;justify-content: center;display: flex;">
                <s:form action="redirectWelcome">
                <s:textfield name="user" placeholder="Usuario" style="text-align:center; border-radius: 0.5em; height: 25px;"></s:textfield>
                <s:password name="pass" placeholder="Contraseña" style="text-align:center; border-radius: 0.5em; height: 25px;"></s:password>
                <s:fielderror fieldName="user"/>
                <s:submit value="INICIAR SESIÓN" style="width:98%; background-color: green; border-radius:4em; color: white; height: 35px; font-weight: 800;"></s:submit>
                </s:form>
            </div>  
        </div>
    </body>
</html>
