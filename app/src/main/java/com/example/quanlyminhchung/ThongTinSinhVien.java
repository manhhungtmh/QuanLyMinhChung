package com.example.quanlyminhchung;

public class ThongTinSinhVien {
    String maSinhVien;
    String hoTen;
    String Email;
    String matKhau;

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public ThongTinSinhVien(String maSinhVien, String hoTen, String email, String matKhau) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.Email = email;
        this.matKhau = matKhau;
    }

}
