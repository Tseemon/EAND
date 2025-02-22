import javax.print.DocFlavor.STRING;

/**
 * La clase Empresa representa una empresa participante en un evento,
 * con información sobre su nombre, sector, correo electrónico y stand asignado.
 */

public class Empresa {

    private String nombre;
    private String sector;
    private String email;
    private String stand;

    /**
     * Constructor de la clase Empresa.
     * 
     * @param nombre Nombre de la empresa.
     * @param sector Sector al que pertenece la empresa.
     * @param email  Correo electrónico de contacto de la empresa.
     */
    public Empresa(String nombre, String sector, String email) {
        this.nombre = nombre;
        this.sector = sector;
        this.email = email;
        this.stand = "sin asignar";
    }

    /**
     * Establece el nombre de la empresa.
     * 
     * @param nombre Nombre de la empresa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la empresa.
     * 
     * @return Nombre de la empresa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el sector de la empresa.
     * 
     * @param sector Sector de la empresa.
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * Obtiene el sector de la empresa.
     * 
     * @return Sector de la empresa.
     */
    public String getSector() {
        return sector;
    }

    /**
     * Establece el correo electrónico de contacto de la empresa.
     * 
     * @param email Correo electrónico de la empresa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el correo electrónico de contacto de la empresa.
     * 
     * @return Correo electrónico de la empresa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el stand asignado a la empresa.
     * 
     * @param stand Stand asignado a la empresa.
     */
    public void setStand(String stand) {
        this.stand = stand;
    }

    /**
     * Obtiene el stand asignado a la empresa.
     * 
     * @return Stand asignado a la empresa.
     */
    public String getStand() {
        return stand;
    }
}