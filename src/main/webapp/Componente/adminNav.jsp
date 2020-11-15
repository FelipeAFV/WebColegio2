<%-- 
    Document   : adminNav
    Created on : 14-11-2020, 14:56:36
    Author     : jvarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sesión administrador</title><link rel="stylesheet" href="Recursos/css/bootstrap.css" />
</head>
<body>
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-dark bg-info">
            <a class ="navbar-brand" href="admin?action=profesor">Profesores </a> 
            <a class = "navbar-brand" href="admin?action=alumno">Alumnos </a> 
            <a class = "navbar-brand" href="admin?action=asignatura">Asignaturas </a>
            <a class = "navbar-brand" href="admin?action=matricula">Matriculas</a>
        </nav>