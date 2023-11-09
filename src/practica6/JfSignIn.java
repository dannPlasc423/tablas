/*  
Tarea: Práctica 6 - Menú
Alumno: Plascencia Lozano Daniel Eduardo
Registro: 21110156
Grado Y Grupo: 3° - P
Turno: Matutino
Fecha de Entrega: Jueves, 5 de Mayo de 2022
*/

import javax.swing.JOptionPane;

public class JfSignIn extends javax.swing.JFrame {

    Student alumno[] = new Student[5];
    
    public JfSignIn() {
        initComponents();
        alumno[0] = new Student("Daniel", "Daniel");
        alumno[1] = new Student("Eduardo", "Eduardo");
        alumno[2] = new Student("Palscencia", "Plascencia");
        alumno[3] = new Student("Lozano", "Lozano");
        alumno[4] = new Student("Evelyn", "Evelyn");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 465));
        setMinimumSize(new java.awt.Dimension(520, 465));
        setPreferredSize(new java.awt.Dimension(520, 465));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 130, 90, 30);

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 190, 110, 30);

        jUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jUsuario);
        jUsuario.setBounds(120, 130, 330, 30);

        jPass.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        getContentPane().add(jPass);
        jPass.setBounds(120, 190, 330, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ok.png"))); // NOI18N
        jButton1.setText("Ok");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(214, 260, 110, 41);

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingreso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 30, 138, 51);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JfSignIn.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 510, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean diferente = false;
        if(!(jUsuario.getText().equals("") || jPass.getText().equals(""))){
            for(int i = 0; i < 5; i++){
                if(alumno[i].getUsuario().equals(jUsuario.getText()) && alumno[i].getPassword().equals(jPass.getText())){
                    JfMenu menu = new JfMenu();
                    menu.setVisible(true);
                    this.setVisible(false);
                    diferente = true;
                        }
                    }
                if(!diferente){
                    JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son correctos");
                }
            }
                else{
                    JOptionPane.showMessageDialog(null, "Llena todos los componentes");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JfSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}
