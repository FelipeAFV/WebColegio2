<%-- 
    Document   : editA
    Created on : 12-11-2020, 17:34:18
    Author     : jvarg
--%>

<%@page import="Modelo.AlumnoDTO"%>
<%@page import="ModeloDAO.AlumnoDAO"%>
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
                AlumnoDAO aDao = new AlumnoDAO();
                int id = Integer.parseInt((String) request.getAttribute("idal"));
                AlumnoDTO al = (AlumnoDTO)aDao.list(id);
            %>
            
            <h1> Modificar Alumno </h1>
            <form action="ProfesorServlet"> 
                    Username: <br>
                    <input type="text" name="txtUsername" value="<%=al.getUsername()%>"><br>
                    Contraseña: <br>
                    <input type="password" name="txtPassword" value="<%=al.getPassword()%>"><br>
                    Nombre:  <br>
                    <input type="text" name="txtName" value="<%=al.getName()%>"><br>
                    Apellido: <br>
                    <input type="text" name="txtLast_name" value="<%=al.getLast_name()%>"><br>
                    <input type="hidden" name="txtida" value="<%=al.getId()%>">
                    <input type="submit" name="accion" value="Refresh"><br>
                    <a href="ProfesorServlet?accion=listarA">Volver</a>
                </form>
                
            
            
        </div>
    </body>
</html>
