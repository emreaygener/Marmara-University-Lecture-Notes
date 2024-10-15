public class Ogrenci {
    public static int yil = 2024;
    public String ad;
    public String soyad;
    public String bolum;
    public int dogumYili;

    public Ogrenci(String ad, String soyad, String bolum, int dogumYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.dogumYili = dogumYili;
    }
    public Ogrenci() {
        this.ad = "Bilgi yok";
        this.soyad = "Bilgi yok";
        this.bolum = "Bilgi yok";
        this.dogumYili = 0;
    }
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = "Bilgi yok";
        this.dogumYili = 0;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getBolum() {
        return bolum;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }
    // yası hesaplayan bi fonksiyon yaz int olarak yaş döndürsün mainde yazdır
    public int yasHesapla() {
        return  yil - dogumYili;
    }
}
