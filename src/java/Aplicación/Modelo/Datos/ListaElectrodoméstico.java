package Aplicación.Modelo.Datos;

import Aplicación.Modelo.Dominio.Electrodoméstico;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListaElectrodoméstico implements Serializable {
    
    private ArrayList<Electrodoméstico> listaElectrodoméstico;

    public ListaElectrodoméstico() {
        listaElectrodoméstico = new ArrayList();
    }

    public ListaElectrodoméstico(ArrayList<Electrodoméstico> listaElectrodoméstico) {
        this.listaElectrodoméstico = listaElectrodoméstico;
    }
    
    public ArrayList <Electrodoméstico> agregarElectrodomésticos(Electrodoméstico unElectrodoméstico) {
        getListaElectrodoméstico().add(unElectrodoméstico);
        return getListaElectrodoméstico();
    }
    
    public void modificarElectrodomésticos() {
        
    }

    public void eliminarElectrodomésticos() {
        
    }
    
    /**
     * @return the listaElectrodoméstico
     */
    public ArrayList<Electrodoméstico> getListaElectrodoméstico() {
        return listaElectrodoméstico;
    }

    /**
     * @param listaElectrodoméstico the listaElectrodoméstico to set
     */
    public void setListaElectrodoméstico(ArrayList<Electrodoméstico> listaElectrodoméstico) {
        this.listaElectrodoméstico = listaElectrodoméstico;
    }
    
}
