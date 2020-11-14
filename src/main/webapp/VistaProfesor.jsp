<%-- 
    Document   : VistaProfesor
    Created on : 11-11-2020, 23:05:50
    Author     : samuel
--%>

<%@page import="modelo.ProfesorDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProfesorBBDD"%>
<%@page import="modelo.Conexion"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Profesor</title>
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
        <h1>Lista Profesores Sede</h1>
        <div>
            
            <table>
                <tr>
                    <th>ID</th>
                    <th>First_Name</th>
                    <th>Last_Name</th>
                </tr>
                <%
                    ProfesorBBDD p = new ProfesorBBDD();
                    List<ProfesorDTO> contenido = p.listar();
                    Iterator<ProfesorDTO> iterador = contenido.iterator();
                    ProfesorDTO prof = null;
                    while(iterador.hasNext()){
                        prof = iterador.next();
                %>
                <tr>
                    <td><%= prof.getId()%></td>
                    <td><%= prof.getName()%></td>
                    <td><%= prof.getLast_name()%></td>
                </tr>
                <%}%>
            </table>
            
            
        </div>
        
    </body>
</html>
