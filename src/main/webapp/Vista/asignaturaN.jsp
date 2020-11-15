<%-- 
    Document   : asignaturaN
    Created on : 14-11-2020, 22:58:31
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <jsp:include page="/Componente/adminNav.jsp" />
    <form method="post" action="admin?action=guardarAsig">
            <div class ="row">
        <div class="col-md-12"><h2>Nueva Asignatura</h2></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Asignatura ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAsigID" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nombre</div>
        <div class="col-md-3">
            <input type="text" name="txtNombreAs" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Profesor ID</div>
        <div class="col-md-3">
            <input type="text" name="txtProfesorIda" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>  
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            <input type="submit" name="btnSaveAs" value="GUARDAR" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
    </form>
    
</div>
</html>
