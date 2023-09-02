package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora
{
    ControladoraPersistencia    controladoraPersistencia = null; 
    

    public Controladora()
    {
        controladoraPersistencia = new ControladoraPersistencia();
    }
    
    

    public Usuario FindUserByEmailAndPassword(String email, String password)
    {
        List<Usuario> GetListUsuarios = controladoraPersistencia.ListaUSuarios();
        
        for (Usuario GetListUsuario : GetListUsuarios)
        {
            if (GetListUsuario.getEmail().equals(email) && GetListUsuario.getPassword().equals(password))
            {
                return GetListUsuario;
            }
            
        }
        
        return  null;
    }
    
}
