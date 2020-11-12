<%-- 
    Document   : VistaAlumno
    Created on : 10-11-2020, 21:19:47
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
        <h1>Sistema alumno</h1>
        <form method="get" action="ListarAlumnoServlet">
            <input id="listarAlumnos" type="submit" value="Listar Alumnos"></input>
        </form>
        </br>
        <form method="get" action="ListarProfesoresServlet">
            <input id="listarProfesores" type="submit" value="Listar Profesores"></input>
        </form>
        </br>
        <form method="get" action="ListarNotasServlet">
            <input id="listarNotas" type="submit" value="Listar Notas"></input>
        </form>
    </body>
</html>
