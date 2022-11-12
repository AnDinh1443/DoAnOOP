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
public class GiaoTrinh extends Book implements Serializable{
    String truong;
    String linhvuc;

    public GiaoTrinh(){
        
    }
    public GiaoTrinh(String truong, String linhvuc) {
        this.truong = truong;
        this.linhvuc = linhvuc;
    }

    public GiaoTrinh(String masach, String tensach, String theloai, String tacgia, int soluong, String nhaxuatban, int namxuatban, int gia,String truong, String linhvuc) {
        super(masach, tensach, theloai, tacgia, soluong, nhaxuatban, namxuatban, gia);
        this.truong = truong;
        this.linhvuc = linhvuc;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getLinhvuc() {
        return linhvuc;
    }

    public void setLinhvuc(String linhvuc) {
        this.linhvuc = linhvuc;
    }
    
    public static void main(String[] args) {
               
    }
}
