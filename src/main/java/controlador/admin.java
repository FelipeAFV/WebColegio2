/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.AlumnoBBDD;
import dao.AsignaturaBBDD;
import dao.MatriculaBBDD;
import dao.ProfesorBBDD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlumnoDTO;
import modelo.AsignaturaDTO;
import modelo.MatriculaDTO;
import modelo.ProfesorDTO;

/**
 *
 * @author jvarg
 */
public class admin extends HttpServlet {

    private RequestDispatcher rd;
    String menu = "Vista/adminView.jsp";

    String matricula = "Vista/matricula.jsp";
    String matriculaN = "Vista/nuevaM.jsp";
    String matriculaEdit = "Vista/matriculaEdit.jsp";

    String alumno = "Vista/alumno.jsp";
    String alumnoN = "Vista/alumnoN.jsp";
    String alumnoEdit = "Vista/alumnoEdit.jsp";

    String profesor = "Vista/profesor.jsp";
    String profesorN = "Vista/profesorN.jsp";
    String profesorEdit = "Vista/profesorEdit.jsp";

    String asignatura = "Vista/asignatura.jsp";
    String asignaturaN = "Vista/asignaturaN.jsp";
    String asignaturaEdit = "Vista/asignaturaEdit.jsp";
    
    MatriculaBBDD mdao = new MatriculaBBDD();
    MatriculaDTO mat = new MatriculaDTO();

    AsignaturaBBDD adao = new AsignaturaBBDD();
    AsignaturaDTO a = new AsignaturaDTO();

    AlumnoBBDD aldao = new AlumnoBBDD();
    AlumnoDTO al = new AlumnoDTO();

    ProfesorBBDD pdao = new ProfesorBBDD();
    ProfesorDTO p = new ProfesorDTO();

    public admin() {
        super();
        /*mdao = new MatriculaBBDD();
        mat = new MatriculaDTO();*/
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void adminView(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void matricula(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void nuevaM(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void insertarM(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        String alum_id = request.getParameter("txtAlumno");
        String asig_id = request.getParameter("txtAsignatura");
        String tri = request.getParameter("txtTrimestre");
        String nota = request.getParameter("txtNota");
        mat.setAlumno_id(Integer.parseInt(alum_id));
        mat.setAsignatura_id(Integer.parseInt(asig_id));
        mat.setTrimestre(Integer.parseInt(tri));
        mat.setNota(Double.parseDouble(nota));
        mdao.add(mat);
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarM(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        MatriculaBBDD m = new MatriculaBBDD();
        m.editar(Integer.parseInt(request.getParameter("txtAlumno")), Integer.parseInt(request.getParameter("txtAsignatura")), Integer.parseInt(request.getParameter("txtTrimestre")), Double.parseDouble(request.getParameter("txtNota")));
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarMa(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void eliminarM(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        int idA = Integer.parseInt(request.getParameter("idm"));
        mat.setAlumno_id(idA);
        mdao.eliminar(idA);
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void alumno(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void alumnoN(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarA(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        AlumnoBBDD a = new AlumnoBBDD();
        a.editar(Integer.parseInt(request.getParameter("txtAlumnoId")), request.getParameter("txtUsuarioA"), request.getParameter("txtPasswordA"), request.getParameter("txtNombreA"), request.getParameter("txtApellidoA"), Integer.parseInt(request.getParameter("txtNivelId")));
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarAa(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void eliminarA(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idA"));
        a.setId(id);
        adao.eliminar(id);
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void profesor(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void profesorN(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarP(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        ProfesorBBDD p = new ProfesorBBDD();
        p.editar(Integer.parseInt(request.getParameter("txtProfesor")), request.getParameter("txtUsernameP"), request.getParameter("txtPasswordP"), request.getParameter("txtNombreP"), request.getParameter("txtApellidoP"), request.getParameter("txtEmail"), Integer.parseInt(request.getParameter("txtEsp")));
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarPa(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void asignatura(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void asignaturaN(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarAsign(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        AsignaturaBBDD asig = new AsignaturaBBDD();
        asig.editar(Integer.parseInt(request.getParameter("txtAsigId")), request.getParameter("txtNombreAs"), Integer.parseInt(request.getParameter("txtProfId")));
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    protected void editarAsig(HttpServletRequest request, HttpServletResponse response, String acceso)
            throws ServletException, IOException {
        rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("action");
        switch (action) {
            case "adminView":
                acceso = menu;
                this.adminView(request, response, acceso);
                break;
            case "matricula":
                acceso = matricula;
                RequestDispatcher view = request.getRequestDispatcher(acceso);
                view.forward(request, response);
                break;
            case "nuevaM":
                acceso = matriculaN;
                this.nuevaM(request, response, acceso);
                break;
            case "guardarM":
                acceso = matricula;
                this.insertarM(request, response, acceso);
                break;
            case "modificar":
                acceso = matriculaEdit;
                this.editarMa(request, response, acceso);
                break;
            case "ACTUALIZAR":
                acceso = matricula;
                this.editarM(request, response, acceso);
                break;
            case "eliminarM":
                acceso = matricula;
                this.eliminarM(request, response, acceso);
                break;
            case "alumno":
                acceso = alumno;
                this.alumno(request, response, acceso);
                break;
            case "alumnoN":
                acceso = alumnoN;
                this.alumnoN(request, response, acceso);
                break;
            case "modificarA":
                acceso = alumnoEdit;
                this.editarAa(request, response, acceso);
                break;
            case "profesor":
                acceso = profesor;
                this.profesor(request, response, acceso);
                break;
            case "profesorN":
                acceso = profesorN;
                this.profesorN(request, response, acceso);
                break;
            case "modificarP":
                acceso = profesorEdit;
                this.editarAa(request, response, acceso);
                break;
            case "asignatura":
                acceso = asignatura;
                this.asignatura(request, response, acceso);
                break;
            case "asignaturaN":
                acceso = asignaturaN;
                this.asignaturaN(request, response, acceso);
                break;
            case "modificarAsig":
                acceso = asignaturaEdit;
                this.editarAa(request, response, acceso);
                break;

        }

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
        String acceso = "";
        String action = request.getParameter("action");
        switch (action) {
            /*case "guardarM":
                try{
                acceso = matricula;
                this.insertarM(request, response, acceso);
                }catch(Exception e){
                    System.out.println("No se puede guardar"+e);
                }
                break;*/

 /*case "ACTUALIZAR":
                try {
                String idA = request.getParameter("txtAlumno");
                String idAs = request.getParameter("txtAsignatura");
                String trim = request.getParameter("txtTrimestre");
                String note = request.getParameter("txtNota");
                mat.setAlumno_id(Integer.parseInt(idA));
                mat.setAsignatura_id(Integer.parseInt(idAs));
                mat.setTrimestre(Integer.parseInt(trim));
                mat.setNota(Integer.parseInt(note));
                mdao.editar(mat);
                }catch(Exception e){
                    System.out.println("No se puede actualizar"+e);
                }
                break;*/
        }
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
