public class Araba {
    String marka;
    String model;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    int yil;
    int km;

    public Araba(String marka, String model, int yil, int km) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.km = km;
    }

    public void BilgiGoster(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
        System.out.println("Km: " + km);
        System.out.println("--------------------");
    }
}
