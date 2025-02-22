import java.util.ArrayList;

public class Stand {
    // Atributos de la clase Stand
    private String id; // Identificador único del stand
    private String ubicacion; // Ubicación del stand dentro de la feria
    private String tamaño; // Tamaño del stand (Grande, Mediano, Pequeño)
    private String empresa; // Empresa asignada al stand (por defecto "sin asignar")
    private ArrayList<Comentario> comentarios = new ArrayList<Comentario>(); // Lista de comentarios asociados al stand

    // Constructor de la clase Stand
    public Stand(String id, String ubicacion, String tamaño) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.empresa = "sin asignar"; // Inicialmente, el stand no tiene empresa asignada
    }

    // Métodos setter y getter para el ID del stand
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Métodos setter y getter para la ubicación del stand
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    // Métodos setter y getter para el tamaño del stand
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    // Métodos setter y getter para la empresa asignada al stand
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    // Método para agregar un comentario a la lista de comentarios del stand
    public void setComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    // Método para obtener la lista de comentarios del stand
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    // Método para calcular y devolver el promedio de calificaciones de los
    // comentarios
    public int getPromedio() {
        int calificacionTotal = 0;
        for (Comentario comentario : comentarios) {
            calificacionTotal += comentario.getCalificacion(); // Suma todas las calificaciones
        }
        calificacionTotal = calificacionTotal / comentarios.size(); // Calcula el promedio
        return calificacionTotal;
    }
}
