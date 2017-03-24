/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_examen2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario Dell
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        CargarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void cargarUsuarios() {
        au.cargarArchivoBinario();
        usuarios = au.getListausuario();
    }

    public void CargarTodo() {
        cargarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearUsuarios = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombreusuario = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        ps_password = new javax.swing.JPasswordField();
        bt_crearusuarion = new javax.swing.JButton();
        CrearCanciones = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombrecancion = new javax.swing.JTextField();
        tf_artistacancion = new javax.swing.JTextField();
        bt_crearcancion = new javax.swing.JButton();
        cb_albums = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_genero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_duracion = new javax.swing.JTextField();
        CrearAlbums = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombrealbum = new javax.swing.JTextField();
        tf_artistaalbum = new javax.swing.JTextField();
        bt_crearalbum = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        tf_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edadActionPerformed(evt);
            }
        });

        bt_crearusuarion.setText("Crear");
        bt_crearusuarion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearusuarionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearUsuariosLayout = new javax.swing.GroupLayout(CrearUsuarios.getContentPane());
        CrearUsuarios.getContentPane().setLayout(CrearUsuariosLayout);
        CrearUsuariosLayout.setHorizontalGroup(
            CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearUsuariosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_crearusuarion)
                    .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_nombreusuario)
                        .addComponent(tf_edad)
                        .addComponent(tf_username)
                        .addComponent(ps_password, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        CrearUsuariosLayout.setVerticalGroup(
            CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearUsuariosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ps_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bt_crearusuarion)
                .addGap(38, 38, 38))
        );

        CrearCanciones.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                CrearCancionesWindowActivated(evt);
            }
        });

        jLabel5.setText("Nombre");

        jLabel6.setText("Artista");

        bt_crearcancion.setText("Crear");
        bt_crearcancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearcancionActionPerformed(evt);
            }
        });

        jLabel9.setText("Album");

        jLabel10.setText("Genero");

        jLabel11.setText("Duracion");

        javax.swing.GroupLayout CrearCancionesLayout = new javax.swing.GroupLayout(CrearCanciones.getContentPane());
        CrearCanciones.getContentPane().setLayout(CrearCancionesLayout);
        CrearCancionesLayout.setHorizontalGroup(
            CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCancionesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(68, 68, 68)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_crearcancion)
                    .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_albums, 0, 169, Short.MAX_VALUE)
                        .addComponent(tf_artistacancion)
                        .addComponent(tf_nombrecancion)
                        .addComponent(tf_genero)
                        .addComponent(tf_duracion)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        CrearCancionesLayout.setVerticalGroup(
            CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCancionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombrecancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_artistacancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(CrearCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_albums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addComponent(bt_crearcancion)
                .addGap(89, 89, 89))
        );

        jLabel7.setText("Nombre");

        jLabel8.setText("Artista");

        tf_nombrealbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombrealbumActionPerformed(evt);
            }
        });

        bt_crearalbum.setText("Crear");
        bt_crearalbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearalbumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearAlbumsLayout = new javax.swing.GroupLayout(CrearAlbums.getContentPane());
        CrearAlbums.getContentPane().setLayout(CrearAlbumsLayout);
        CrearAlbumsLayout.setHorizontalGroup(
            CrearAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearAlbumsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(CrearAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(74, 74, 74)
                .addGroup(CrearAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_artistaalbum, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(tf_nombrealbum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearAlbumsLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(bt_crearalbum)
                .addGap(152, 152, 152))
        );
        CrearAlbumsLayout.setVerticalGroup(
            CrearAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearAlbumsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CrearAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombrealbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CrearAlbumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_artistaalbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(bt_crearalbum)
                .addGap(80, 80, 80))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Canciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Albums");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Login");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Guardar Usuarios");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Cargar Usuarios");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.CrearUsuarios.setModal(true);
        this.CrearUsuarios.pack();
        this.CrearUsuarios.setLocationRelativeTo(this);
        this.CrearUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tf_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_edadActionPerformed

    private void bt_crearusuarionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearusuarionActionPerformed
        // TODO add your handling code here:

        u = new Usuario(tf_nombreusuario.getText(),
                Integer.parseInt(tf_edad.getText()),
                tf_username.getText(), ps_password.getText());

        au.cargarArchivoBinario();
        au.setUsuario(u);
        au.escribirArchivo();
        JOptionPane.showMessageDialog(this, "El usuario fue creado ");
        tf_nombreusuario.setText("");
        tf_edad.setText("");
        tf_username.setText("");
        ps_password.setText("");
    }//GEN-LAST:event_bt_crearusuarionActionPerformed

    private void bt_crearcancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearcancionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_crearcancionActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.CrearAlbums.setModal(true);
        this.CrearAlbums.pack();
        this.CrearAlbums.setLocationRelativeTo(this);
        this.CrearAlbums.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void bt_crearalbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearalbumActionPerformed
        // TODO add your handling code here:
        al = new Album(tf_nombrealbum.getText(), tf_artistaalbum.getText());
        album.add(al);
        JOptionPane.showMessageDialog(this, "Album Creado");
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Album temp : album) {
            modelo.addElement(temp);
        }
        cb_albums.setModel(modelo);
        tf_nombrealbum.setText("");
        tf_artistaalbum.setText("");
    }//GEN-LAST:event_bt_crearalbumActionPerformed

    private void tf_nombrealbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombrealbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombrealbumActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (cb_albums.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Debe haber un álbum en existencia para poder crear una canción");
        } else {
            this.CrearCanciones.setModal(true);
            this.CrearCanciones.pack();
            this.CrearCanciones.setLocationRelativeTo(this);
            this.CrearCanciones.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CrearCancionesWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_CrearCancionesWindowActivated
        // TODO add your handling code here:
//        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
//        for (Album temp : album) {
//            modelo.addElement(temp);
//        }
//        cb_albums.setModel(modelo);
    }//GEN-LAST:event_CrearCancionesWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CrearAlbums;
    private javax.swing.JDialog CrearCanciones;
    private javax.swing.JDialog CrearUsuarios;
    private javax.swing.JButton bt_crearalbum;
    private javax.swing.JButton bt_crearcancion;
    private javax.swing.JButton bt_crearusuarion;
    private javax.swing.JComboBox<String> cb_albums;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPasswordField ps_password;
    private javax.swing.JTextField tf_artistaalbum;
    private javax.swing.JTextField tf_artistacancion;
    private javax.swing.JTextField tf_duracion;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_genero;
    private javax.swing.JTextField tf_nombrealbum;
    private javax.swing.JTextField tf_nombrecancion;
    private javax.swing.JTextField tf_nombreusuario;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
    Usuario u = new Usuario();
    AdminUsuario au = new AdminUsuario("./Usuarios.cbm");
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Canciones> canciones = new ArrayList();
    Album al = new Album();
    ArrayList<Album> album = new ArrayList();

}
