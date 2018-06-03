package Aplicación.Form.Bean;

import Aplicación.Modelo.Datos.ListaUsuario;
import Aplicación.Modelo.Dominio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Marcos
 */
@ManagedBean
@ViewScoped
public class UsuarioFormBean {

    private String user;
    private String password;

    public UsuarioFormBean() {
    }

    public String validarUsuario() {
        String resultado = null;
        Usuario usuario = null;
        ListaUsuario unUsuario = new ListaUsuario();
        usuario = unUsuario.validarUsuario(user, password);
        if (usuario == null) {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Credenciales inválidas","No existe el usuario");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        else {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,"Ingreso válido","Usuario válido");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValidado", usuario);
            resultado = "/Menú";
        }
        return resultado;
    }
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
