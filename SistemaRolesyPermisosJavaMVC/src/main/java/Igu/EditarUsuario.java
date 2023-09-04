
package Igu;

import Logica.Controladora;
import Logica.Rol;
import Logica.Usuario;
import static com.mysql.cj.util.StringUtils.isNullOrEmpty;
import javax.swing.JOptionPane;


public class EditarUsuario extends javax.swing.JFrame
{
    Controladora controladora = null;
    Usuario usuario = null;
   
    public EditarUsuario( Controladora controladora, Usuario usuario, int idUsuario)
    {
        initComponents();
        
        this.controladora = controladora;
        this.usuario = usuario;
        
        CargarUsuario(idUsuario);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboRol = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnVerUsarios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("EDITAR ADMINISTRADOR DE USUARIOS");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Nombre Usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Rol                     :");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Password           :");

        btnLimpiar.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 51, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(255, 51, 0));
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 51, 0));

        btnVerUsarios.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnVerUsarios.setForeground(new java.awt.Color(255, 51, 0));
        btnVerUsarios.setText("Ver Usuarios");
        btnVerUsarios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVerUsariosActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditarUsuario)
                                .addGap(51, 51, 51)
                                .addComponent(btnVerUsarios, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnLimpiar)
                    .addComponent(btnVerUsarios)
                    .addComponent(btnSalir))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimpiarActionPerformed
    {//GEN-HEADEREND:event_btnLimpiarActionPerformed
        txtNombreUser.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarUsuarioActionPerformed
    {//GEN-HEADEREND:event_btnEditarUsuarioActionPerformed
        if (isNullOrEmpty(txtNombreUser.getText()))
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese un Usuario.!");
            return;
        }

        if (isNullOrEmpty(txtNombreUser.getText()))
        {
            JOptionPane.showMessageDialog(null, "Por favor ingres un Password!");
            return;
        }

        try
        {
             int salida = JOptionPane.showConfirmDialog(null,
                            "Desea Editar el Registro con Email: ? " + usuario.getEmail() + " , De la BD.", "Editar Usuario",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (salida == 0)
                    {
                        //Obtengo el Id del ELemto a eliminar dela gtabla:
                         txtNombreUser.setText(usuario.getEmail());
                         txtPassword.setText(usuario.getPassword());
                         cboRol.setSelectedItem(usuario.getUnRol().getNombreRol());

//                        controladora.EditarUsuario(idUsuario);

                        JOptionPane.showMessageDialog(null, "Registro Editado de la BD.....!");

                       
                    }
        }
        catch (Exception e)
        {
            System.out.println("ERROR en Alta Usuario: " + e.getMessage());
        }

    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnVerUsariosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerUsariosActionPerformed
    {//GEN-HEADEREND:event_btnVerUsariosActionPerformed
        AdminPrincipal adminPrincipal = new AdminPrincipal(controladora, usuario);
        adminPrincipal.setVisible(true);
        adminPrincipal.setLocationRelativeTo(null);

        dispose();
    }//GEN-LAST:event_btnVerUsariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        if (controladora.TraerListaRoles() != null)
        {
            for (Rol TraerListaRole : controladora.TraerListaRoles())
            {
                cboRol.addItem(TraerListaRole.getNombreRol());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry!, No existen Roles en la BD.");
        }
    }//GEN-LAST:event_formWindowOpened

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerUsarios;
    private javax.swing.JComboBox<String> cboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void CargarUsuario(int idUsuario)
    {
        usuario = controladora.TraertUsrioPorId(idUsuario);
        
        txtNombreUser.setText(usuario.getEmail());
        txtPassword.setText(usuario.getPassword());
        cboRol.addItem(usuario.getUnRol().getNombreRol());
        
        
    }
}
