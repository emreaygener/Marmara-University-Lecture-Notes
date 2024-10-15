public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Mehmet", "Yılmaz", "Bilgisayar Mühendisliği", 1999);
        Ogrenci ahmet = new Ogrenci("Ahmet", "Yılmaz");
        Ogrenci merve = new Ogrenci();
        System.out.println(ogrenci1.ad + " " + ogrenci1.soyad + " " + ogrenci1.bolum + " " + ogrenci1.dogumYili);
        System.out.println(ahmet.ad + " " + ahmet.soyad + " " + ahmet.bolum + " " + ahmet.dogumYili);
        System.out.println(merve.ad + " " + merve.soyad + " " + merve.bolum + " " + merve.dogumYili);

        merve.setAd("Merve");
        merve.setSoyad("Pınar");
        merve.setBolum("Yazılım Mühendisliği");
        merve.setDogumYili(1998);

        ahmet.setBolum("Yazılım Mühendisliği");
        ahmet.setDogumYili(1999);

        System.out.println(merve.getAd() + " " + merve.getSoyad() + " " + merve.getBolum() + " " + merve.getDogumYili());
        System.out.println(ahmet.getAd() + " " + ahmet.getSoyad() + " " + ahmet.getBolum() + " " + ahmet.getDogumYili());

        System.out.println(Ogrenci.yil);
        System.out.println(merve.yasHesapla());
        System.out.println(ahmet.yasHesapla());
        System.out.println(ogrenci1.yasHesapla());
    }
}