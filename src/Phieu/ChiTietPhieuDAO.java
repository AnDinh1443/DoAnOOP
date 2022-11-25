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
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import org.bouncycastle.asn1.crmf.SinglePubInfo;

/**
 *
 * @author 84907
 */
public class ChiTietPhieuDAO implements DAOInterface<ChiTietPhieu>{

    
    @Override
    public int insert(ChiTietPhieu t) {
            int ketQua = 0;
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "INSERT INTO ChiTietPhieu (maPhieu, maSach, soLuong,donGia,tong) VALUES (?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaSach());
			pst.setInt(3, t.getSoLuong());
                        pst.setInt(4, t.getDonGia());
                        pst.setInt(5, t.getDonGia()*t.getSoLuong());
			ketQua = pst.executeUpdate();
			DAO_Phieu.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }

    @Override
    public int update(ChiTietPhieu t) {
            int ketQua = 0;
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "UPDATE ChiTietPhieu SET maPhieu=?, maSach=?, soLuong=? WHERE maPhieu=? AND maSach=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaSach());
			ketQua = pst.executeUpdate();
			DAO_Phieu.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }

    @Override
    public int delete(ChiTietPhieu t) {
    int ketQua = 0;
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "DELETE FROM ChiTietPhieu WHERE maPhieu=? AND maSach=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			pst.setString(2, t.getMaSach());
			ketQua = pst.executeUpdate();
			DAO_Phieu.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
    }

    @Override
    public ArrayList<ChiTietPhieu> selectAll() {
    ArrayList<ChiTietPhieu> ketQua = new ArrayList<ChiTietPhieu>();
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "SELECT * FROM ChiTietPhieu";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String maSach = rs.getString("maSach");
				int soLuong = rs.getInt("soLuong");
                                int donGia =rs.getInt("donGia");
                                int tong = soLuong*donGia;
				ChiTietPhieu ctp = new ChiTietPhieu(maPhieu, maSach, soLuong,donGia,tong);
				ketQua.add(ctp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }
    public ArrayList<ChiTietPhieu> selectByMaphieu(String x) {
    ArrayList<ChiTietPhieu> ketQua = new ArrayList<ChiTietPhieu>();
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "SELECT * FROM ChiTietPhieu WHERE maPhieu = '"+x+"'";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String maSach = rs.getString("maSach");
				int soLuong = rs.getInt("soLuong");
                                int donGia =rs.getInt("donGia");
                                int tong = soLuong*donGia;
				ChiTietPhieu ctp = new ChiTietPhieu(maPhieu, maSach, soLuong,donGia,tong);
				ketQua.add(ctp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
        }

    @Override
    public ChiTietPhieu selectById(ChiTietPhieu t) {
                ChiTietPhieu ketQua = null;
		try {
			Connection con = DAO_Phieu.getConnection();
			String sql = "SELECT * FROM ChiTietPhieu WHERE maPhieu=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getMaPhieu());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhieu = rs.getString("maPhieu");
				String maSach = rs.getString("maSach");
				int soLuong = rs.getInt("soLuong");
                                int donGia =rs.getInt("donGia");
                                int tong = soLuong*donGia;
				ketQua = new ChiTietPhieu(maPhieu, maSach, soLuong,donGia,tong);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
    }
    public static void main(String[] args) {
        new ChiTietPhieuDAO();
    }
    
}
