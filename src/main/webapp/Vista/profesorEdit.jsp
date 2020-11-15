<%-- 
    Document   : profesorEdit
    Created on : 15-11-2020, 04:05:17
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <jsp:include page="/Componente/adminNav.jsp" />
    <div>    
    <form method="post" action="admin">


            <div class ="row">
        <div class="col-md-12"><h2>Editar Profesor</h2></div>
        
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Profesor ID</div>
        <div class="col-md-3">
            <input type="text" name="txtProfesor" class="form-control" value="<%=request.getParameter("idp")%>"  />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Usuario</div>
        <div class="col-md-3">
            <input type="text" name="txtUsernameP" class="form-control" value="<%=request.getParameter("userP")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Contraseña</div>
        <div class="col-md-3">
            <input type="text" name="txtPasswordP" class="form-control" value="<%=request.getParameter("passP")%>"/>
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nombre</div>
        <div class="col-md-3">
            <input type="text" name="txtNombreP" class="form-control" value="<%=request.getParameter("nombreP")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>   
<div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Apellido</div>
        <div class="col-md-3">
            <input type="text" name="txtApellidoP" class="form-control" value="<%=request.getParameter("apellidoP")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>   
<div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Email</div>
        <div class="col-md-3">
            <input type="text" name="txtEmail" class="form-control" value="<%=request.getParameter("email")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>   
        <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Especialista</div>
        <div class="col-md-3">
            <input type="text" name="txtEsp" class="form-control" value="<%=request.getParameter("esp")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>   
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            
            <input type="submit" name="action" value="ACTUALIZAR PROFESOR" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
    </form>
    
</div>
</html>
