public class Surucu {
    String Ad, Soyad, TC;

    public Surucu(String ad, String soyad, String TC) {
        Ad = ad;
        Soyad = soyad;
        this.TC = TC;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }
}
