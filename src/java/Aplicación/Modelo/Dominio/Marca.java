package Aplicación.Modelo.Dominio;

import java.io.Serializable;

/**
 *
 * @author Marcos
 */
public class Marca implements Serializable {
    
    private String código;
    private String nombre;

    public Marca() {
    }

    public Marca(String código, String nombre) {
        this.código = código;
        this.nombre = nombre;
    }

    /**
     * @return the código
     */
    public String getCódigo() {
        return código;
    }

    /**
     * @param código the código to set
     */
    public void setCódigo(String código) {
        this.código = código;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
