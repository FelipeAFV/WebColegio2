<%-- 
    Document   : alumno
    Created on : 14-11-2020, 15:00:52
    Author     : jvarg
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.AlumnoDTO"%>
<%@page import="java.util.List"%>
<%@page import="dao.AlumnoBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/Componente/adminNav.jsp"/>
<div class="table-responsive">
    <table class="table table-active table-bordered table-light">
        <tr>
            <th>AlumnoID</th>
            <th>Ususario</th>
            <th>Contraseña</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Nivel ID</th>
            <th></th>
        </tr>
        <%
            AlumnoBBDD a = new AlumnoBBDD();
            List<AlumnoDTO> list = a.listar();
            Iterator<AlumnoDTO> i = list.iterator();
            AlumnoDTO al = null;
            while (i.hasNext()) {
                al = i.next();


        %>
        <tr>

            <td><%=al.getId()%></td>
            <td><%=al.getUsername()%></td>
            <td><%=al.getPassword()%></td>
            <td><%=al.getNombre()%></td>
            <td><%=al.getApellido()%></td>
            <td><%=al.getIdNivel()%></td>
            <th>
                <a href="admin?action=modificarA&idA=<%= al.getId()%>&userA=<%= al.getUsername()%>&passA=<%= al.getPassword()%>&nombreA=<%= al.getNombre()%>&apellidoA=<%= al.getApellido()%>&nivelId=<%= al.getIdNivel()%>">Modificar</a>
                <a href="admin?action=eliminarA&idA=<%= al.getId()%>">Eliminar</a>
            </th>
        </tr>
        <%  }%>



    </table>
        <a href="admin?action=alumnoN" class="btn btn-block btn-light">Agregar Alumno</a>

</div>
</div>
</html>
