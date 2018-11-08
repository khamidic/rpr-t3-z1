package ba.unsa.etf.rpr.tutorijal03;

public enum Grad {
    BIHAĆ, ORASJE,TUZLA,ZENICA,GORAZDE,TRAVNIK,MOSTAR,SIROKI_BRIJEG,SARAJEVO,LIVNO,BRCKO;
    private String[] pozivniBrojevi = {"037", "031", "035", "032", "038", "030", "036", "039", "033", "034", "049"};

    String getPozivni(int i) {
        if (i < 0 || i > 11) {
            throw new IllegalArgumentException();
        }
        return pozivniBrojevi[i];
    }
}