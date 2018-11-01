package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    private HashMap<String, TelefonskiBroj> mapa = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        if(!mapa.containsKey(ime)) {
            mapa.put(ime, broj);
        }
    }

    public String dajBroj(String ime) {
        return mapa.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        for(var x : mapa.entrySet()) {
            if(x.getValue().equals(broj)) {
                return x.getKey();
            }
        }
        return "";
    }

    public String naSlovo(char s) {
        String stringic = new String();
        for(var x : mapa.entrySet()) {
            if(x.getKey().charAt(0) == s) {
                stringic += x.getKey() + " - " + x.getValue();
            }
        }
        return stringic;
    }



}
