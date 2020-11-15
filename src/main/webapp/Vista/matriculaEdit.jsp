<%-- 
    Document   : matriculaEdit
    Created on : 15-11-2020, 01:54:38
    Author     : jvarg
--%>

<%@page import="modelo.MatriculaDTO"%>
<%@page import="dao.MatriculaBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/Componente/adminNav.jsp" />
    <div>
            
    <form method="post" action="admin">


            <div class ="row">
        <div class="col-md-12"><h2>Editar Matricula</h2></div>
        
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Alumno ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAlumno" class="form-control" value="<%=request.getParameter("id")%>"  />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Asignatura ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAsignatura" class="form-control" value="<%=request.getParameter("idasig")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Trimestre</div>
        <div class="col-md-3">
            <input type="text" name="txtTrimestre" class="form-control" value="<%=request.getParameter("trimestre")%>"/>
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nota</div>
        <div class="col-md-3">
            <input type="text" name="txtNota" class="form-control" value="<%=request.getParameter("nota")%>" />
        </div>
        <div class="col-md-3"></div>
    </div>    
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            
            <input type="submit" name="action" value="ACTUALIZAR" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
    </form>
    
</div>
</html>
