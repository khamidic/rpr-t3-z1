package ba.unsa.etf.rpr.tutorijal03;

enum Grad {
    TRAVNIK("030"),
    ORASJE("031"),
    ZENICA("032"),
    SARAJEVO("033"),
    LIVNO("034"),
    TUZLA("035"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    SIROKI_BRIJEG("039");

    private final String pozivniBroj;
    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }
}

public class FiksniBroj extends TelefonskiBroj {
    private String fiksniBroj;
    private Grad grad;

    FiksniBroj(Grad grad, String broj) {
        fiksniBroj = broj;
        this.grad = grad;
    }

    @Override
    public void Ispisi() {
        System.out.println( grad + "/" + fiksniBroj );
    }

    @Override
    public int hashCode() {
        return fiksniBroj.hashCode();
    }
}

