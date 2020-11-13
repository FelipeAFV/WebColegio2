<%-- 
    Document   : listarA
    Created on : 12-11-2020, 16:53:05
    Author     : jvarg
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.AlumnoDTO"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.AlumnoBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Alumnos</h1>
            <a href="ProfesorServlet?accion=addA">Agregar nuevo alumno</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Usuario</th>
                        <th>Contraseña</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Botones</th>
                    </tr>
                </thead>
                <% 
                    AlumnoBBDD aDao = new AlumnoBBDD();
                    List<AlumnoDTO>list= aDao.listar();
                    Iterator<AlumnoDTO> i = list.iterator();
                    AlumnoDTO userA = null;
                    while(i.hasNext()) {
                        userA=i.next();
                    
                
                %>
                <tbody>
                    <tr>
                        <td><%=userA.getId()%></td>
                        <td><%=userA.getUsername()%></td>
                        <td><%=userA.getPassword()%></td>
                        <td><%=userA.getName()%></td>
                        <td><%=userA.getLast_name()%></td>
                        <td>
                            <a href="ProfesorServlet?accion=modify&id=<%= userA.getId()%>">Modificar</a>
                            <a href="ProfesorServlet?accion=delete&id=<%= userA.getId()%>">Eliminar</a>
                            
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
