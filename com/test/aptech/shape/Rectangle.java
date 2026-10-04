package com.test.aptech.shape;

public class Rectangle {
    private int chieuDai;
    private int chieuRong;

    Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
