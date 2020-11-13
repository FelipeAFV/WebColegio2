<%-- 
    Document   : edit
    Created on : 12-11-2020, 10:03:28
    Author     : jvarg
--%>

<%@page import="modelo.ProfesorDTO"%>
<%@page import="dao.ProfesorBBDD"%>
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
                ProfesorBBDD pDao = new ProfesorBBDD();
                int id = Integer.parseInt((String) request.getAttribute("idprof"));
                ProfesorDTO prof = (ProfesorDTO)pDao.list(id);
            %>
            
            <h1> Modificar Profesor </h1>
            <form action="ProfesorServlet"> 
                    Username: <br>
                    <input type="text" name="txtUsername" value="<%=prof.getUsername()%>"><br>
                    Contraseña: <br>
                    <input type="password" name="txtPassword" value="<%=prof.getPassword()%>"><br>
                    Nombre:  <br>
                    <input type="text" name="txtName" value="<%=prof.getName()%>"><br>
                    Apellido: <br>
                    <input type="text" name="txtLast_name" value="<%=prof.getLast_name()%>"><br>
                    Email: <br>
                    <input type="text" name="txtEmail" value="<%=prof.getEmail()%>"><br>
                    Especialidad <br>
                    <input type="text" name="txtEspecialidad" value="<%=prof.getSpecialist()%>"><br>
                    <input type="hidden" name="txtid" value="<%=prof.getId()%>">
                    <input type="submit" name="accion" value="Actualizar"><br>
                    <a href="ProfesorServlet?accion=listar">Volver</a>
                    
                    
                </form>
                
            
            
        </div>
    </body>
</html>
