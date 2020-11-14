<%-- 
    Document   : addAsig
    Created on : 13-11-2020, 20:56:56
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head>
    <body>
        <div>
            <h1> Agregar nueva asignatura</h1>
            <form action="AsignaturaServlet"> 
                    Nivel ID: <br>
                    <input type="text" name="txtNivelId"><br>
                    Profesor ID <br>
                    <input type="text" name="txtProfesorId"><br>
                    Nombre  <br>
                    <input type="text" name="txtNombre"><br>
                    <input type="submit" name="action" value="Agregar"><br>   
                </form>

        </div>
    </body>
</html>
