/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DAO;

import doanoop.Dialog.Update_GT;
import java.awt.Event;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.xml.datatype.DatatypeConstants;
import doanoop.model.Book;
import doanoop.model.GiaoTrinh;
import doanoop.model.TaiKhoan;
import doanoop.model.Truyen;


/**
 *
 * @author 84907
 */
public class Book_List extends javax.swing.JFrame {
    int selectedIndex;
    
    public ArrayList<Book> list;
    public ArrayList<GiaoTrinh> giaotrinh;
    DefaultTableModel model;
    public Book_List() {
        initComponents();
        this.setLocationRelativeTo(null);
        setLayout(new FlowLayout());;
        list = new ArrayList<>();
        model = (DefaultTableModel) tbllist.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách","Tên sách","Thể loại","Tác giả","Số lượng","Giá"
        });
        list = new DAO().getBookList();
      
        showTable();
    }

    public void showTable() {
        for (Book book:list) {
            model.addRow(new Object[]{
             book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbllist = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        cbxSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbllist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbllist);

        jButton1.setText("Sửa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tìm kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Tác giả", "Thể loại" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          selectedIndex= tbllist.getSelectedRow();
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách sản phẩm rỗng");
        }
        else if(selectedIndex<0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 loại sách để xóa");
        }
        else{
            
            int res=JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc xóa?","Xác nhận", JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
            if(new DAO().deleteBook(list.get(selectedIndex))){
                JOptionPane.showMessageDialog(rootPane,"Đã xóa");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Xóa thất bại");
            }
            Book_List bl=new Book_List();
            this.dispose();
            bl.show();
            }
            if(res==JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Đã hủy việc xóa dữ liệu");
            }
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GiaoTrinh gtBook=new GiaoTrinh();
        selectedIndex=tbllist.getSelectedRow();
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách hiện rỗng");
        }
        else if(selectedIndex<0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 sách để sửa thông tin");
        }
        else{
            Update_GT upgt=new Update_GT(this, rootPaneCheckingEnabled);
            upgt.editDataGT(giaotrinh.get(selectedIndex));
            upgt.setVisible(true);
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(cbxSearch.getSelectedItem().equals("Tên sách")){
              model.setRowCount(0);
               for (Book book :new DAO().findByTensach(txtSearch.getText())) {
            model.addRow(new Object[]{
             book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
            });
        }
           }
        if(cbxSearch.getSelectedItem().equals("Mã sách")){
              model.setRowCount(0);
               for (Book book :new DAO().findByMasach(txtSearch.getText())) {
            model.addRow(new Object[]{
             book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
            });
        }
           }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println(" Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbllist;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
