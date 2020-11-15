<%-- 
    Document   : profesor
    Created on : 14-11-2020, 15:00:30
    Author     : jvarg
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.ProfesorDTO"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProfesorBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/Componente/adminNav.jsp"/>
<div class="table-responsive">
    <table class="table table-active table-bordered table-light">
        <tr>
            <th>Profesor ID</th>
            <th>Usuario</th>
            <th>Contraseña</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Email</th>
            <th>Especialidad</th>
            <th></th>
        </tr>
        <%
            ProfesorBBDD p = new ProfesorBBDD();
            List<ProfesorDTO> list = p.listar();
            Iterator<ProfesorDTO> i = list.iterator();
            ProfesorDTO prof = null;
            while (i.hasNext()) {
                prof = i.next();


        %>
        <tr>

            <td><%=prof.getId()%></td>
            <td><%=prof.getUsername()%></td>
            <td><%=prof.getPassword()%></td>
            <td><%=prof.getName()%></td>
            <td><%=prof.getLast_name()%></td>
            <td><%=prof.getEmail()%></td>
            <td><%=prof.getSpecialist()%></td>
            <th>
                <a href="admin?action=modificarP&idp=<%= prof.getId()%>&userP=<%= prof.getUsername()%>&passP=<%= prof.getPassword()%>&nombreP=<%= prof.getName()%>&apellidoP=<%= prof.getLast_name()%>&email=<%= prof.getEmail()%>&esp=<%= prof.getSpecialist()%>">Modificar</a>
                <a href="admin?action=eliminarP&idprof=<%= prof.getId()%>">Eliminar</a>
            </th>
        </tr>
        <%  }%>



    </table>
        <a href="admin?action=profesorN" class="btn btn-block btn-light">Agregar Profesor</a>

</div>
</div>
</html>
