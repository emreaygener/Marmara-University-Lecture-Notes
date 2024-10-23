import java.util.ArrayList;

public class Galeri {
    String ad;
    ArrayList<Araba> arabalar = new ArrayList<Araba>();

    public Galeri(String ad, ArrayList<Araba> arabalar) {
        this.ad = ad;
        this.arabalar = arabalar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public ArrayList<Araba> getArabalar() {
        return arabalar;
    }

    public void setArabalar(ArrayList<Araba> arabalar) {
        this.arabalar = arabalar;
    }
}
