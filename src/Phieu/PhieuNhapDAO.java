/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu;

import controller.DAOInterface;
import controller.DAO_Phieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 84907
 */
public class PhieuNhapDAO implements DAOInterface<Phieu>{
    @Override
    public int insert(Phieu t) {
                int ketQua = 0;
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "INSERT INTO PhieuNhap (maPhieu, nguoiTao, ngayTao,gioTao,Total) VALUES (?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getNguoiTao());
                        pst.setString(3,t.getNgayTao());
                        pst.setString(4, t.getGioTao());
			pst.setInt(5, t.getTotal());
                        
			ketQua = pst.executeUpdate();
			
			DAO_Phieu.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }

    @Override
    public int update(Phieu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Phieu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Phieu> selectAll() {
        ArrayList<Phieu> ketQua = new ArrayList<Phieu>();
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "SELECT * FROM PhieuNhap";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String nguoiTao = rs.getString("nguoiTao");
                                String ngayTao =rs.getString("ngayTao");
                                String gioTao = rs.getString("gioTao");
                                int Total =rs.getInt("Total");
				Phieu px = new Phieu(maPhieu, nguoiTao, ngayTao,gioTao,Total);
				ketQua.add(px);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }

    @Override
    public Phieu selectById(Phieu t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
           public Phieu selectByMaphieu(String x) {
            Phieu ketQua = null;
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "SELECT * FROM PhieuNhap WHERE maPhieu='"+x+"'";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String nguoiTao = rs.getString("nguoiTao");
                                String ngayTao =rs.getString("ngayTao");
                                String gioTao = rs.getString("gioTao");
                                int Total =rs.getInt("Total");
				ketQua = new Phieu(maPhieu, nguoiTao, ngayTao,gioTao,Total);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }
}

