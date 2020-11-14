<%-- 
    Document   : editAsig
    Created on : 13-11-2020, 23:00:49
    Author     : jvarg
--%>

<%@page import="modelo.AsignaturaDTO"%>
<%@page import="dao.AdminBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                AdminBBDD aDao = new AdminBBDD();
                int id = Integer.parseInt((String) request.getAttribute("idasig"));
                AsignaturaDTO asig = (AsignaturaDTO)aDao.list(id);
            %>
            
            <h1> Modificar Asignatura </h1>
            <form action="AsignaturaServlet"> 
                    Nivel id: <br>
                    <input type="text" name="txtNivelId" value="<%=asig.getNivel_id()%>"><br>
                    Profesor id: <br>
                    <input type="text" name="txtProfesorId" value="<%=asig.getProfesor_id()%>"><br>
                    Nombre:  <br>
                    <input type="text" name="txtName" value="<%=asig.getNombre()%>"><br>
                    <input type="hidden" name="txtidasig" value="<%=asig.getId()%>">
                    <input type="submit" name="accion" value="Actualizar"><br>
                    <a href="AsignaturaServlet?accion=listAsig">Volver</a>
                </form>          
        </div>
    </body>
</html>
