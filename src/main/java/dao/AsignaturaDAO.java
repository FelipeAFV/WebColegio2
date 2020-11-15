/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.AsignaturaDTO;


public interface AsignaturaDAO {
    public List listar();
    public AsignaturaDTO list(int id);
    public boolean add(AsignaturaDTO ma);
    public boolean editar(int asignatura_id,String nombre,int idprofe);
    public boolean eliminar(int id);
    
}
