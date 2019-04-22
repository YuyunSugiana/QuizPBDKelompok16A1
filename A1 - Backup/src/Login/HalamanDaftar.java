/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jefri
 */
public class HalamanDaftar extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    
    void sinkron(){
       String sql = "SELECT * FROM login  ";
       try {
           ps = conn.prepareStatement(sql);
           rs = ps.executeQuery();
           tabel.setModel(DbUtils.resultSetToTableModel(rs));
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }
    
    
    /**
     * Creates new form HalamanDaftar
     */
    public HalamanDaftar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        rpassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        hapus = new javax.swing.JButton();
        m = new javax.swing.JRadioButton();
        bm = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("Halaman Daftar");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Nama");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("Telepon");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Status");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Retype Password");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel);

        hapus.setText("DELETE");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        buttonGroup1.add(m);
        m.setText("Menikah");

        buttonGroup1.add(bm);
        bm.setText("Belum Menikah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(password)
                                .addComponent(rpassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(98, 98, 98)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(telepon)
                                .addComponent(alamat)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(m)
                                    .addGap(18, 18, 18)
                                    .addComponent(bm))
                                .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(m)
                    .addComponent(bm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String sql = "INSERT INTO Login VALUES(null, ?,?,?,?,?,?)";
    try{
        ps = conn.prepareStatement(sql);
        if ("".equals(user.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Username terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(user.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Username terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(password.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Password terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(nama.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Nama terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(telepon.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Telepon terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(alamat.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Alamat terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        else if (password.getText() == null ? rpassword.getText() != null : !password.getText().equals(rpassword.getText())){
            JOptionPane.showMessageDialog(null, "Password tidak sama !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
        String status = "";
        if (m.isSelected()){
            status = "Menikah";
        }
        if (bm.isSelected()){
            status = "Belum Menikah";
        }
            
        ps.setString(1, user.getText());
        ps.setString(2, password.getText());
        ps.setString(3, nama.getText());
        ps.setString(4, telepon.getText());
        ps.setString(5, alamat.getText());
        ps.setString(6, status);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Data berhasil ditambahkan!");
        sinkron();
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = koneksi.Conn();
        sinkron();
    }//GEN-LAST:event_formWindowOpened

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String id_user = tabel.getModel().getValueAt(tabel.getSelectedRow(), 0).toString();
        String sql     = "DELETE FROM login WHERE id_user=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, id_user);
            if (tabel.getRowCount() == 0){
                JOptionPane.showMessageDialog(rootPane, "Masukan data terlebih dahulu");
                return;
            }
            if (tabel.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane, "Pilih data terlebih dahulu");
                return;
            }
            else{
                
                int hasil = JOptionPane.YES_NO_OPTION;
                int input = JOptionPane.showConfirmDialog(rootPane, "Yakin hapus data ?", "DELETE", hasil);
                if (input == JOptionPane.YES_OPTION)
                ps.executeUpdate();
            }
                       
            sinkron();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanDaftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JRadioButton bm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField rpassword;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
