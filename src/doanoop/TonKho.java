/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.awt.FlowLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DAO;
import doanoop.Dialog.GiaoTrinh_Detail;
import doanoop.Dialog.Truyen_Detail;
import doanoop.model.Book;
import doanoop.model.GiaoTrinh;
import doanoop.model.Truyen;
import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.math3.analysis.function.Ceil;
    import org.apache.poi.hssf.usermodel.HSSFCell;
    import org.apache.poi.hssf.usermodel.HSSFRow;
    import org.apache.poi.hssf.usermodel.HSSFSheet;
    import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
    import org.apache.poi.ss.usermodel.Row;
    import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author 84907
 */
public class TonKho extends javax.swing.JFrame {

public ArrayList<GiaoTrinh> list_GT;
public ArrayList<Truyen> list_TR;
public ArrayList<Book> list;
DefaultTableModel model;
    public TonKho() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbllist.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách","Tên sách","Thể loại","Tác giả","Số lượng","Giá"
        });
        list=new DAO().getBookList_inWare();
        list_GT=new DAO().getGTBook();
        list_TR=new DAO().getTRBook();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbllist = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbllist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbllist);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sách hiện có trong kho");

        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Tác giả" }));

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

        jLabel2.setText("Tìm kiếm theo");

        jButton2.setText("Xuất File Excel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        switch((String)cbxSearch.getSelectedItem()){
            case "Mã sách":
            model.setRowCount(0);
            for(Book book:new DAO().findByMasach(txtSearch.getText())){
                model.addRow(new Object[]{
                    book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
                });
            }
            break;
            case "Tên sách":
            model.setRowCount(0);
            for(Book book:new DAO().findByTensach(txtSearch.getText())){
                model.addRow(new Object[]{
                    book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
                });
            }
            break;
            case "Tác giả":
            model.setRowCount(0);
            for(Book book:new DAO().findByTacgia(txtSearch.getText())){
                model.addRow(new Object[]{
                    book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
                });
            }
            break;
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        switch((String)cbxSearch.getSelectedItem()){
            case "Mã sách":
                model.setRowCount(0);
                for(Book book:new DAO().findByMasach(txtSearch.getText())){
                    model.addRow(new Object[]{
                        book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
                    });
                }
                break;
            case "Tên sách":
                model.setRowCount(0);
                for(Book book:new DAO().findByTensach(txtSearch.getText())){
                    model.addRow(new Object[]{
                        book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
                    });
                }
                break;
            case "Tác giả":
                model.setRowCount(0);
                for(Book book:new DAO().findByTacgia(txtSearch.getText())){
                    model.addRow(new Object[]{
                        book.getMasach(),book.getTensach(),book.getTheloai(),book.getTacgia(),book.getSoluong(),book.getGia()
                    });
                }
                break;
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
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
                sheet=wb.createSheet("Danh sách hàng");
                XSSFRow row=null;
                Cell cell=null;
                row=sheet.createRow(0);
                cell=row.createCell(0,CellType.STRING);
                cell.setCellValue("Mã sách");
                cell=row.createCell(1,CellType.STRING);
                cell.setCellValue("Tên sách");
                cell=row.createCell(2,CellType.STRING);
                cell.setCellValue("Thể loại");
                cell=row.createCell(3,CellType.STRING);
                cell.setCellValue("Tác giả");
                cell=row.createCell(4,CellType.STRING);
                cell.setCellValue("Số lượng");
                cell=row.createCell(5,CellType.STRING);
                cell.setCellValue("Nhà xuất bản");               
                cell=row.createCell(6,CellType.NUMERIC);
                cell.setCellValue("Năm xuất bản");                
                cell=row.createCell(7,CellType.STRING);
                cell.setCellValue("Đơn giá");
                for(int i=0;i<list.size();i++){
                    row=sheet.createRow(1+i);
                    cell=row.createCell(0,CellType.STRING);
                    cell.setCellValue(list.get(i).getMasach());
                    cell=row.createCell(1,CellType.STRING);
                    cell.setCellValue(list.get(i).getTensach());
                    cell=row.createCell(2,CellType.STRING);
                    cell.setCellValue(list.get(i).getTheloai());
                    cell=row.createCell(3,CellType.STRING);
                    cell.setCellValue(list.get(i).getTacgia());
                    cell=row.createCell(4,CellType.NUMERIC);
                    cell.setCellValue(list.get(i).getSoluong());
                    cell=row.createCell(5,CellType.STRING);
                    cell.setCellValue(list.get(i).getNhaxuatban());      
                    cell=row.createCell(6,CellType.NUMERIC);
                    cell.setCellValue(list.get(i).getNamxuatban());                    
                    cell=row.createCell(7,CellType.NUMERIC);
                    cell.setCellValue(list.get(i).getGia());
                }   
                excel = new  FileOutputStream(fileChooser.getSelectedFile()+".xlsx");
                outputStream= new BufferedOutputStream(excel);
                wb.write(outputStream);
                JOptionPane.showMessageDialog(null, "Export file Excel SuccessFully");
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
           
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch(Exception ex){
            System.err.println("Fail to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TonKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbllist;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
