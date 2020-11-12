/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.AlumnoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlumnoDTO;

/**
 *
 * @author f_fig
 */
public class ListarAlumnosServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        /*int idAlumno = Integer.parseInt(request.getParameter("id"));
        ArrayList<AlumnoDTO> alumnos = alumDAO.listarAlumnos(idAlumno);
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAlumno</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAlumno at " + request.getContextPath() + "</h1>");
            out.println("<tr>");
            out.println("<th>Nombre</th>");
            out.println("<th>Apellido</th>");
            out.println("</tr>");
            Iterator itr = alumnos.iterator();
            while (itr.hasNext()) {
                Alumno alum = (Alumno) itr.next();
                out.println("<tr>");
                out.println("<td>" + alum.getNombre() + "</td>");
                out.println("<td>" + alum.getApellido() + "</td>");
                out.println("</tr>");

            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }*/
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
