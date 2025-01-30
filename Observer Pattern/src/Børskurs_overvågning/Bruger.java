package Børskurs_overvågning;

import java.util.HashSet;
import java.util.Set;

public class Bruger implements Observer {
    private String navn;
    public Bruger(String navn) {
        this.navn = navn;
    }



    @Override
    public void update(Aktie a) {
        System.out.println("Kursen for aktien: " + a.getAktieNavn() + " har ændret kurs og har nu kursen: " + a.getKurs() + " du har " + a.getAntalForBruger(this) + " stk");
    }



}
