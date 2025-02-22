import java.util.ArrayList;

public class Visitante {

    // Atributos privados de la clase Visitante
    private String nombre; // Nombre del visitante
    private int identicacion; // Identificación del visitante
    private String correo; // Correo electrónico del visitante
    private ArrayList<String> stands = new ArrayList<String>(); // Lista de stands visitados

    // Constructor de la clase Visitante
    public Visitante(String nombre, int identificacion, String correo) {
        this.nombre = nombre;
        this.identicacion = identificacion;
        this.correo = correo;
    }

    // Método para establecer el nombre del visitante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre del visitante
    public String getNombre() {
        return nombre;
    }

    // Método para establecer la identificación del visitante
    public void setIdenticacion(int identicacion) {
        this.identicacion = identicacion;
    }

    // Método para obtener la identificación del visitante
    public int getIdenticacion() {
        return identicacion;
    }

    // Método para establecer el correo del visitante
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para obtener el correo del visitante
    public String getCorreo() {
        return correo;
    }

    // Método para agregar un stand visitado a la lista
    public void setStands(String nombre) {
        stands.add(nombre);
    }

    // Método para mostrar los stands visitados por el visitante
    public void getStands() {
        String saveStands = "";
        for (String nombre : stands) {
            saveStands += " " + nombre;
        }
        System.out.println(saveStands);
    }
}
