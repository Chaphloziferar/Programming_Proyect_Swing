/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programming_Proyect_Swing;

import Classes.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC 2
 */
public class Ventana_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
    public Ventana_Principal() {
        initComponents();
        this.setSize(1000, 625);
        this.setLocationRelativeTo(null);
        
        File file = new File("Personas.dat");
        
        if(file.exists()){
            try{
                ObjectInputStream ois = new  ObjectInputStream(new FileInputStream("Personas.dat"));
                Ventana_Agregar.Lista = (LinkedList<Persona>) ois.readObject();
                ois.close();
            }catch(IOException | ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chaphloziferar's Game Station");
        setResizable(false);
        getContentPane().setLayout(null);

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banner.png"))); // NOI18N
        getContentPane().add(Banner);
        Banner.setBounds(0, 0, 1000, 120);

        Agregar.setBackground(new java.awt.Color(204, 153, 0));
        Agregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Agregar.setText("Agregar Registro");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar);
        Agregar.setBounds(110, 200, 210, 50);

        Modificar.setBackground(new java.awt.Color(204, 153, 0));
        Modificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Modificar.setText("Modificar Registro");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar);
        Modificar.setBounds(110, 280, 210, 50);

        Buscar.setBackground(new java.awt.Color(204, 153, 0));
        Buscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Buscar.setText("Buscar Registro");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(700, 200, 210, 50);

        Eliminar.setBackground(new java.awt.Color(204, 153, 0));
        Eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Eliminar.setText("Eliminar Registro");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(700, 280, 210, 50);

        Salir.setBackground(new java.awt.Color(204, 153, 0));
        Salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(400, 490, 210, 50);

        Mostrar.setBackground(new java.awt.Color(204, 153, 0));
        Mostrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Mostrar.setText("Mostrar Registros");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(400, 410, 210, 50);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        getContentPane().add(Logo);
        Logo.setBounds(380, 170, 270, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 390, 260, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 390, 260, 160);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Ventana_Agregar v = new Ventana_Agregar();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Ventana_Buscar_Data v = new Ventana_Buscar_Data();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BuscarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Ventana_Modificar_Data v = new Ventana_Modificar_Data();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Ventana_Eliminar_Data v = new Ventana_Eliminar_Data();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        Ventana_Mostrar v = new Ventana_Mostrar();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Banner;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
