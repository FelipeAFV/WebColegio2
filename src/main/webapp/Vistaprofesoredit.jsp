<%-- 
    Document   : Vistaprofesoredit
    Created on : 13-11-2020, 12:15:45
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="Menuprofserv">
                id:<br>
                <input type="text" readonly="" name="idalum" value="<%=request.getParameter("id")%>"><br>
                id_asignatura:<br>
                <input type="text" readonly="" name="idasignatura" value="<%=request.getParameter("idasig")%>"><br>
                trimestre:<br>
                <input type="text" readonly="" name="trim" value="<%=request.getParameter("trimestre")%>"><br>
                Nueva nota:<br>
                <input type="text" name="nuevanota"><br>
                
                <input type="submit" name="accion" value="update">
            </form>
        </div>
    </body>
</html>
