/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgui.model;

/**
 *
 * @author 84907
 */
import java.io.Serializable;
public class Book implements Serializable{
    private String masach;
    private String tensach;
    private String theloai;
    private String tacgia;
    private int soluong;
    private String nhaxuatban;
    private int namxuatban;
    private int gia;

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Book() {
    }

    public Book(String masach, String tensach, String theloai, String tacgia, int soluong,String nhaxuatban, int namxuatban, int gia) {
        this.masach = masach;
        this.tensach = tensach;
        this.theloai = theloai;
        this.tacgia = tacgia;
        this.soluong=soluong;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
        this.gia = gia;
    }

    
     
}
