/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.AdminBBDD;
import dao.ProfesorBBDD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AsignaturaDTO;

/**
 *
 * @author jvarg
 */
public class AsignaturaServlet extends HttpServlet {
    String listar="Vistas/listarAsig.jsp";
    String add="Vistas/addAsig.jsp";
    String editar="Vistas/editAsig.jsp";
    AsignaturaDTO asig = new AsignaturaDTO();
    AdminBBDD asigDao = new AdminBBDD();
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AsignaturaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AsignaturaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String acceso="";
        String action=request.getParameter("action");
        
        
        if(action.equalsIgnoreCase("listarAsig")) {
            acceso=listar;
        } else if(action.equalsIgnoreCase("addAsig")) {
            acceso=add;
            
        } else if (action.equalsIgnoreCase("Agregar")) {
            String nivel_id = request.getParameter("txtNivelId");
            String profesor_id = request.getParameter("txtProfesorId");
            String nombre = request.getParameter("txtName");
            asig.setNivel_id(Integer.parseInt(nivel_id));
            asig.setProfesor_id(Integer.parseInt(profesor_id));
            asig.setNombre(nombre);
            asigDao.add(asig);
            acceso = listar;
            
        } else if(action.equalsIgnoreCase("modificar")) {
            request.setAttribute("idasig", request.getParameter("id"));
            acceso=editar;
            
        } else if(action.equalsIgnoreCase("Actualizar")) {
            int id=Integer.parseInt(request.getParameter("txtidasig"));
            //Capturar valores de los campos
            int nivel_id = Integer.parseInt(request.getParameter("txtNivelId"));
            int profesor_id = Integer.parseInt(request.getParameter("txtProfesorId"));
            String nombre = request.getParameter("txtName");
            asig.setId(id);
            asig.setNivel_id(nivel_id);
            asig.setProfesor_id(profesor_id);
            asig.setNombre(nombre);
            asigDao.edit(asig);
            acceso=listar;
        } else if (action.equalsIgnoreCase("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            asig.setId(id);
            asigDao.eliminar(id);
            acceso=listar;
        }
        RequestDispatcher Vista = request.getRequestDispatcher(acceso);
        Vista.forward(request, response);
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
