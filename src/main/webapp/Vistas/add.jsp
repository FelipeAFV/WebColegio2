<%-- 
    Document   : add
    Created on : 12-11-2020, 10:03:21
    Author     : jvarg
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
            <h1> Agregar nuevo profesor </h1>
            <form action="ProfesorServlet"> 
                    Username: <br>
                    <input type="text" name="txtUsername"><br>
                    Contraseña: <br>
                    <input type="password" name="txtPassword"><br>
                    Nombre:  <br>
                    <input type="text" name="txtName"><br>
                    Apellido: <br>
                    <input type="text" name="txtLast_name"><br>
                    Email: <br>
                    <input type="text" name="txtEmail"><br>
                    Especialidad <br>
                    <input type="text" name="txtEspecialidad"><br>
                    <input type="submit" name="accion" value="Agregar"><br>
                    
                    
                </form>
                
            
            
        </div>
    </body>
</html>
