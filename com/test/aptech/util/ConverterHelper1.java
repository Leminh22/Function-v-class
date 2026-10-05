package com.test.aptech.util;

public class ConverterHelper1 {
    private int inch;
    private int m;

    ConverterHelper1(int inch, int m){
        this.inch = inch;
        this.m = m;
    }

    public double chuyenInchSangMet() {
        return inch * 0.0254;
    }

    public double chuyenMetSangInch(){
        return m / 0.0254;
}
}
