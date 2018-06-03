package Aplicación.Form.Bean;

import Aplicación.Modelo.Datos.ListaElectrodoméstico;
import Aplicación.Modelo.Datos.ListaMarca;
import Aplicación.Modelo.Dominio.Electrodoméstico;
import Aplicación.Modelo.Dominio.Marca;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Marcos
 */
@ManagedBean
@ViewScoped
public class ElectrodomésticoFormBean {

    private String código;
    private String tipo;
    private Marca marca;
    private Date fecha;
    private ListaMarca listadoMarca;
    private ArrayList <Marca> listaM;
    private ArrayList <Electrodoméstico> lista;
    private Electrodoméstico unElectrodoméstico;
    private ListaElectrodoméstico listadoElectrodoméstico;
    
    public ElectrodomésticoFormBean() {
        lista = new ArrayList();
        listadoMarca = new ListaMarca();
        listadoElectrodoméstico = new ListaElectrodoméstico();
        listadoMarca.getListaMarca().add(new Marca("1", "HP"));
        listadoMarca.getListaMarca().add(new Marca("2", "Sony"));
        listadoMarca.getListaMarca().add(new Marca("3", "Lenovo"));
        listadoMarca.getListaMarca().add(new Marca("4", "Samsung"));    
    }
    
    public void agregarElectrodoméstico() {
        unElectrodoméstico = new Electrodoméstico(getCódigo(), getTipo(), getMarca());        
        lista = getListadoElectrodoméstico().agregarElectrodomésticos(unElectrodoméstico);
    }
    
    public void limpiarListado() {
        getListadoElectrodoméstico().getListaElectrodoméstico().clear();
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
     * @return the unElectrodoméstico
     */
    public Electrodoméstico getUnElectrodoméstico() {
        return unElectrodoméstico;
    }

    /**
     * @param unElectrodoméstico the unElectrodoméstico to set
     */
    public void setUnElectrodoméstico(Electrodoméstico unElectrodoméstico) {
        this.unElectrodoméstico = unElectrodoméstico;
    }

    /**
     * @return the lista
     */
    public ArrayList <Electrodoméstico> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList <Electrodoméstico> lista) {
        this.lista = lista;
    }

    /**
     * @return the listadoElectrodoméstico
     */
    public ListaElectrodoméstico getListadoElectrodoméstico() {
        return listadoElectrodoméstico;
    }

    /**
     * @param listadoElectrodoméstico the listadoElectrodomésticos to set
     */
    public void setListadoElectrodoméstico(ListaElectrodoméstico listadoElectrodoméstico) {
        this.listadoElectrodoméstico = listadoElectrodoméstico;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @return the listaM
     */
    public ArrayList <Marca> getListaM() {
        return listaM;
    }

    /**
     * @param listaM the listaM to set
     */
    public void setListaM(ArrayList <Marca> listaM) {
        this.listaM = listaM;
    }

    /**
     * @return the listadoMarca
     */
    public ListaMarca getListadoMarca() {
        return listadoMarca;
    }

    /**
     * @param listadoMarca the listadoMarca to set
     */
    public void setListadoMarca(ListaMarca listadoMarca) {
        this.listadoMarca = listadoMarca;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
