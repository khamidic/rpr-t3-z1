package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

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
        String novi = " ";
        int i = 1;
        for (HashMap.Entry<String, TelefonskiBroj> map : mapa.entrySet())
            if (map.getKey().charAt(0) == s) {
                novi += i + ". " + map.getKey() + " - " + map.getValue().ispisi() + "\n";
                i++;
            }
        return novi;
    }

    public Set<String> izGrada(Grad g){
        SortedSet<String> novi=new TreeSet<String>();
        for (Map.Entry<String, TelefonskiBroj> a : mapa.entrySet())
            if (a.getValue()  instanceof FiksniBroj && a.getValue().ispisi().substring(0,3).equals(g.getPozivni(g.ordinal()))) novi.add(a.getKey());
        return novi;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Comparator<TelefonskiBroj> comp = (TelefonskiBroj t1, TelefonskiBroj t2) -> (t1.ispisi().compareTo(t2.ispisi()));
        SortedSet<TelefonskiBroj> novi=new TreeSet<TelefonskiBroj>(comp);
        for (Map.Entry<String, TelefonskiBroj> a : mapa.entrySet())
            if (a.getValue()  instanceof FiksniBroj && a.getValue().ispisi().substring(0,3).equals(g.getPozivni(g.ordinal()))) novi.add(a.getValue());
        return novi;
    }
}
