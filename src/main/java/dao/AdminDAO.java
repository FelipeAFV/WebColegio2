package dao;

import java.util.List;
import modelo.AsignaturaDTO;

/**
 *
 * @author jvarg
 */
public interface AdminDAO {
    
    public List listar();
    public AsignaturaDTO list(int id);
    public boolean add(AsignaturaDTO asig);
    public boolean edit(AsignaturaDTO asig);
    public boolean eliminar(int id);
    
}
