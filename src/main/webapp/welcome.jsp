<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
    </head>
    <body>
        <s:form>
            <s:label>Identificacion: </s:label>
            <s:property value="selectedUsuario.idUsuario"/>
            <s:label>Nombres: </s:label>
            <s:property value="selectedUsuario.nombre"/>
            <s:label>Apellidos: </s:label>
            <s:property value="selectedUsuario.apellido" />
        </s:form>
    </body>
</html>