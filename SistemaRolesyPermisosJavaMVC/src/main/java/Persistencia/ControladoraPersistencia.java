
package Persistencia;

import Logica.Usuario;
import java.util.List;


public class ControladoraPersistencia
{
    
    RolJpaController rolJpaController = null;
    UsuarioJpaController usuarioJpaController = null;
    

    public ControladoraPersistencia()
    {
       rolJpaController = new RolJpaController();
       usuarioJpaController = new UsuarioJpaController();
    }

    public List<Usuario> ListaUSuarios()
    {
       return usuarioJpaController.findUsuarioEntities();
    }
    
}
