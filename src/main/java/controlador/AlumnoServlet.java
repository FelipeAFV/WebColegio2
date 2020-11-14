/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.AlumnoBBDD;
import dao.AlumnoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlumnoDTO;
import modelo.AsignaturaDTO;
import modelo.ProfesorDTO;
import modelo.Sesion;

/**
 *
 * @author f_fig
 */
public class AlumnoServlet extends HttpServlet {

    private AlumnoDAO alumDAO;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");
        alumDAO = new AlumnoBBDD();
        if (accion.equals("Listar Alumnos")) {
            Sesion sesion = Sesion.obtenerSesionActual();
            int id = sesion.getUsuario().getId();
            ArrayList<AlumnoDTO> alumnos = alumDAO.listarAlumnos(id);
            request.setAttribute("alumnos", alumnos);
            getServletContext().getRequestDispatcher("/VistaListarAlumnos.jsp").forward(request, response);
            
        } else if (accion.equals("Listar Asignaturas")) {
            Sesion sesion = Sesion.obtenerSesionActual();
            int id = sesion.getUsuario().getId();
            ArrayList<AsignaturaDTO> asignaturas = alumDAO.listarAsignaturas(id);
            request.setAttribute("asignaturas", asignaturas);
            getServletContext().getRequestDispatcher("/VistaListarAsignatura.jsp").forward(request, response);

        } else if (accion.equals("Listar Profesores")) {
            Sesion sesion = Sesion.obtenerSesionActual();
            int id = sesion.getUsuario().getId();
            ArrayList<ProfesorDTO> profesores = alumDAO.listarProfesores(id);
            request.setAttribute("profesores", profesores);
            getServletContext().getRequestDispatcher("/VistaListarProfesor.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
