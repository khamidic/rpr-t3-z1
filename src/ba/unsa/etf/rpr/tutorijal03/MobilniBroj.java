package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String mobilniBroj;

    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        mobilniBroj = broj;
    }

    @Override
    public void Ispisi() {
        System.out.println("0" + mobilnaMreza + "/" + mobilniBroj);
    }

    @Override
    public int hashCode() {
        return mobilniBroj.hashCode();
    }
}
