<%-- 
    Document   : alumnoEdit
    Created on : 15-11-2020, 03:43:00
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <jsp:include page="/Componente/adminNav.jsp" />
    <div>
            
    <form method="post" action="admin">


            <div class ="row">
        <div class="col-md-12"><h2>Editar Alumno</h2></div>
        
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Alumno ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAlumnoId" class="form-control" value="<%=request.getParameter("idA")%>"  />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Usuario</div>
        <div class="col-md-3">
            <input type="text" name="txtUsuarioA" class="form-control" value="<%=request.getParameter("userA")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Contraseña</div>
        <div class="col-md-3">
            <input type="text" name="txtPasswordA" class="form-control" value="<%=request.getParameter("passA")%>"/>
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nombre</div>
        <div class="col-md-3">
            <input type="text" name="txtNombreA" class="form-control" value="<%=request.getParameter("nombreA")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>
<div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Apellido</div>
        <div class="col-md-3">
            <input type="text" name="txtApellidoA" class="form-control" value="<%=request.getParameter("apellidoA")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>
<div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nivel ID</div>
        <div class="col-md-3">
            <input type="text" name="txtNivelId" class="form-control" value="<%=request.getParameter("nivelId")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>    
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            
            <input type="submit" name="action" value="ACTUALIZAR ALUMNO" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
    </form>
    
</div>
</html>
