import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
//        int sayi1 = 20;
//        int sayi2 = 30;
//        System.out.println(sayi1+sayi2);
//        System.out.println(sayi1+"+"+sayi2);
//
//        // Taking input from user
//        Scanner input = new Scanner(System.in);
//        int sayi3 = input.nextInt();
//        int sayi4 = input.nextInt();
//        System.out.println(sayi3+sayi4);
//
//        // örnek: sayı al tek çift kontrol et tekse "tek" yazdır değilse "çift" yazdır
//        int sayi5 = input.nextInt();
//        if(sayi5%2==0)
//        {
//            System.out.println(sayi5+" sayısı çifttir.");
//        }
//        else
//        {
//            System.out.println(sayi5+" sayisi tektir.");
//        }
//
//        // kullanıcıdan sayı al aldığın sayının faktöriyelini hesapla
//        int sayi6 = input.nextInt();
//        int faktoriyel = 1;
//        for(int i=1; i<=sayi6; i++)
//        {
//            faktoriyel *= i;
//        }
//        System.out.println(sayi6+" sayısının faktöriyeli: "+faktoriyel);
//
//        // kullanıcıdan 10 tane sayı aldığınız ve diziye eklediğiniz kodu yazın
//        System.out.println("10 tane sayı giriniz: ");
//        int[] dizi = new int[10];
//
//        Scanner input = new Scanner(System.in);
//        for(int i=0; i<dizi.length; i++)
//        {
//            dizi[i] = input.nextInt();
//        }
//        for (int i=0; i<dizi.length; i++)
//        {
//            System.out.println(dizi[i]);
//        }
//
//        //dizinin 10 elemanının ortalamasını bulan kodu yazın
//        Arrays.stream(dizi).average().ifPresent(average -> System.out.println("Ortalama: "+average));
//        //or
//        int toplam = 0;
//        for(int i=0; i<dizi.length; i++)
//        {
//            toplam += dizi[i];
//        }
//        System.out.println("Ortalama: "+((double) toplam /dizi.length));

        // fonksiyona diziyi gönderin ve bir sayı gönderin eğer dizide sayı yoksa -1 döndür varsa sayıyı döndürsün
        int[] dizi2 = {1,2,3,4,5,6,7,8,9,10};
        Scanner input2 = new Scanner(System.in);
        System.out.println("Aranacak sayıyı giriniz: ");
        int aranacakSayi = input2.nextInt();
        int varMi = sayiBul(dizi2, aranacakSayi);
        if (varMi == -1)
        {
            System.out.println("Sayı bulunamadı." + varMi);
        }
        else
        {
            System.out.println("Sayı bulundu: "+varMi +". indiste");
        }
    }
    private static int sayiBul(int[] dizi, int sayi)
    {
        for(int i=0; i<dizi.length; i++)
        {
            if(dizi[i] == sayi)
            {
                return i;
            }
        }
        return -1;
    }
}