package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private String fiksniBroj;
    private Grad grad;

    FiksniBroj(Grad grad, String broj) {
        fiksniBroj = broj;
        this.grad = grad;
    }

    @Override
    public String ispisi() {
        String s = new String(grad + "/" + fiksniBroj);
        return s;
    }

    @Override
    public int hashCode() {
        return fiksniBroj.hashCode();
    }
}

