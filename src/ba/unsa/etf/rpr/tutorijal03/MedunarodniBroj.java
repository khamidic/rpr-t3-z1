package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String medunardniBroj;

    MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        medunardniBroj = broj;
    }

    @Override
    public String ispisi() {
        String s = new String(drzava + medunardniBroj);
        return s;
    }

    @Override
    public int hashCode() {
        return medunardniBroj.hashCode();
    }
}
