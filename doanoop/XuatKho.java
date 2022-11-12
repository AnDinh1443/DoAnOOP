/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DAO;
import doanoop.Dialog.check_export;
import doanoop.model.Book;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 84907
 */
public class XuatKho extends javax.swing.JFrame {
     public ArrayList<Book> list;
     public ArrayList<Book> export;
    DefaultTableModel model;
    DefaultTableModel model1;
    int selectedIndex;
    public int []tmp={0};
    public String[] ms={""};
    public XuatKho() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tblList.getModel();
        model1=(DefaultTableModel) tblXuat.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách","Tên sách","Thể loại","Tác giả","Số lượng","Giá"
        });
        
        model1.setColumnIdentifiers(new Object[]{
        "Mã sách","Tên sách","Thể loại","Tác giả","Số lượng xuất"
    });
        list = new ArrayList<>();
        list= new DAO().getBookList();
        showTable();
        
    }
public void showTable() {
        for (Book book:list) {
            model.addRow(new Object[]{
             book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
            });
        }
    }
public void showExport(){
    int i=0;
    for(Book book:export){
        model1.addRow(new Object[]{
            book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),tmp[i++]
        });
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblXuat = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblList);

        tblXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblXuat);

        jButton1.setText("Chuyển vào danh sách xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sách trong kho");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách xuất kho");

        jButton2.setText("Không thêm vào danh sách xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xuất kho");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(94, 94, 94)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    selectedIndex= tblList.getSelectedRow();
    int i=0;
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách sản phẩm rỗng");
        }
        else if(selectedIndex<0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 loại sách để thêm vào danh sách xuất");
        }
        else{
            
            int res=JOptionPane.showConfirmDialog(rootPane, "Bạn muốn thêm sách này vào danh sách xuất kho?","Xác nhận", JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
                String id=list.get(selectedIndex).getMasach();
                
                check_export ce=new check_export(this, rootPaneCheckingEnabled);
                ce.setVisible(true);
                ce.matchValue(list.get(selectedIndex));
                if(ce.check_sl(list.get(selectedIndex))==true){
                    export=new DAO().ListExport(list.get(selectedIndex),id,export);
                JOptionPane.showMessageDialog(rootPane,"Đã chọn "+tmp[i++]+" sách "+list.get(selectedIndex).getTensach()+"\nvào danh sách xuất");
                showExport();
                }
            else{
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
            }
            }
            }
           
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectedIndex = tblXuat.getSelectedRow();
        if(export.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Danh sách xuất kho hiện rỗng");
        }
        else if(selectedIndex<0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn sách để hủy thêm");
        }else{
            export.remove(export.get(selectedIndex));
            model1.setRowCount(0);
            showExport();
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int j=0,dem=0;
        if(export.isEmpty()) JOptionPane.showMessageDialog(rootPane,"Chọn thêm sách để xuất kho");
        else{
            
            for (Book book : export) {
                if(new DAO().Export(book, tmp[j],book.getMasach())==true) {
                JOptionPane.showMessageDialog(rootPane,book.getMasach() + tmp[j]);
            }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Có lỗi xảy ra");
                }
                j++;
               dem++;
            }
            JOptionPane.showMessageDialog(rootPane, dem);
        }
        XuatKho xk=new XuatKho();
        this.dispose();
        xk.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println(" Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XuatKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblList;
    private javax.swing.JTable tblXuat;
    // End of variables declaration//GEN-END:variables
}
