<%-- 
    Document   : nuevaM
    Created on : 14-11-2020, 20:56:56
    Author     : jvarg
--%>

<%@page import="modelo.MatriculaDTO"%>
<%@page import="dao.MatriculaBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/Componente/adminNav.jsp" />

    <form method="post" action="admin?action=guardarM">


            <div class ="row">
        <div class="col-md-12"><h2>Nueva Matricula</h2></div>
        
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Alumno ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAlumno" class="form-control"  />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Asignatura ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAsignatura" class="form-control"  />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Trimestre</div>
        <div class="col-md-3">
            <input type="text" name="txtTrimestre" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nota</div>
        <div class="col-md-3">
            <input type="text" name="txtNota" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>    
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            <input type="submit" name="action" value="GUARDAR" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
    </form>
    
</div>
</html>
