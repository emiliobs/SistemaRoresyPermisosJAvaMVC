
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String email;
    private String password;
    
    //Relacion Bidereccional
    @ManyToOne
    @JoinColumn(name="fkRol")
    private  Rol unRol;

    public Usuario()
    {
    }

    public Usuario(int id, String email, String password, Rol unRol)
    {
        this.id = id;
        this.email = email;
        this.password = password;
        this.unRol = unRol;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Rol getUnRol()
    {
        return unRol;
    }

    public void setUnRol(Rol unRol)
    {
        this.unRol = unRol;
    }

   
   
    
    
}
