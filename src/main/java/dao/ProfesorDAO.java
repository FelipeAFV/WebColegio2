/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.ProfesorDTO;

/**
 *
 * @author samuel
 */
public interface ProfesorDAO {
    public List listar();
    public List listarasignaturas();
    public List listaralumnosasignatura(int idasig);
<<<<<<< HEAD
    
    //Para el admin
    public ProfesorDTO list(int id);
    public boolean add(ProfesorDTO userP);
    public boolean edit(ProfesorDTO userP);
    public boolean eliminar(int id);
=======
    public boolean updatearnota(int id,int asignatura_id,double nota);
>>>>>>> samuel
}
