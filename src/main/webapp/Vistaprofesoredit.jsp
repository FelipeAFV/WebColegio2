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
        <style>
            label{
                display: inline-block;
                width: 100px;
            }
            div {
                margin: 15px;
            }
            
        </style>
    </head>
    <h1>Editar Nota</h1>
    <body>
        <div>
            <form action="Menuprofserv">
                <div>
                  <label>Id:</label>
                  <input type="text" readonly="" name="idalum" value="<%=request.getParameter("id")%>"><br>  
                </div>
                <div>
                    <label>Id Asignatura:</label>
                    <input type="text" readonly="" name="idasignatura" value="<%=request.getParameter("idasig")%>"><br>
                </div>
                <div>
                    <label>Trimestre:</label>
                    <input type="text" readonly="" name="trim" value="<%=request.getParameter("trimestre")%>"><br>
                </div>
                <div>
                   <label>Nueva nota:</label>
                    <input type="text" name="nuevanota"><br> 
                </div>
                
                <div>
                    <input type="submit" name="accion" value="update">
                </div>
                
            </form>
        </div>
    </body>
</html>
