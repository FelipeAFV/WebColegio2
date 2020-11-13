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
        <form method="get" action="AlumnoServlet">
            <input id="listarAlumnos" type="submit" name="accion" value="Listar Alumnos"></input>
     
            <input id="listarProfesores" type="submit" name="accion"  value="Listar Profesores"></input>

            <input id="listarNotas" type="submit"name="accion"  value="Listar Asignaturas"></input>
        </form>
       
    </body>
</html>
