/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanoop.model;

import java.io.Serializable;

/**
 *
 * @author 84907
 */
public class Truyen extends Book implements Serializable{
    boolean tomau;
    
    public Truyen(){
        
    }

    public boolean isTomau() {
        return tomau;
    }

    public void setTomau(boolean tomau) {
        this.tomau = tomau;
    }

    public Truyen(boolean tomau) {
        this.tomau = tomau;
    }

    public Truyen(String masach, String tensach, String theloai, String tacgia, int soluong, String nhaxuatban, int namxuatban, int gia,boolean tomau) {
        super(masach, tensach, theloai, tacgia, soluong, nhaxuatban, namxuatban, gia);
        this.tomau = tomau;
    }
    
    
}
