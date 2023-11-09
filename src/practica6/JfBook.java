/*  
Tarea: Práctica 6 - Menú
Alumno: Plascencia Lozano Daniel Eduardo
Registro: 21110156
Grado Y Grupo: 3° - P
Turno: Matutino
Fecha de Entrega: Jueves, 05 de Mayo de 2022
*/

import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class JfBook extends javax.swing.JFrame {
    
    Book libro[] = new Book[10];
    int contador = 0;
    public JfBook() {
        initComponents();
        for(int i = 0; i < 10; i++){
            libro[i] = new Book(0, 0, "", "");
        }
    }
    
    public JfBook(Book libro[], int x) {
        initComponents();
        this.contador = x;
        for(int i = 0; i < x; i++){
            this.libro[i] = libro[i];
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
        jNumero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jNombre);
        jNombre.setBounds(190, 160, 292, 22);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("ID del Libro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 100, 160, 30);

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Nombre del Libro:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 160, 180, 30);

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Género del Libro:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 170, 30);

        jLabel4.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Páginas:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 280, 100, 20);

        jId.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jId);
        jId.setBounds(190, 100, 292, 22);

        jGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jGenero);
        jGenero.setBounds(190, 220, 292, 22);

        jNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jNumero);
        jNumero.setBounds(190, 280, 292, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrar.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 320, 130, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mostrar.jpg"))); // NOI18N
        jButton2.setText("Mostrar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 370, 130, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Volver.png"))); // NOI18N
        jButton3.setText("Volver");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 420, 130, 40);

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Libro");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 20, 90, 43);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JfBook.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, -10, 670, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(contador < 10){
            if(!(jId.getText().equals("") || jNombre.getText().equals("") || jGenero.getText().equals("") || jNumero.getText().equals(""))){
            libro[contador] = new Book(Integer.parseInt(jId.getText()), Integer.parseInt(jNumero.getText()), jNombre.getText(), jGenero.getText());
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            contador++;
            jId.setText("");
            jNombre.setText("");
            jGenero.setText("");
            jNumero.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Llena todos los campos vacios");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No queda espacio para más libros");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JfShowBook mostrar = new JfShowBook(libro, contador);
        mostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JfMenu menu = new JfMenu();
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JTextField jGenero;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jNumero;
    // End of variables declaration//GEN-END:variables
}
