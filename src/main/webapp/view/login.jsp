<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <s:form action="redirectWelcome">
            <s:textfield id="user" name="user" label="Usuario"></s:textfield>
            <s:password id="pass" name="pass" label="Contraseña"></s:password>
            <s:submit value="LOGIN"></s:submit>
        </s:form>
    </body>
</html>
