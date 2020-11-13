<%-- 
    Document   : listar
    Created on : 12-11-2020, 10:03:38
    Author     : jvarg
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.ProfesorDTO"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProfesorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Profesores</h1>
            <a href="ProfesorServlet?accion=add">Agregar nuevo profesor</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Usuario</th>
                        <th>Contraseña</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Email</th>
                        <th>Especialidad</th>
                        <th>Botones</th>
                    </tr>
                </thead>
                <% 
                    ProfesorDAO pDao = new ProfesorDAO();
                    List<ProfesorDTO>list= pDao.listar();
                    Iterator<ProfesorDTO> i = list.iterator();
                    ProfesorDTO userP = null;
                    while(i.hasNext()) {
                        userP=i.next();
                    
                
                %>
                <tbody>
                    <tr>
                        <td><%=userP.getId()%></td>
                        <td><%=userP.getUsername()%></td>
                        <td><%=userP.getPassword()%></td>
                        <td><%=userP.getName()%></td>
                        <td><%=userP.getLast_name()%></td>
                        <td><%=userP.getEmail()%></td>
                        <td><%=userP.getSpecialist()%></td>
                        <td>
                            <a href="ProfesorServlet?accion=modificar&id=<%= userP.getId()%>">Modificar</a>
                            <a href="ProfesorServlet?accion=eliminar&id=<%= userP.getId()%>">Eliminar</a>
                            
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
