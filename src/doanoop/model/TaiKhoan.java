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
public class TaiKhoan implements Serializable{
    String user;
    String pass;
    String role;
    int phone;
    String status;
public TaiKhoan(){
    
}
    public TaiKhoan(String user, String pass, String role, int phone) {
        this.user = user;
        this.pass = pass;
        this.role = role;
        this.phone = phone;
        this.status=status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
