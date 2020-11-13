<%-- 
    Document   : VistaListarNotas
    Created on : 12-11-2020, 20:01:56
    Author     : f_fig
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.Sesion"%>
<%@page import="dao.AlumnoDAO"%>
<%@page import="dao.AlumnoBBDD"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <%int idAsig = Integer.parseInt(request.getParameter("idAsig"));%>
        <h1>Notas de la asignatura <%=idAsig%></h1>
        <table id="tb1">
            <%
                AlumnoDAO datos = new AlumnoBBDD();
                //Sesion sesion = Sesion.obtenerSesionActual();
                //int idAlum = sesion.getUsuario().getId();
                ArrayList<Integer> notas = datos.listarNotasAsignatura(idAsig, 10);

                if (notas != null) {
                    Iterator itr = notas.iterator();
                    int nota;
                    while (itr.hasNext()) {

                        nota = (Integer) itr.next();
            %>  
            <tr>
                <td>Nota</td>
                <td><%=nota%></td>


            </tr>

            <%}
            }%>

        </table>
    </body>
</html>
