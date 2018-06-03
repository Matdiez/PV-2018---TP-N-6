package Aplicación.Modelo.Datos;

import Aplicación.Modelo.Dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListaUsuario implements Serializable {
    
    private ArrayList <Usuario> listaUsuario;

    public ListaUsuario() {
        listaUsuario = new ArrayList();
        listaUsuario.add(new Usuario("Admin", "Admin"));
        listaUsuario.add(new Usuario("Jorge", "Hola123"));
        listaUsuario.add(new Usuario("Mónica", "Tita"));
    }

    public ListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
    public Usuario validarUsuario(String user, String password) {
        Usuario unUsuario = null;
        for (Usuario u : listaUsuario) {
            if (u.getUser().equals(user) && u.getPassword().equals(password)) {
                unUsuario = u;
                break;
            }
        }
        return unUsuario;
    }

    /**
     * @return the listaUsuario
     */
    public ArrayList <Usuario> getListaUsuario() {
        return listaUsuario;
    }

    /**
     * @param listaUsuario the listaUsuario to set
     */
    public void setListaUsuario(ArrayList <Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
}
