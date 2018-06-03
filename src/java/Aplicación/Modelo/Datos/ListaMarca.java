package Aplicación.Modelo.Datos;

import Aplicación.Modelo.Dominio.Marca;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListaMarca implements Serializable {
    
    private ArrayList <Marca> listaMarca;

    public ListaMarca() {
        listaMarca = new ArrayList();
    }

    public ListaMarca(ArrayList<Marca> listaMarca) {
        this.listaMarca = listaMarca;
    }

    /**
     * @return the listaMarca
     */
    public ArrayList <Marca> getListaMarca() {
        return listaMarca;
    }

    /**
     * @param listaMarca the listaMarca to set
     */
    public void setListaMarca(ArrayList <Marca> listaMarca) {
        this.listaMarca = listaMarca;
    }
    
}
