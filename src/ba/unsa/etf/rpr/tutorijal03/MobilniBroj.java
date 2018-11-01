package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String mobilniBroj;

    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        mobilniBroj = broj;
    }

    @Override
    public String ispisi() {
        String s = new String("0" + mobilnaMreza + "/" + mobilniBroj);
        return s;
    }

    @Override
    public int hashCode() {
        return mobilniBroj.hashCode();
    }
}
