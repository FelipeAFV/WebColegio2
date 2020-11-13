/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.AlumnoDTO;
import modelo.ProfesorDTO;
import dao.AlumnoBBDD;
import dao.ProfesorBBDD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jvarg
 */
public class ProfesorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String listar="Vistas/listar.jsp";
    String add="Vistas/add.jsp";
    String edit="Vistas/edit.jsp";
    String listarA="Vistas/listarA.jsp";
    String addA="Vistas/addA.jsp";
    String editA="Vistas/editA.jsp";
    
    ProfesorDTO prof = new ProfesorDTO();
    ProfesorBBDD profDao = new ProfesorBBDD();
    AlumnoDTO al = new AlumnoDTO();
    AlumnoBBDD alDao = new AlumnoBBDD();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioServlet at " + request.getContextPath() + "</h1>");
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
        //La variable acceso depende de lo que el usuario indique
        String acceso="";
        String action=request.getParameter("accion");
        
        
        if(action.equalsIgnoreCase("listar")) {
            acceso=listar;
        } else if(action.equalsIgnoreCase("add")) {
            acceso=add;
            
        } else if (action.equalsIgnoreCase("Agregar")) {
            String usuario = request.getParameter("txtUsername");
            String pass = request.getParameter("txtPassword");
            String nombre = request.getParameter("txtName");
            String apellido = request.getParameter("txtLast_name");
            String email = request.getParameter("txtEmail");
            String espe = request.getParameter("txtEspecialidad");
            prof.setUsername(usuario);
            prof.setPassword(pass);
            prof.setName(nombre);
            prof.setLast_name(apellido);
            prof.setEmail(email);
            prof.setSpecialist(espe);
            profDao.add(prof);
            acceso = listar;
            
        } else if(action.equalsIgnoreCase("modificar")) {
            request.setAttribute("idprof", request.getParameter("id"));
            acceso=edit;
            
        } else if(action.equalsIgnoreCase("Actualizar")) {
            int id=Integer.parseInt(request.getParameter("txtid"));
            //Capturar valores de los campos
            String usuario = request.getParameter("txtUsername");
            String pass = request.getParameter("txtPassword");
            String nombre = request.getParameter("txtName");
            String apellido = request.getParameter("txtLast_name");
            String email = request.getParameter("txtEmail");
            String espe = request.getParameter("txtEspecialidad");
            prof.setId(id);
            prof.setUsername(usuario);
            prof.setPassword(pass);
            prof.setName(nombre);
            prof.setLast_name(apellido);
            prof.setEmail(email);
            prof.setSpecialist(espe);
            profDao.edit(prof);
            acceso=listar;
        } else if (action.equalsIgnoreCase("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            prof.setId(id);
            profDao.eliminar(id);
            acceso=listar;
        } else if(action.equalsIgnoreCase("listarA")) {
            acceso=listarA;
        } else if(action.equalsIgnoreCase("addA")) {
            acceso=addA;
            
        } else if(action.equalsIgnoreCase("AgregarA")) {
            String usuarioA = request.getParameter("txtUsername");
            String passA = request.getParameter("txtPassword");
            int nivel = Integer.parseInt(request.getParameter("txtNivel"));
            String nombreA = request.getParameter("txtName");
            String apellidoA = request.getParameter("txtLast_name");
            al.setUsername(usuarioA);
            al.setPassword(passA);
            al.setIdNivel(nivel);
            al.setNombre(nombreA);
            al.setApellido(apellidoA);
            alDao.add(al);
            acceso = listarA;
        } else if (action.equalsIgnoreCase("modify")) {
           request.setAttribute("idal", request.getParameter("id"));
           acceso=editA; 
        } else if(action.equalsIgnoreCase("Refresh")) {
            int id=Integer.parseInt(request.getParameter("txtida"));
            //Capturar valores de los campos
            String usuarioA = request.getParameter("txtUsername");
            String passA = request.getParameter("txtPassword");
            int nivel = Integer.parseInt(request.getParameter("txtNivel"));
            String nombreA = request.getParameter("txtName");
            String apellidoA = request.getParameter("txtLast_name");
            al.setId(id);
            al.setUsername(usuarioA);
            al.setPassword(passA);
            al.setIdNivel(nivel);
            al.setNombre(nombreA);
            al.setApellido(apellidoA);
            alDao.edit(al);
            acceso=listarA;
            
        } else if (action.equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            al.setId(id);
            alDao.eliminar(id);
            acceso=listarA;
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
