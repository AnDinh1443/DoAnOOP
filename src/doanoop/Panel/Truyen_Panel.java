/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package doanoop.Panel;

/**
 *
 * @author 84907
 */
public class Truyen_Panel extends javax.swing.JPanel {

    
    public Truyen_Panel() {
        initComponents();
    }

   public boolean Mau(){
       if(chxTomau.isSelected())
           return true;
       else return false;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chxTomau = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 51, 51));

        chxTomau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chxTomau.setForeground(new java.awt.Color(255, 255, 255));
        chxTomau.setText("Được tô màu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(chxTomau)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chxTomau)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chxTomau;
    // End of variables declaration//GEN-END:variables
}
