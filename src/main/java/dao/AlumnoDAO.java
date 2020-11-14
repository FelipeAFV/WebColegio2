/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.AlumnoDTO;
import modelo.AsignaturaDTO;
import modelo.NotaDTO;
import modelo.ProfesorDTO;

/**
 *
 * @author f_fig
 */
public interface AlumnoDAO {
    
    public ArrayList<ProfesorDTO> listarProfesores(int idAlumno);
    public ArrayList<AlumnoDTO> listarAlumnos(int idAlumno);
    public ArrayList<AsignaturaDTO> listarAsignaturas(int idAlumno);
    public ArrayList<Double> listarNotasAsignatura(int idAsign, int idAlum);
    
    //Para el admin
    public List listar();
    public AlumnoDTO list(int id);
    public boolean add(AlumnoDTO userA);
    public boolean edit(AlumnoDTO userA);
    public boolean eliminar(int id);
    
}
