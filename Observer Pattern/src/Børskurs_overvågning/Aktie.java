package Børskurs_overvågning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aktie implements Subjekt {
    private String aktieNavn;
    private double kurs;
    private List<Observer> observers = new ArrayList();
    private Set<AktieSet> ejere = new HashSet();

    public Aktie(String aktieNavn, double kurs) {
        this.aktieNavn = aktieNavn;
        this.kurs = kurs;
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public Bruger findBruger(Bruger bruger) {
        for (AktieSet aktieSet : ejere) {
            if (aktieSet.getBruger().equals(bruger)) {
                return aktieSet.getBruger();
            }
        }
        return null;
    }

    public AktieSet findAktieSet(Bruger bruger) {
        for (AktieSet aktieSet : ejere) {
            if (aktieSet.getBruger().equals(bruger)) {
                return aktieSet;
            }
        }
        return null;
    }


    public void buyAktie(Bruger bruger, int antal) {
        if (findBruger(bruger) != null) {
            findAktieSet(bruger).increaseAntal(antal);
        } else {
            ejere.add(new AktieSet(bruger, antal));
        }
    }

    public void sellAktie(Bruger bruger, int antal) {
        AktieSet aktieset = findAktieSet(bruger);
        if (aktieset.antal >= antal) {
            aktieset.reduceAntal(antal);
        }
    }

    public int sellAll(Bruger bruger) {
        AktieSet aktieset = findAktieSet(bruger);
        int antalAktier = aktieset.antal;
        aktieset.reduceAntal(antalAktier);
        return antalAktier;
    }

    public void kursændring(double kursændring) {
        this.kurs=kursændring;
        notifyObservers();
    }

    public String getAktieNavn() {
        return aktieNavn;
    }

    public double getKurs() {
        return kurs;
    }

    public Set<AktieSet> getEjere() {
        return ejere;
    }

    public int getAntalForBruger(Bruger bruger) {
        return findAktieSet(bruger).antal;
    }

    static class AktieSet {
        Bruger bruger;
        int antal;

        public AktieSet(Bruger bruger, int antal) {
            this.bruger = bruger;
            this.antal = antal;
        }

        public int getAntal() {
            return antal;
        }

        public Bruger getBruger() {
            return bruger;
        }

        public void reduceAntal(int antal) {
            if (antal < this.antal) {
                this.antal -= antal;
            }
        }

        public void increaseAntal(int antal) {
            this.antal += antal;
        }
    }
}
