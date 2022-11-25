/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatListCellBorder;
import controller.DAO;
import doanoop.Dialog.Add_TK;
import doanoop.Dialog.Fix_TK;
import doanoop.model.TaiKhoan;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.util.LocaleID;

/**
 *
 * @author 84907
 */
public class QuanlyTK extends javax.swing.JFrame {

     List<TaiKhoan> taikhoan;
    DefaultTableModel tblModel;
    int selectedIndex;
    public QuanlyTK() {
        initComponents();
        this.setLocationRelativeTo(null);
        taikhoan=new DAO().getTaiKhoan();
        tblModel=(DefaultTableModel) tblDSNV.getModel();
        tblModel.setColumnIdentifiers(new Object[]{
        "Username","Password","Role","Phone","Status"
        });
        this.setTitle("Trang quản lý tài khoản");
        showTable();
    }
public void showTable() {
        for (TaiKhoan tk :new DAO().getTaiKhoan()) {
            tblModel.addRow(new Object[]{
             tk.getUser(),tk.getPass(),tk.getRole(),tk.getPhone(),tk.getStatus()
            });
        }
    }

public void showResult(){
    TaiKhoan tk=taikhoan.get(taikhoan.size()-1);
    tblModel.addRow(new Object[]{
             tk.getUser(),tk.getPass(),tk.getRole(),tk.getPhone()
            });
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSNV = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblDSNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDSNV);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\84907\\AppData\\Local\\Temp\\icons8_rewind_24px_1.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("Tìm kiếm theo:");

        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Username", "Role", "Phone", " " }));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton4.setText("Xuất file XLS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton4)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Add_TK da=new Add_TK(this, rootPaneCheckingEnabled);
        da.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectedIndex=tblDSNV.getSelectedRow();
        if(taikhoan.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách nhân viên rỗng");
        }
        else if(selectedIndex<0) JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 tài khoản để sửa");
        else{
            Fix_TK edit =new Fix_TK(this, rootPaneCheckingEnabled);
            edit.editDataTK(taikhoan.get(selectedIndex));
            edit.setVisible(true);
          
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Home home=new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      selectedIndex=tblDSNV.getSelectedRow();
        if(taikhoan.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Danh sách nhân viên rỗng");
        }
        else if(selectedIndex<0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 tài khoản để xóa");
        }
        else{
            if(taikhoan.get(selectedIndex).getRole().equals("Admin")){
                JOptionPane.showMessageDialog(rootPane,"Không thể xóa Admin");
            }
            else{
            int res=JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc xóa?","Xác nhận", JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
            if(new DAO().deleteTK(taikhoan.get(selectedIndex))){
                JOptionPane.showMessageDialog(rootPane,"Đã xóa");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Xóa thất bại");
            }
            QuanlyTK qlK=new QuanlyTK();
            this.dispose();
            qlK.show();
            }
            if(res==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(rootPane, "Đã hủy việc xóa");
            }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
          if(cbxSearch.getSelectedItem().equals("Username")){
            tblModel.setRowCount(0);
            for (TaiKhoan tk :new DAO().findByUser(txtSearch.getText())) {
                tblModel.addRow(new Object[]{
                    tk.getUser(),tk.getPass(),tk.getRole(),tk.getPhone(),tk.getStatus()
                });
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser fileChooser=new JFileChooser("C:\\Users\\84907\\Desktop");
        XSSFWorkbook wb=null;
        XSSFSheet sheet=null;
        BufferedOutputStream outputStream=null;
        fileChooser.setDialogTitle("Save As");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls","xlsx","xlsm");
        int file=fileChooser.showSaveDialog(null);
        
       if(file==JFileChooser.APPROVE_OPTION){
           
           FileOutputStream excel=null;
            try {
                wb= new XSSFWorkbook();
                sheet=wb.createSheet("Danh sách thành viên");
                XSSFRow row=null;
                Cell cell=null;
                row=sheet.createRow(0);
                cell=row.createCell(0,CellType.STRING);
                cell.setCellValue("Username");
                cell=row.createCell(1,CellType.STRING);
                cell.setCellValue("Password");
                cell=row.createCell(2,CellType.STRING);
                cell.setCellValue("Vai trò");
                cell=row.createCell(3,CellType.NUMERIC);
                cell.setCellValue("Số điện thoại");
                
                for(int i=0;i<taikhoan.size();i++){
                    row=sheet.createRow(1+i);
                    cell=row.createCell(0,CellType.STRING);
                    cell.setCellValue(taikhoan.get(i).getUser());
                    cell=row.createCell(1,CellType.STRING);
                    cell.setCellValue(taikhoan.get(i).getPass());
                    cell=row.createCell(2,CellType.STRING);
                    cell.setCellValue(taikhoan.get(i).getRole());
                    cell=row.createCell(3,CellType.NUMERIC);
                    cell.setCellValue(taikhoan.get(i).getPhone());
                    
                }   
                excel = new  FileOutputStream(fileChooser.getSelectedFile()+".xlsx");
                outputStream= new BufferedOutputStream(excel);
                wb.write(outputStream);
                JOptionPane.showMessageDialog(null, "Export file Excel Successfully");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
            } finally {
                try {
                    if(outputStream!=null) outputStream.close();
                    if(excel!=null) excel.close();
                    if(wb!=null)wb.close();
                } catch (IOException ex) {
                }
            }
       }    
           
    }//GEN-LAST:event_jButton4ActionPerformed

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
                new QuanlyTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSNV;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
