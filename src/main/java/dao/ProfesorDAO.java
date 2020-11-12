/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author samuel
 */
public interface ProfesorDAO {
    public List listar();
    public List listarasignaturas();
    public List listaralumnosasignatura(int idasig);
}
