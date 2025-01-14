package AdaptorPattern;

public class TelefonEEAAdaptor implements ElektrikliEvAletleri {

    private Telefon telefon;

    public TelefonEEAAdaptor(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
