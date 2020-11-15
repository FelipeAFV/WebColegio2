<%-- 
    Document   : profesorN
    Created on : 14-11-2020, 22:44:18
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="/Componente/adminNav.jsp" />
    <form method="post" action="admin?action=guardarP">
            <div class ="row">
        <div class="col-md-12"><h2>Nuevo Profesor</h2></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Profesor ID</div>
        <div class="col-md-3">
            <input type="text" name="txtProfesor" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Usuario</div>
        <div class="col-md-3">
            <input type="text" name="txtUsuarioP" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Contraseña</div>
        <div class="col-md-3">
            <input type="password" name="txtPassP" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Nombre</div>
        <div class="col-md-3">
            <input type="text" name="txtNombreP" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
        <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Apellido</div>
        <div class="col-md-3">
            <input type="text" name="txtApellidoP" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>  
    
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Email</div>
        <div class="col-md-3">
            <input type="text" name="txtEmail" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>
        <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">Especialista</div>
        <div class="col-md-3">
            <input type="text" name="txtSpecialist" class="form-control" />
        </div>
        <div class="col-md-3"></div>
    </div>  
        <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            <input type="submit" name="btnSaveP" value="GUARDAR" class="btn btn-block btn-dark">
        </div>
        
        <div class="col-md-3"></div>
    </div>
        
    </form>
    
</div>
</html>
