package com.test.aptech.util;

public class MainThread {
    public static void main(String[] arga) {
        ConverterHelper CH1 = new ConverterHelper(5, 20);
        ConverterHelper1 CH2 = new ConverterHelper1(60, 20);
        System.out.println("Chuyen doi do C thanh do F : " + CH1.chuyenDoiDoCThanhDoF());
        System.out.println("Chuyen doi do F thanh do C : " + CH1.chuyenDoiDoFThanhDoC());
        System.out.println("Chuyen doi inch sang met : " + CH2.chuyenInchSangMet());
        System.out.println("Chuyen doi met sang inch :  " + CH2.chuyenMetSangInch());
    }
}
