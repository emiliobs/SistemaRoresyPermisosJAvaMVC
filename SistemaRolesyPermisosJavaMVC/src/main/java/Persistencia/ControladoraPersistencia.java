
package Persistencia;

import Logica.Usuario;
import java.util.List;


public class ControladoraPersistencia
{
    RolJpaController1  rolJpaController1 = new  RolJpaController1();
    UsuarioJpaController1 usuarioJpaController1 = new UsuarioJpaController1();
    
    

    public ControladoraPersistencia()
    {
      
        
    }

    public List<Usuario> ListaUSuarios()
    {
        return usuarioJpaController1.findUsuarioEntities();
    }

    
    
}
