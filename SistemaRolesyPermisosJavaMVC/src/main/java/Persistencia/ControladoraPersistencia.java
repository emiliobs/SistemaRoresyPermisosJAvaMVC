
package Persistencia;

import Logica.Rol;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia
{
    RolJpaController1  rolJpaController1 = null; 
    UsuarioJpaController1 usuarioJpaController1 = null; 
    
    

    public ControladoraPersistencia()
    {
      rolJpaController1 = new RolJpaController1();
      usuarioJpaController1 = new UsuarioJpaController1();
    }

    public List<Usuario> ListaUSuarios()
    {
        return usuarioJpaController1.findUsuarioEntities();
    }

    public List<Rol> TraerListaRoles()
    {
       return rolJpaController1.findRolEntities();
       
    }

    public void AltaUsurio(Usuario usuario)
    {
        usuarioJpaController1.create(usuario);
    }

    public void AltaUsuario(Usuario usuario)
    {
        usuarioJpaController1.create(usuario);
    }

    public void BorrarUsuario(int idUsuario)
    {
        try
        {
            usuarioJpaController1.destroy(idUsuario);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EditarUsuario(int idUsuario)
    {
       
    }

    public Usuario TraertUsrioPorId(int idUsuario)
    {
        return usuarioJpaController1.findUsuario(idUsuario);
    }

   

    
    
}
