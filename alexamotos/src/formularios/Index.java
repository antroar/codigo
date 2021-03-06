/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.*;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AnToine
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
        
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
       
        setIconImage (new ImageIcon(getClass().getResource("/images/icon.jpg")).getImage());
       home();
        foto2();
        foto3();
        btnsalir();
        btnclien();
        btnrefa();
        btnsservicio();
        btnventa();
        //ajustar();
        MoveMouseListener mml = new MoveMouseListener(mmover);
        mmover.addMouseListener(mml);
        mmover.addMouseMotionListener(mml);
        float escalar = 0.5F; // una ventana al 50% del tamaño de la pantalla
int ancho = (int)(Toolkit.getDefaultToolkit().getScreenSize(). width*escalar);
int alto = (int)(Toolkit.getDefaultToolkit().getScreenSize(). height*escalar);
this.setSize(ancho,alto);
        
       // this.setExtendedState(MAXIMIZED_BOTH);
    }
    public void ajustar(){
        
         /*jLabel1 = new javax.swing.JLabel();
escritorio = new javax.swing.JDesktopPane();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 30, 20));
       add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 30, 20));*/
    }//ajustar

public void foto2(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/max.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        mmax.setIcon(iconoEscalado);
        if(mmax.getText().equals("Maximizar" ) ) { 
setExtendedState( JFrame.MAXIMIZED_BOTH ) ; 
mmax.setText("Restaurar"); 
mmover.setEnabled(false);
}else{ 
setExtendedState( JFrame.NORMAL ) ; 
mmax.setText( "Maximizar" ) ; 
mmover.setEnabled(true);
} 
                     
}
public void foto3(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/move.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        mmover.setIcon(iconoEscalado);
                     
}
public void btnsalir(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        msalir.setIcon(iconoEscalado);
                     
}
public void btnsservicio(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/servicio.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        mservicio.setIcon(iconoEscalado);
                     
}
public void btnrefa(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        mrefa.setIcon(iconoEscalado);
                     
}
public void btnventa(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/venta.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        mventa.setIcon(iconoEscalado);
                     
}
public void btnclien(){
    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        mclientes.setIcon(iconoEscalado);
                     
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mclientes = new javax.swing.JMenu();
        mventa = new javax.swing.JMenu();
        mrefa = new javax.swing.JMenu();
        mservicio = new javax.swing.JMenu();
        msalir = new javax.swing.JMenu();
        mmover = new javax.swing.JMenu();
        mmax = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBounds(new java.awt.Rectangle(500, 500, 100, 100));
        setName("index");
        setUndecorated(true);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        mclientes.setText("Clientes");
        mclientes.setToolTipText("Click para agregar, modificar, consultar o/y eliminar clientes");
        mclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mclientes.setFont(new java.awt.Font("Gungsuh", 1, 24)); // NOI18N
        mclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mclientesMouseClicked(evt);
            }
        });
        jMenuBar2.add(mclientes);

        mventa.setText("Ventas");
        mventa.setToolTipText("Click para agregar, consultar o/y eliminar venta.");
        mventa.setFont(new java.awt.Font("Gungsuh", 1, 24)); // NOI18N
        jMenuBar2.add(mventa);

        mrefa.setText("Refacción");
        mrefa.setToolTipText("Click para agregar, modificar, consultar o/y eliminar refacciones.");
        mrefa.setFont(new java.awt.Font("Gungsuh", 1, 24)); // NOI18N
        jMenuBar2.add(mrefa);

        mservicio.setText("Servicio");
        mservicio.setToolTipText("Click para agregar, modificar, consultar o/y eliminar servicio");
        mservicio.setFont(new java.awt.Font("Gungsuh", 1, 24)); // NOI18N
        jMenuBar2.add(mservicio);

        msalir.setText("Salir");
        msalir.setToolTipText("Click para cerrar programa.");
        msalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        msalir.setFont(new java.awt.Font("Gungsuh", 1, 24)); // NOI18N
        msalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msalirMouseClicked(evt);
            }
        });
        jMenuBar2.add(msalir);

        mmover.setToolTipText("Click presionado para mover ventana");
        mmover.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jMenuBar2.add(mmover);

        mmax.setToolTipText("Click para maximizar o restaurar");
        mmax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmaxMouseClicked(evt);
            }
        });
        jMenuBar2.add(mmax);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void msalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msalirMouseClicked
int dato = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de salir ");
        if (dato == 0) {
            System.exit(0);
            JOptionPane.showMessageDialog(rootPane, "Sección terminada");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_msalirMouseClicked

    private void mmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmaxMouseClicked
          if (mmax.getText().equals("Maximizar")) {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            mmax.setText("Restaurar");
            mmover.setEnabled(false);
        } else {
            setExtendedState(JFrame.NORMAL);
            mmax.setText("Maximizar");
            mmover.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_mmaxMouseClicked

    private void mclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mclientesMouseClicked
this.escritorio.removeAll();
this.escritorio.repaint();
Clientes acl = new Clientes();
this.escritorio.add(acl);
        try {
            acl.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
acl.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_mclientesMouseClicked
    
   public void home(){
       homing acl = new homing();
this.escritorio.add(acl);
        try {
            acl.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
acl.show();
   }
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu mclientes;
    private javax.swing.JMenu mmax;
    private javax.swing.JMenu mmover;
    private javax.swing.JMenu mrefa;
    private javax.swing.JMenu msalir;
    private javax.swing.JMenu mservicio;
    private javax.swing.JMenu mventa;
    // End of variables declaration//GEN-END:variables
}
