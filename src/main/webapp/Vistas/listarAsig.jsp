<%-- 
    Document   : listarAsig
    Created on : 13-11-2020, 20:41:59
    Author     : jvarg
--%>

<%@page import="java.util.List"%>
<%@page import="dao.AdminBBDD"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.AsignaturaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Asignaturas</h1>
            <a href="AsignaturaServlet?action=addAsig">Agregar nueva asignatura</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nivel ID</th>
                        <th>Profesor ID</th>
                        <th>Nombre</th>
                        <th>Botones</th>
                    </tr>
                </thead>
                <% 
                    AdminBBDD asigDao = new AdminBBDD();
                    List<AsignaturaDTO>list= asigDao.listar();
                    Iterator<AsignaturaDTO> i = list.iterator();
                    AsignaturaDTO asig = null;
                    while(i.hasNext()) {
                        asig=i.next();
                    
                
                %>
                <tbody>
                    <tr>
                        <td><%=asig.getId()%></td>
                        <td><%=asig.getNivel_id()%></td>
                        <td><%=asig.getProfesor_id()%></td>
                        <td><%=asig.getNombre()%></td>
                    
                        <td>
                            <a href="AsignaturaServlet?action=modificar&id=<%= asig.getId()%>">Modificar</a>
                            <a href="AsignaturaServlet?action=eliminar&id=<%= asig.getId()%>">Eliminar</a>
                            
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
