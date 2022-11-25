/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu;

import java.util.Objects;
import javax.swing.JTable;

/**
 *
 * @author 84907
 */
public class ChiTietPhieu {
	private String maPhieu;
	private String maSach;
	private int soLuong;
        private int donGia;
        private int tong;
      
	public ChiTietPhieu() {
		super();
	}

	public ChiTietPhieu(String maPhieu, String maSach, int soLuong,int donGia,int tong) {
		super();
		this.maPhieu = maPhieu;
		this.maSach = maSach;
		this.soLuong = soLuong;
                this.donGia =donGia;
                this.tong=donGia*soLuong;
	}

	public String getMaPhieu() {
		return maPhieu;
	}

	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }
        

    public static int Tong(JTable table) {
        int s=0;
        for(int i=0;i<table.getRowCount();i++){
            s+=(Integer)table.getValueAt(i,4);
        }
        return s;
    }
        
	@Override
	public int hashCode() {
		return Objects.hash(maSach, maPhieu, soLuong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietPhieu other = (ChiTietPhieu) obj;
		return Objects.equals(maSach, other.maSach) && Objects.equals(maPhieu, other.maPhieu) && soLuong == other.soLuong;
	}

	@Override
	public String toString() {
		return "ChiTietPhieu [maPhieu=" + maPhieu + ", maSach=" + maSach + ", soLuong=" + soLuong + "]";
	}
	
	
}
    

