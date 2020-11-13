<%-- 
    Document   : VistaListarProfesor
    Created on : 12-11-2020, 16:58:48
    Author     : f_fig
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.ProfesorDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Profesores</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Asignatura</th>
            </tr>
            <%
                ArrayList<ProfesorDTO> profesores = (ArrayList<ProfesorDTO>) request.getAttribute("profesores");

                if (profesores != null) {
                    Iterator itr = profesores.iterator();
                    ProfesorDTO profe;
                    while (itr.hasNext()) {
                        profe = (ProfesorDTO) itr.next();
            %>  
            <tr>
                <td><%=profe.getName()%></td>
                <td><%=profe.getLast_name()%></td>
                <td><%=profe.getAsignatura()%></td>
            </tr>

            <%}
                }%>

        </table>
    </body>
</html>
