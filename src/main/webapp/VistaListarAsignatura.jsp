<%-- 
    Document   : VistaListarNotas
    Created on : 12-11-2020, 18:43:14
    Author     : f_fig
--%>

<%@page import="modelo.AsignaturaDTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Asignaturas</h1>
        <table border=1px id="tb1">
            <tr>
                <th >Nombre asignatura</th>
                <th>Notas</th>
            </tr>
            <%
                
                ArrayList<AsignaturaDTO> asignaturas = (ArrayList<AsignaturaDTO>) request.getAttribute("asignaturas");

                if (asignaturas != null) {
                    Iterator itr = asignaturas.iterator();
                    AsignaturaDTO asignatura;
                    while (itr.hasNext()) {
                        
                        asignatura = (AsignaturaDTO) itr.next();
            %>  
            <tr >
                <td align="center"><%=asignatura.getNombre()%></td>
                <td><a href="VistaListarNotas.jsp?idAsig=<%=asignatura.getId()%>">Ver Notas</a></td>
                

        </tr>

        <%}}%>

    </table>
</body>
</html>
