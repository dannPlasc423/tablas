/*  
Tarea: Práctica 6 - Menú
Alumno: Plascencia Lozano Daniel Eduardo
Registro: 21110156
Grado Y Grupo: 3° - P
Turno: Matutino
Fecha de Entrega: Jueves, 5 de Mayo de 2022
*/

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JfShowBook extends javax.swing.JFrame {

    Book libro[];
    int x = 0;
    DefaultTableModel tabla = new DefaultTableModel();
    
    public JfShowBook(Book libro[], int contador) {
        initComponents();
        this.libro = libro;
        this.x = contador;
        
        String[] identificador = new String[] {"ID", "Libro", "Genero", "Paginas"};
        tabla.setColumnIdentifiers(identificador);
        jTable1.setModel(tabla);
        for(int i = 0; i < contador; i++){
            tabla.addRow(new Object[]{libro[i].getId(),libro[i].getNombre(),libro[i].getGenero(),libro[i].getNumPaginas()});
        }
    }
    
    public JfShowBook() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(560, 420));
        setMinimumSize(new java.awt.Dimension(560, 420));
        setPreferredSize(new java.awt.Dimension(560, 420));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mostrar.jpg"))); // NOI18N
        jButton1.setText("Mostrar Libros");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 330, 170, 37);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrar.png"))); // NOI18N
        jButton4.setText("Regresar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 330, 130, 40);

        jbEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(204, 204, 0));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar);
        jbEliminar.setBounds(400, 330, 130, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 20, 500, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JfShowBook.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = x;
        for(int i = 0; i<fila;i++){
            tabla.removeRow(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JfBook jlibro = new JfBook(libro, x);
        jlibro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
    libro[x] = new Book(0,0,"",""); //
        x--;
        JfBook jlibro = new JfBook(libro, x);
        jlibro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(JfShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfShowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfShowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEliminar;
    // End of variables declaration//GEN-END:variables
}
