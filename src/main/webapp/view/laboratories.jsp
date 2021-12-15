<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorios</title>
        <link href="../global.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1 style="text-align: center">Laboratorios</h1>
        <s:iterator value="laboratorios.Laboratorio">
            <s:property value="nombreLaboratorio"/>
        </s:iterator>
    </body>
</html>
