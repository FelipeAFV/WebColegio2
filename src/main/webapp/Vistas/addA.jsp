<%-- 
    Document   : addA
    Created on : 12-11-2020, 16:54:09
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
            <h1> Agregar nuevo alumno </h1>
            <form action="ProfesorServlet"> 
                    Username: <br>
                    <input type="text" name="txtUsername"><br>
                    Contraseña: <br>
                    <input type="password" name="txtPassword"><br>
                    Nivel <br>
                    <input type="text" name="txtNivel"><br>
                    Nombre:  <br>
                    <input type="text" name="txtName"><br>
                    Apellido: <br>
                    <input type="text" name="txtLast_name"><br>
                    <input type="submit" name="accion" value="AgregarA"><br>
                    
                    
                </form>
    </body>
</html>
