<%-- 
    Document   : Vistaporasignatura
    Created on : 12-11-2020, 19:56:11
    Author     : samuel
--%>

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
                </tr>
                <%
                    ProfesorBBDD p = new ProfesorBBDD();
                    List<AlumnoDTO> contenido = p.listaralumnosasignatura(1);
                    Iterator<AlumnoDTO> iterador = contenido.iterator();
                    AlumnoDTO as = null;
                    while(iterador.hasNext()){
                        as = iterador.next();
                %>
                <tr>
                    <td><%= as.getId()%></td>
                    
                </tr>
                <%}%>
            </table>
            
            
        </div>
        
    </body>
</html>
