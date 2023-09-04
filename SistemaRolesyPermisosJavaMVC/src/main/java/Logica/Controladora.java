package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora
{

    ControladoraPersistencia controladoraPersistencia = null;

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

        return null;
    }

    public List<Usuario> TraerListaUsuarios()
    {
        List<Usuario> usuarios = controladoraPersistencia.ListaUSuarios();

        return usuarios;
    }

    public List<Rol> TraerListaRoles()
    {
        return controladoraPersistencia.TraerListaRoles();
    }

    public void AltaUsuario(String email, String password, String rolRecibido)
    {
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setPassword(password);

        //Aqui debo buscar el rol selecinado para crean el nuevo usuario y luego asignarlo al usurio:
        Rol findRol = new Rol();
        findRol = this.TraerRole(rolRecibido);

        if (findRol != null)
        {
            usuario.setUnRol(findRol);
        }

        //taer el ultimo id de la tabla usuario: nota agregar + 1, por que estaria duplicando el ultimo registro o id
//        int id = this.BuscarUltimoIdUsarios();
//        usuario.setId(id + 1);
        controladoraPersistencia.AltaUsuario(usuario);
    }

    private Rol TraerRole(String rolRecibido)
    {
        List<Rol> roles = TraerListaRoles();

        for (Rol role : roles)
        {
            if (role.getNombreRol().equals(rolRecibido))
            {
                return role;
            }
        }

        return null;

    }

    private int BuscarUltimoIdUsarios()
    {
        List<Usuario> listUsuarios = this.TraerListaUsuarios();

        Usuario usuario = listUsuarios.get(listUsuarios.size() - 1);

        return usuario.getId();
    }

    public void BorrarUsuario(int idUsuario)
    {
        controladoraPersistencia.BorrarUsuario(idUsuario);
    }

    public void EditarUsuario(int idUsuario)
    {
        
    }

    public Usuario TraertUsrioPorId(int idUsuario)
    {
        return  controladoraPersistencia.TraertUsrioPorId(idUsuario);
    }
}
