/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_HR;

/**
 *
 * @author yuujadz
 */
public class HRWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HRWorkArea
     */
    public HRWorkArea() {
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

        jLabel1 = new javax.swing.JLabel();
        btnEmployeeCRUD = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("HE Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        btnEmployeeCRUD.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEmployeeCRUD.setText("Employee CRUD");
        btnEmployeeCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCRUDActionPerformed(evt);
            }
        });
        add(btnEmployeeCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 50));

        btnDashboard.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnDashboard.setText("Dashboard");
        add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 180, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCRUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeCRUDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEmployeeCRUD;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
