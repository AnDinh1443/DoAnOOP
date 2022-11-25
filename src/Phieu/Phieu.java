/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phieu;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Admin
 */
public class Phieu {

    private String maPhieu;
    private String nguoiTao;
    private String ngayTao;
    private String gioTao;
    private int Total;

    public Phieu() {

    }

    public Phieu(String maPhieu,String nguoiTao, String ngayTao, String gioTao, int Total) {
        this.maPhieu=maPhieu;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.gioTao = gioTao;
        this.Total = Total;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGioTao() {
        return gioTao;
    }

    public void setGioTao(String gioTao) {
        this.gioTao = gioTao;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

}
