<%-- 
    Document   : asignatura
    Created on : 14-11-2020, 15:00:40
    Author     : jvarg
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.AsignaturaDTO"%>
<%@page import="java.util.List"%>
<%@page import="dao.AsignaturaBBDD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/Componente/adminNav.jsp"/>
<div class="table-responsive">
    <table class="table table-active table-bordered table-light">
        <tr>
            <th>Asignatura ID</th>
            <th>Nombre</th>
            <th>Profesor ID</th>
            <th></th>
        </tr>
        <%
            AsignaturaBBDD asig = new AsignaturaBBDD();
            List<AsignaturaDTO> list = asig.listar();
            Iterator<AsignaturaDTO> i = list.iterator();
            AsignaturaDTO as = null;
            while (i.hasNext()) {
                as = i.next();


        %>
        <tr>

            <td><%=as.getId()%></td>
            <td><%=as.getNombre()%></td>
            <td><%=as.getProfesor_id()%></td>
            <th>
                <a href="admin?action=modificarAsig&idAsig=<%= as.getId()%>&nombreAs=<%= as.getNombre()%>&idproff=<%= as.getProfesor_id()%>">Modificar</a>
                <a href="admin?action=eliminarAsig&id=<%= as.getId()%>">Eliminar</a>
            </th>
        </tr>
        <%  }%>



    </table>
        <a href="admin?action=asignaturaN" class="btn btn-block btn-light">Agregar Asignatura</a>

</div>
</div>
</html>
