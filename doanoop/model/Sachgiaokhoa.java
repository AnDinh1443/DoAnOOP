/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanoop.model;

/**
 *
 * @author 84907
 */
public class Sachgiaokhoa extends Book{
    int cap;
    int khoi;

    public Sachgiaokhoa(int cap, int khoi) {
        this.cap = cap;
        this.khoi = khoi;
    }

    public Sachgiaokhoa(int cap, int khoi, String masach, String tensach, String theloai, String tacgia, int soluong, String nhaxuatban, int namxuatban, int gia) {
        super(masach, tensach, theloai, tacgia, soluong, nhaxuatban, namxuatban, gia);
        this.cap = cap;
        this.khoi = khoi;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getKhoi() {
        return khoi;
    }

    public void setKhoi(int khoi) {
        this.khoi = khoi;
    }
    
    
}
