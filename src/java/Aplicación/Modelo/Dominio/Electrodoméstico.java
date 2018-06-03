package Aplicación.Modelo.Dominio;

import java.io.Serializable;

/**
 *
 * @author Marcos
 */
public class Electrodoméstico implements Serializable {
    
    private String código;
    private String tipo;
    private Marca marca;

    public Electrodoméstico() {
    }

    public Electrodoméstico(String código, String tipo, Marca marca) {
        this.código = código;
        this.tipo = tipo;
        this.marca = marca;
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
