/*  
Tarea: Práctica 6 - Menú
Alumno: Plascencia Lozano Daniel Eduardo
Registro: 21110156
Grado Y Grupo: 3° - P
Turno: Matutino
Fecha de Entrega: Jueves, 5 de Mayo de 2022
*/

import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class JfLoan extends javax.swing.JFrame {

    Loan prestamo[] = new Loan[10];
    int contador = 0;
    public JfLoan() {
        initComponents();
        for(int i = 0; i < 10; i++){
            prestamo[i] = new Loan(0, 0, "", "");
        }
    }
    
    public JfLoan(Loan prestamo[], int x) {
        initComponents();
        this.contador = x;
        for(int i = 0; i < x; i++){
            this.prestamo[i] = prestamo[i];
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jGenero = new javax.swing.JTextField();
        jDias = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 500));
        setMinimumSize(new java.awt.Dimension(620, 500));
        setPreferredSize(new java.awt.Dimension(620, 500));
        getContentPane().setLayout(null);

        jNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        getContentPane().add(jNombre);
        jNombre.setBounds(220, 160, 340, 22);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("ID del Libro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 110, 150, 30);

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Nombre del Libro:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 160, 180, 30);

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Genero del Libro:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 210, 170, 30);

        jLabel4.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Numero de Días:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 260, 170, 30);

        jId.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        getContentPane().add(jId);
        jId.setBounds(220, 110, 340, 22);

        jGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(jGenero);
        jGenero.setBounds(220, 210, 340, 22);

        jDias.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jDias);
        jDias.setBounds(220, 260, 340, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrar.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 320, 130, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mostrar.jpg"))); // NOI18N
        jButton2.setText("Mostrar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 370, 130, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Volver.png"))); // NOI18N
        jButton3.setText("Volver");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(437, 420, 130, 40);

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Prestamo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 30, 126, 43);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JfLoan.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-20, 0, 670, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(contador < 10){
            if(!(jId.getText().equals("") || jNombre.getText().equals("") || jGenero.getText().equals("") || jDias.getText().equals(""))){
            prestamo[contador] = new Loan(Integer.parseInt(jId.getText()), Integer.parseInt(jDias.getText()), jNombre.getText(), jGenero.getText());
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            contador++;
            jId.setText("");
            jNombre.setText("");
            jGenero.setText("");
            jDias.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Completa los campos");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay espacio para más prestamos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JfShowLoan mostrar = new JfShowLoan(prestamo, contador);
        mostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JfMenu menu = new JfMenu();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDiasActionPerformed

    private void jGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGeneroActionPerformed

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
            java.util.logging.Logger.getLogger(JfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jDias;
    private javax.swing.JTextField jGenero;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNombre;
    // End of variables declaration//GEN-END:variables
}
