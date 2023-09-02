
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable
{
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String email;
    private String password;

   
}
