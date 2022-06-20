package pl.sda.arp4;

import java.awt.*;
import java.util.*;


public class Spizarnia {

    private Map<String, Skladnik> skladniki = new HashMap<>();



    //- dodaj składnik (jako parametr przyjmujemy nazwę, iloscKrytyczna, iloscOstrzezenie i jednostkę)
    // Składnik tworzy się w lodówce mając ilośćSkładnika(0, jednostka))

    public void dodajSkladnik (String nazwa, IloscSkladnika ilosc, double limitKrytyczny, double limitOstrzezenie) {
        if (!skladniki.containsKey(nazwa)) {
            skladniki.put(nazwa, new Skladnik(nazwa, ilosc, limitOstrzezenie, limitKrytyczny));
        }

        //- zwiększ stan składnika (nazwa, ilość) (rzuca exception jeśli nie ma składnika)

        public void zwiekszStanskladnika (String nazwa, Double ilosc) {

        }

        //- zmniejsz stan składnika (nazwa, ilość) (rzuca exception jeśli nie ma składnika)

        //- zwróć stan składnika (nazwa) (zwraca optional empty jeśli nie ma składnika)


    //- zwróć składniki ktorych ilość jest niska (poziom niższy lub równy limitOstrzeżenie)

        //- zwróć składniki ktorych ilość jest krytyczna (poziom niższy lub równy limitKrytyczny)

        //- zmien limitOstrzeżenie (nazwa, nowaIlosc) (rzuca exception jeśli nie ma składnika)

        //- zmien limitKrytyczny (nazwa, nowaIlosc) (rzuca exception jeśli nie ma składnika)

    }
}

