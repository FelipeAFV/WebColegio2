<%-- 
    Document   : Vistaprofesornotas
    Created on : 13-11-2020, 00:17:07
    Author     : samuel
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.AsignaturaDTO"%>
<%@page import="java.util.List"%>
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
        <h1>Asignaturas Impartidas</h1>
        <div>
            
            <table>
                <tr>
                    <th>ID</th>
                    <th>Nombre_asignatura</th>
                    <th>Botones</th>
                </tr>
                <%
                    ProfesorBBDD p = new ProfesorBBDD();
                    List<AsignaturaDTO> contenido = p.listarasignaturas();
                    Iterator<AsignaturaDTO> iterador = contenido.iterator();
                    AsignaturaDTO as = null;
                    while(iterador.hasNext()){
                        as = iterador.next();
                %>
                <tr>
                    <td><%= as.getId()%></td>
                    <td><%= as.getNombre()%></td>
                    <td><a href="Menuprofserv?accion=gonota&id=<%=as.getId()%>">ir asignatura</a></td>
                </tr>
                <%}%>
            </table>
            
            
        </div>
        
    </body>
</html>
