
package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.MatriculaDTO;

/**
 *
 * @author jvarg
 */
public interface MatriculaDAO {
    //public ArrayList<MatriculaDTO> listar();
    public List listar();
    public MatriculaDTO list(int id_alumno);
    public boolean add(MatriculaDTO m);
    public boolean editar(int id,int asignatura_id,int trimestre,double nota);
    public boolean eliminar(int id_alumno);
}
