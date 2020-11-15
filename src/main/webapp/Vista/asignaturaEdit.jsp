<%-- 
    Document   : asignaturaEdit
    Created on : 15-11-2020, 04:26:04
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <jsp:include page="/Componente/adminNav.jsp" />
    <div>
            
    <form method="post" action="admin">


            <div class ="row">
        <div class="col-md-12"><h2>Editar Asignatura</h2></div>
        
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Asignatura ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAsigId" class="form-control" value="<%=request.getParameter("idAsig")%>"  />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nombre</div>
        <div class="col-md-3">
            <input type="text" name="txtNombreAs" class="form-control" value="<%=request.getParameter("nombreAs")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Profesor ID</div>
        <div class="col-md-3">
            <input type="text" name="txtProfId" class="form-control" value="<%=request.getParameter("idproff")%>"/>
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            
            <input type="submit" name="action" value="ACTUALIZAR ASIGNATURA" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
    </form>
    
</div>
</html>
