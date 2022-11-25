/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DAO;
import doanoop.model.Book;

import Phieu.ChiTietPhieu;
import Phieu.ChiTietPhieuDAO;

import Phieu.Phieu;
import Phieu.PhieuXuatDAO;
import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hpsf.Date;
import org.apache.poi.util.LocaleID;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery;

/**
 *
 * @author 84907
 */
public class XuatKho extends javax.swing.JFrame {

    public ArrayList<Book> list;
    public ArrayList<ChiTietPhieu> CTPhieu;
    public ArrayList<Phieu> phieuXuat;
    DefaultTableModel model;
    DefaultTableModel model1;
    int selectedIndex;
    public int tmp = 0;

    public XuatKho() {
        initComponents();
        this.setLocationRelativeTo(null);
        CTPhieu = new ArrayList<>();
        model = (DefaultTableModel) tblList.getModel();
        model1 = (DefaultTableModel) tblXuat.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Giá"
        });

        model1.setColumnIdentifiers(new Object[]{
            "Mã phiếu", "Mã sách", "Số lượng", "Đơn giá", "Số tiền"
        });
        list = new DAO().getBookList_inWare();
        showTable();

    }

    public void showTable() {
        for (Book book : list) {
            model.addRow(new Object[]{
                book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
            });
        }
    }

    public void ShowExport() {
        model1.setRowCount(0);
        for (ChiTietPhieu ctp : CTPhieu) {
            model1.addRow(new Object[]{
                ctp.getMaPhieu(), ctp.getMaSach(), ctp.getSoLuong(), list.get(selectedIndex).getGia(), ctp.getSoLuong() * list.get(selectedIndex).getGia()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        puFix = new javax.swing.JPopupMenu();
        mmSua = new javax.swing.JMenuItem();
        mmXoa = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblXuat = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        sl = new javax.swing.JTextField();

        mmSua.setText("Sửa thông tin");
        mmSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmSuaActionPerformed(evt);
            }
        });
        puFix.add(mmSua);

        mmXoa.setText("Xóa thông tin");
        mmXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmXoaActionPerformed(evt);
            }
        });
        puFix.add(mmXoa);

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
        tblXuat.setComponentPopupMenu(puFix);
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

        jButton3.setText("Xuất kho");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel5.setText("Mã phiếu");

        jLabel6.setText(maPhieuXuat());

        jLabel7.setText("Người tạo");

        jLabel9.setText("Ngày");

        jLabel10.setText("Thời gian");

        lblNgay.setText(ngayXuat()
        );

        lblGio.setText(gioXuat());

        name.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblNgay)
                        .addGap(18, 18, 18)
                        .addComponent(lblGio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(name))
                .addGap(84, 84, 84))
        );

        jLabel3.setText("Thành tiền");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 51));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setText("Xóa khỏi danh sách xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Số lượng xuất");

        sl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                slKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(jButton1))
                        .addContainerGap(115, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectedIndex = tblList.getSelectedRow();

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách sản phẩm rỗng");
        } else if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 loại sách để thêm vào danh sách xuất");
        } else {
            if (sl.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Nhập số lượng muốn xuất");
            } else {
                if (Integer.parseInt(sl.getText()) > list.get(selectedIndex).getSoluong()) {
                    JOptionPane.showMessageDialog(rootPane, "Kho không thể đáp ứng số lượng\nVui lòng nhập số lượng thấp hơn");
                    sl.setText("");
                } else {
                    ChiTietPhieu x = new ChiTietPhieu();
                    tmp = Integer.parseInt(sl.getText());
                    x.setMaPhieu(maPhieuXuat());
                    x.setMaSach(list.get(selectedIndex).getMasach());
                    x.setSoLuong(tmp);
                    x.setDonGia(list.get(selectedIndex).getGia());
                    x.setTong(x.getDonGia()*x.getSoLuong());
                    CTPhieu.add(x);
                    sl.setText("");
                    ShowExport();
                    lblTotal.setText(String.valueOf(ChiTietPhieu.Tong(tblXuat)));
                }
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int total = 0;
        int choose = JOptionPane.showConfirmDialog(rootPane, "Xuất danh sách", "Xác nhận xuất", JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            Phieu y = new Phieu();
            y.setMaPhieu(maPhieuXuat());
            for (ChiTietPhieu x : CTPhieu) {
                if (new ChiTietPhieuDAO().insert(x) != 0) {
                    for (Book book : list) {
                        if (book.getMasach().equals(x.getMaSach())) {
                            if (new DAO().afterExport(book, x.getMaSach(), x.getSoLuong())) {
                                total += x.getSoLuong() * book.getGia();
                            }
                        }
                    }
                }
            }

            y.setNguoiTao(name.getText());
            y.setNgayTao(ngayXuat());
            y.setGioTao(gioXuat());
            y.setTotal(total);

            if (new PhieuXuatDAO().insert(y) != 0) {
                JOptionPane.showMessageDialog(rootPane, "Đã xuất kho");
                XuatKho xk = new XuatKho();
                this.dispose();
                xk.show();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mmXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmXoaActionPerformed
//        int vitri = tblXuat.getSelectedRow();
//        DefaultTableModel model = (DefaultTableModel) tblXuat.getModel();
//        if (vitri >= 0) {
//            model.removeRow(vitri);
//
//        }
//        lblTotal.setText(String.valueOf(ChiTietPhieu1.Tong(tblXuat)));
    }//GEN-LAST:event_mmXoaActionPerformed

    private void mmSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmSuaActionPerformed
//
//        int vitri = tblXuat.getSelectedRow();
//        if (vitri >= 0) {
//            tmp = (Integer) tblXuat.getValueAt(vitri, 4);
//            System.out.println(tmp);
//            check_export kk = new check_export(this, true);
//            kk.setVisible(true);
//            tblXuat.setValueAt(tmp, vitri, 4);
//            int total = tmp * (Integer) tblXuat.getValueAt(vitri, 5);
//            tblXuat.setValueAt(total, vitri, 6);
//            lblTotal.setText(String.valueOf(ChiTietPhieu1.Tong(tblXuat)));
//        }
    }//GEN-LAST:event_mmSuaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectedIndex = tblXuat.getSelectedRow();

        if (CTPhieu.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách xuất kho hiện rỗng");
        } else if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 loại sách để xóa khỏi danh sách xuất");
        } else {
            int res = JOptionPane.showConfirmDialog(rootPane, "Xóa khỏi danh sách xuất", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                CTPhieu.remove(CTPhieu.get(selectedIndex));
                ShowExport();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void slKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_slKeyTyped

    public String maPhieuXuat() {
        ArrayList<Phieu> dsPhieu = new PhieuXuatDAO().selectAll();
        int i = 0;
        for (int j = 0; j < dsPhieu.size(); j++) {
            String[] id = dsPhieu.get(j).getMaPhieu().split("X");
            if (i == Integer.parseInt(id[1])) {
                i++;
            } else {
                return "PX" + i;
            }
        }
        return "PX" + i;
    }

    public String ngayXuat() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return date.format(formatter);
    }

    public String gioXuat() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        return time.format(formatter);
    }

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem mmSua;
    private javax.swing.JMenuItem mmXoa;
    public javax.swing.JLabel name;
    private javax.swing.JPopupMenu puFix;
    private javax.swing.JTextField sl;
    private javax.swing.JTable tblList;
    private javax.swing.JTable tblXuat;
    // End of variables declaration//GEN-END:variables
}
