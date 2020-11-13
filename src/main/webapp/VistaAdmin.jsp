<%-- 
    Document   : VistaAdmin
    Created on : 13-11-2020, 20:08:34
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Administrador</title>
        <style>
      table,
      td,
      th {
        padding: 10px;
        border: 2px solid #1c87c9;
        border-radius: 5px;
        background-color: #e5e5e5;
        text-align: center;
      }
    </style>
    </head>
    <body>
        <div>
            <a href="ProfesorServlet?accion=listar">Listar Profesores</a> 
            <a href="ProfesorServlet?accion=listarA">Listar Alumnos</a>
            <a href="AsignaturaServlet?accion=listAsig">Listar Asignatura</a>
        </div>
    </body>
</html>
