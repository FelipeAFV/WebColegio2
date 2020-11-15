<%-- 
    Document   : alumnoN
    Created on : 14-11-2020, 22:22:00
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="/Componente/adminNav.jsp" />
    <form action="admin">
            <div class ="row">
        <div class="col-md-12"><h2>Nuevo Alumno</h2></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Alumno ID</div>
        <div class="col-md-3">
            <input type="text" name="txtAlumnoA" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Usuario</div>
        <div class="col-md-3">
            <input type="text" name="txtUsuarioA" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Contraseña</div>
        <div class="col-md-3">
            <input type="password" name="txtPassA" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nombre</div>
        <div class="col-md-3">
            <input type="text" name="txtNombreA" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
        <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Apellido</div>
        <div class="col-md-3">
            <input type="text" name="txtApellidoA" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>  
    
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nivel ID</div>
        <div class="col-md-3">
            <input type="text" name="txtNivelId" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>  
        <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            <input type="submit" name="action" value="Guardar Alumno" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
        
    </form>
    
</div>
</html>
