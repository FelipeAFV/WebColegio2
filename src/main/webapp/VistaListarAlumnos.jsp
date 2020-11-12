<%-- 
    Document   : VistaListarAlumnos
    Created on : 12-11-2020, 14:03:18
    Author     : f_fig
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.AlumnoDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alumnos</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
            </tr>
            <%  ArrayList<AlumnoDTO> alumnos = (ArrayList<AlumnoDTO>)request.getAttribute("alumnos");
                Iterator itr = alumnos.iterator();
                
                while (itr.hasNext()) {
                    AlumnoDTO alum = (AlumnoDTO) itr.next();%>  
            <tr>
                <td><%%></td>
                <td><%%></td>
            </tr>

            <%}%>
        </table>

    </body>
</html>
