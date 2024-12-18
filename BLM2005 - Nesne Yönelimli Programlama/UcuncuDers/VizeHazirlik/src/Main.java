import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Ogrenci o = new Ogrenci();
        Scanner s = new Scanner(System.in);

        int count = 0;
        int sinir = 3;
        int yeniNot;

        do {
            try {
                System.out.println("Bir not giriniz:");

                yeniNot = s.nextInt();
                o.notEkle(yeniNot);

                count++;

            } catch (KucukDegerHatasi ex) {
                System.out.println(ex.getMessage());
            } catch (BuyukDegerHatasi ex) {
                System.out.println(ex.getMessage());

            }

        } while (count < sinir);
        o.notYazdir();
/**

 try {
 // Sıfıra bölme hatasına neden olacak kod
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(&quot;Sonuç: &quot; + result);
 } catch (ArithmeticException e) {
 // İstisna yakalandığında çalışacak kod
 System.out.println(&quot;Hata: Bir sayıyı sıfıra bölemezsiniz.&quot;);
 e.printStackTrace(); // Hata hakkında ayrıntılı bilgi yazdırır
 } finally {
 System.out.println(&quot;Bu kod her durumda çalışır.&quot;);
 }**/


    }
}