/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programming_Proyect_Swing;

import Classes.Persona;
import static Programming_Proyect_Swing.Ventana_Buscar.p;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC 2
 */
public class Ventana_Eliminar extends javax.swing.JFrame {

    public static int pos;

    public Ventana_Eliminar() {
        initComponents();
        this.setSize(450, 555);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
        Nombre = new javax.swing.JTextField();
        Consola = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comentario = new javax.swing.JTextArea();
        Precio = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Registro");
        getContentPane().setLayout(null);

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banner1.png"))); // NOI18N
        getContentPane().add(Banner);
        Banner.setBounds(0, 0, 450, 90);

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setEnabled(false);
        getContentPane().add(Nombre);
        Nombre.setBounds(130, 110, 260, 29);

        Consola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Consola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Consola.setEnabled(false);
        getContentPane().add(Consola);
        Consola.setBounds(130, 160, 260, 29);

        Edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Edad.setEnabled(false);
        getContentPane().add(Edad);
        Edad.setBounds(130, 210, 260, 29);

        Fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fecha.setEnabled(false);
        getContentPane().add(Fecha);
        Fecha.setBounds(130, 260, 260, 29);

        Comentario.setColumns(20);
        Comentario.setRows(5);
        Comentario.setEnabled(false);
        jScrollPane1.setViewportView(Comentario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 310, 260, 70);

        Precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Precio.setEnabled(false);
        getContentPane().add(Precio);
        Precio.setBounds(100, 400, 120, 29);

        Codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo.setEnabled(false);
        getContentPane().add(Codigo);
        Codigo.setBounds(300, 400, 120, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 68, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Consola:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 60, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 210, 60, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 260, 50, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Comentario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 330, 90, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 400, 60, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 400, 50, 29);

        Eliminar.setBackground(new java.awt.Color(153, 204, 0));
        Eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(70, 460, 120, 40);

        Cancelar.setBackground(new java.awt.Color(204, 153, 0));
        Cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(250, 460, 120, 40);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo1.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 450, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Ventana_Agregar.Lista.remove(pos);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Personas.dat"));
            oos.writeObject(Ventana_Agregar.Lista);
            oos.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            Ventana_Principal v = new Ventana_Principal();
            v.setVisible(true);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.setVisible(false);
        Ventana_Principal v = new Ventana_Principal();
        v.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Eliminar().setVisible(true);
            }
        });
    }

    public void obtenerDatos() {
        Nombre.setText(Ventana_Agregar.Lista.get(pos).getNombre());
        Consola.setText(Ventana_Agregar.Lista.get(pos).getConsola());
        Edad.setText(String.valueOf(Ventana_Agregar.Lista.get(pos).getEdad()));
        Fecha.setText(Ventana_Agregar.Lista.get(pos).getFecha());
        Comentario.setText(Ventana_Agregar.Lista.get(pos).getComentario());
        Precio.setText(String.valueOf(Ventana_Agregar.Lista.get(pos).getPrecio()));
        Codigo.setText(Ventana_Agregar.Lista.get(pos).getCodigo());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextArea Comentario;
    private javax.swing.JTextField Consola;
    private javax.swing.JTextField Edad;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Fecha;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
