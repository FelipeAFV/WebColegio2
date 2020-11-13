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
        <style>
            label{
                display: inline-block;
                width: 80px;
            }
            div {
                margin: 10px;
            }
        </style>
    </head>
    <body>

        <h1>Inicio de sesión</h1>
        <form method="get" action="LoginServlet">
            <div>
            <label>Usuario</label>
            <input name="usuario" type="text"></input></br>
            </div>
            <div>
            <label>Contraseña</label>
            <input name="contrasena" type="password"></input></br>
            </div>
            
            <div>
            <input type="radio" id="profesor" name="cargo" value="Profesor">
            <label for="profesor">Profesor</label><br>
            <input type="radio" id="alumno" name="cargo" value="Alumno">
            <label for="alumno">Alumno</label><br>
            <input type="radio" id="admin" name="cargo" value="Administrador">
            <label for="admin">Administrador</label></br> 
            </div>

            <input value="Ingresar" type="submit"></input></br>
        </form>
    </body>
</html>
