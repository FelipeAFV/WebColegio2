<%-- 
    Document   : Vistaprofesorcheck
    Created on : 13-11-2020, 11:15:06
    Author     : samuel
--%>

<%@page import="modelo.ProfesorJoinDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.AlumnoDTO"%>
<%@page import="dao.ProfesorBBDD"%>
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
        <div>
            
            <table>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                </tr>
                <%
                    ProfesorBBDD p = new ProfesorBBDD();
                    List<ProfesorJoinDTO> contenido = p.listaralumnosasignatura(Integer.parseInt(request.getParameter("id")));
                    Iterator<ProfesorJoinDTO> iterador = contenido.iterator();
                    ProfesorJoinDTO as = null;
                    while(iterador.hasNext()){
                    as = iterador.next();
                %>
                <tr>
                    <td><%= as.getId_alumno()%></td>
                    <td><%= as.getNombre()%></td>
                    <td><%= as.getApellido()%></td>
                </tr>
                <%}%>
            </table>
            
            
        </div>
        
    </body>
</html>
