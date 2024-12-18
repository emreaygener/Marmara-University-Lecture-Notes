public class KucukDegerHatasi extends Exception{
    public KucukDegerHatasi(int kucukDeger) {
        super(kucukDeger + " not olarak girilemez!");
    }
}
