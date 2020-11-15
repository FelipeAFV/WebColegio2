
package modelo;

/**
 *
 * @author jvarg
 */
public class MatriculaDTO {
    private int alumno_id;
    private int asignatura_id;
    private int trimestre;
    private double nota;

    public int getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }

    public int getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(int asignatura_id) {
        this.asignatura_id = asignatura_id;
    }


    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
