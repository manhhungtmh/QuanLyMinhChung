package com.example.quanlyminhchung;

public class MinhChung {
    String tenAnh;
    String tenMinhChung;
    String thoiGianDang;

    public String getTenAnh() {
        return tenAnh;
    }

    public void setTenAnh(String tenAnh) {
        this.tenAnh = tenAnh;
    }

    public String getTenMinhChung() {
        return tenMinhChung;
    }

    public void setTenMinhChung(String tenMinhChung) {
        this.tenMinhChung = tenMinhChung;
    }

    public String getThoiGianDang() {
        return thoiGianDang;
    }

    public void setThoiGianDang(String thoiGianDang) {
        this.thoiGianDang = thoiGianDang;
    }

    public MinhChung(String tenAnh, String tenMinhChung, String thoiGianDang) {
        this.tenAnh = tenAnh;
        this.tenMinhChung = tenMinhChung;
        this.thoiGianDang = thoiGianDang;
    }
}
