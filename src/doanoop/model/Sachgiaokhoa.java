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
    int khoi;

    public Sachgiaokhoa(){
        
    }
    public Sachgiaokhoa( int khoi) {
        this.khoi = khoi;
    }

    public Sachgiaokhoa( int khoi, String masach, String tensach, String theloai, String tacgia, int soluong, String nhaxuatban, int namxuatban, int gia) {
        super(masach, tensach, theloai, tacgia, soluong, nhaxuatban, namxuatban, gia);
        this.khoi = khoi;
    }

    public int getKhoi() {
        return khoi;
    }

    public void setKhoi(int khoi) {
        this.khoi = khoi;
    }
    
    
}
