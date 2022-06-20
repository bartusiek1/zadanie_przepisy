package pl.sda.arp4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Stwórz klasę IlośćSkładnika:
//        //- double ilość
//        //- jednostka (GRAM, MILILITR, SZTUKA)

public class IloscSkladnika {

    private double ilosc;
    private Jednostka jednostka;

    public IloscSkladnika(double ilosc, Jednostka jednostka) {
        this.ilosc = ilosc;
        this.jednostka = jednostka;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public Jednostka getJednostka() {
        return jednostka;
    }

    public void setJednostka(Jednostka jednostka) {
        this.jednostka = jednostka;
    }

    @Override
    public String toString() {
        return "IloscSkladnika{" +
                "ilosc=" + ilosc +
                ", jednostka=" + jednostka +
                '}';
    }
}
