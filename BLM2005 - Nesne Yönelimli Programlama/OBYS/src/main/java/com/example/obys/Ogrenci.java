package com.example.obys;

public class Ogrenci {
    private String kullaniciAdi;
    private String sifre;

    public Ogrenci(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }
}


