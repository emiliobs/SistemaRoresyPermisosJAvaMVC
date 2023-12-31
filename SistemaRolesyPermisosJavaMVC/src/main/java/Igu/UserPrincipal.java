package Igu;

import Logica.Controladora;
import Logica.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserPrincipal extends javax.swing.JFrame
{

    Controladora controladora = null;
    Usuario usuario = null;

    public UserPrincipal(Controladora controladora, Usuario usuario)
    {
        this.controladora = controladora;
        initComponents();
        this.usuario = usuario;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreUsaurio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnNuevoUsuario = new javax.swing.JButton();
        btnRecargarTAbla = new javax.swing.JButton();
        btnSAlir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Usuario!");
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator1.setBackground(new java.awt.Color(255, 51, 0));

        txtNombreUsaurio.setEditable(false);
        txtNombreUsaurio.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreUsaurio.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        txtNombreUsaurio.setForeground(new java.awt.Color(255, 51, 0));
        txtNombreUsaurio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("SISTEMA ADMINISTRADOR DE USUARIOS");

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(tblUser);

        btnNuevoUsuario.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 51, 0));
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnRecargarTAbla.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnRecargarTAbla.setForeground(new java.awt.Color(255, 51, 0));
        btnRecargarTAbla.setText("Recargar Tabla");
        btnRecargarTAbla.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRecargarTAblaActionPerformed(evt);
            }
        });

        btnSAlir.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        btnSAlir.setForeground(new java.awt.Color(255, 51, 0));
        btnSAlir.setText("Salir");
        btnSAlir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSAlirActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Usuario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(btnRecargarTAbla, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnSAlir, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(319, 319, 319))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreUsaurio, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecargarTAbla)
                    .addComponent(btnNuevoUsuario)
                    .addComponent(btnSAlir))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtNombreUsaurio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(495, 495, 495)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAlirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSAlirActionPerformed
    {//GEN-HEADEREND:event_btnSAlirActionPerformed
         Login login = new Login();
       login.setVisible(true);
       login.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnSAlirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        txtNombreUsaurio.setText(usuario.getEmail());

        CargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnRecargarTAblaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRecargarTAblaActionPerformed
    {//GEN-HEADEREND:event_btnRecargarTAblaActionPerformed
        CargarTabla();
    }//GEN-LAST:event_btnRecargarTAblaActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
    {//GEN-HEADEREND:event_btnNuevoUsuarioActionPerformed
        AltaUsuario altaUsuario = new AltaUsuario(controladora, usuario);
        altaUsuario.setVisible(true);
        altaUsuario.setLocationRelativeTo(null);
        
         dispose();
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecargarTAbla;
    private javax.swing.JButton btnSAlir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtNombreUsaurio;
    // End of variables declaration//GEN-END:variables

    private void CargarTabla()
    {
        //Definir el modelo que queremos que tenga la tabla:
        DefaultTableModel tableModel = new DefaultTableModel()
        {
            // Aqui que las fila y columnas no sean Editables:
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }

        };

        //Aqui establezco losnombres de la columnas
        String titulos[] =
        {
            "Id", "Usuario", "Rol"
        };
        tableModel.setColumnIdentifiers(titulos);

        //Traer de la bd la lista de usuarios;
        List<Usuario> listaUsuarios = controladora.TraerListaUsuarios();

        if (listaUsuarios != null)
        {
            //Recorrer la lista
            for (Usuario listaUsuario : listaUsuarios)
            {
                if (listaUsuario.getUnRol().getNombreRol().equals("User"))
                {
                    Object[] objects =
                    {
                        listaUsuario.getId(),
                        listaUsuario.getEmail(),
                        listaUsuario.getUnRol().getNombreRol()
                    };

                    tableModel.addRow(objects);
                }
              
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry!, No hay Datos en la BD.");
        }

        tblUser.setModel(tableModel);

    }
}
