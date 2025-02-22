/**
 * La clase Comentario representa un comentario realizado por un usuario,
 * incluyendo su nombre, fecha, calificación y el contenido del comentario.
 */
public class Comentario {
    private String nombre;
    private String fecha;
    private int calificacion;
    private String comentario;

    /**
     * Constructor de la clase Comentario.
     * 
     * @param nombre       Nombre del usuario que realizó el comentario.
     * @param fecha        Fecha en la que se realizó el comentario.
     * @param calificacion Calificación dada en el comentario (en estrellas).
     * @param comentario   Contenido del comentario.
     */
    public Comentario(String nombre, String fecha, int calificacion, String comentario) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    /**
     * Establece el nombre del usuario que realizó el comentario.
     * 
     * @param nombre Nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del usuario que realizó el comentario.
     * 
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece la fecha en la que se realizó el comentario.
     * 
     * @param fecha Fecha del comentario.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la fecha en la que se realizó el comentario.
     * 
     * @return Fecha del comentario.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la calificación dada en el comentario.
     * 
     * @param calificacion Calificación en estrellas.
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene la calificación dada en el comentario.
     * 
     * @return Calificación en estrellas.
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece el contenido del comentario.
     * 
     * @param comentario Contenido del comentario.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el contenido del comentario.
     * 
     * @return Contenido del comentario.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Imprime el comentario con todos sus detalles en la consola.
     */
    public void imprimirComentario() {
        System.out.println(getNombre() + " " + getFecha() + " ");
        System.out.println("");
        System.out.println(getComentario());
        System.out.println("");
        System.out.println("Calificacion: " + getCalificacion() + " Estrellas.");
        System.out.println("-------");
    }
}
