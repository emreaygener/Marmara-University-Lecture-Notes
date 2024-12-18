import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba("Ford", "Focus", 2015, 150000);
        Araba araba2 = new Araba("Toyota", "Corolla", 2018, 100000);
        Araba araba3 = new Araba("Renault", "Megane", 2016, 120000);

        Surucu surucu = new Surucu("Ahmet", "Yılmaz", "12345678901");
        araba.BilgiGoster();
        System.out.println("Sürücü Bilgileri:");
        System.out.println("Ad: " + surucu.Ad);
        System.out.println("Soyad: " + surucu.Soyad);
        System.out.println("TC: " + surucu.TC);
        // int[] testarr = {1, 2, 3, 4, 5};
        // ArrayList<Integer> testarr2 = new ArrayList<>();
        // int i = testarr.length;
        // int j = testarr2.size();

//        String[] arabaModelleri = new String[3];
//        arabaModelleri[0] = araba.getModel();
//        arabaModelleri[1] = araba2.getModel();
//        arabaModelleri[2] = araba3.getModel();
//        System.out.println("Araba Modelleri: ");
//        for (String model : arabaModelleri) {
//            System.out.println(model);
//        }

//        Araba[] arabalar = new Araba[3];
//        arabalar[0] = araba;
//        arabalar[1] = araba2;
//        arabalar[2] = araba3;
//        System.out.println("Araba Modelleri: ");
//        for (Araba a : arabalar) {
//            System.out.println(a.getModel());
//        }

        Galeri galeri = new Galeri("Oto Galeri", new ArrayList<>());
        galeri.arabalar.add(araba);
        galeri.arabalar.add(araba2);
        galeri.arabalar.add(araba3);
        System.out.println("Galeri Adı: " + galeri.ad);
        System.out.println("Galerideki Arabalar: " );



    }
}