package com.test.aptech.util;

public class ConverterHelper{
    private int doF;
    private int doC;

    ConverterHelper(int doF, int doC) {
        this.doC = doC;
        this.doF = doF;
    }

    public double chuyenDoiDoFThanhDoC() {
        return (doC * 1.8) + 32;
    }

    public double chuyenDoiDoCThanhDoF() {
        return (doF - 32) / 1.8;
    }
}
