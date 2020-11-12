<%-- 
    Document   : Login
    Created on : 11-11-2020, 13:09:49
    Author     : f_fig
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inicio de sesión</h1>
        <form method="get" action="LoginServlet">
            
            <label>Usuario</label>
            <input name="usuario" type="text"></input></br>
            <label>Contraseña</label>
            <input name="contraseña" type="text"></input></br>
            

            <input type="radio" id="profesor" name="cargo" value="Profesor">
            <label for="profesor">Profesor</label><br>
            <input type="radio" id="alumno" name="cargo" value="Alumno">
            <label for="alumno">Alumno</label><br>
            <input type="radio" id="admin" name="cargo" value="Administrador">
            <label for="admin">Admin</label> 
            
            
            <input value="Ingresar" type="submit"></input></br>
        </form>
    </body>
</html>
