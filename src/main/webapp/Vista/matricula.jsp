<%-- 
    Document   : matricula
    Created on : 14-11-2020, 15:00:22
    Author     : jvarg
--%>

<%@page import="java.util.List"%>
<%@page import="dao.MatriculaBBDD"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.MatriculaDTO"%>
<%@page import="modelo.MatriculaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/Componente/adminNav.jsp"/>
<div class="table-responsive">
    <table class="table table-active table-bordered table-light">
        <tr>
            <th>AlumnoID</th>
            <th>AsignaturaID</th>
            <th>Trimestre</th>
            <th>Nota</th>
            <th></th>
        </tr>
        <%
            MatriculaBBDD m = new MatriculaBBDD();
            List<MatriculaDTO> list = m.listar();
            Iterator<MatriculaDTO> i = list.iterator();
            MatriculaDTO ma = null;
            while (i.hasNext()) {
                ma = i.next();


        %>
        <tr>

            <td><%=ma.getAlumno_id()%></td>
            <td><%=ma.getAsignatura_id()%></td>
            <td><%=ma.getTrimestre()%></td>
            <td><%=ma.getNota()%></td>
            <th>
                <a href="admin?action=modificar&id=<%=ma.getAlumno_id()%>&idasig=<%=ma.getAsignatura_id()%>&trimestre=<%=ma.getTrimestre()%>&nota=<%=ma.getNota()%>">Modificar</a>
                <a href="admin?action=eliminarM&idm=<%= ma.getAlumno_id()%>">Eliminar</a>
            </th>
        </tr>
        <%  }%>


    </table>
        <a href="admin?action=nuevaM" class="btn btn-block btn-light">Agregar Matricula</a>

</div>
</div>
</html>
