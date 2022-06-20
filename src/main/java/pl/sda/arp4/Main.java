package pl.sda.arp4;

public class Main {
    public static void main(String[] args) {

        // Napisz program do przechowywania przepisów i listy składników.
        //
        //Stwórz klasę IlośćSkładnika:
        //- double ilość
        //- jednostka (GRAM, MILILITR, SZTUKA)
        //
        //Stwórz klasę Składnik:
        //- String nazwa
        //- IloscSkladnika ilosc
        //- double limitOstrzeżenie 		(to jest liczba którą dopiszemy i jeśli ilość jest mniejsza niż ta wartość, to lodówka "ostrzeże nas" o małej ilości)
        //- double limitKrytyczny			(to jest liczba którą dopiszemy i jeśli ilość jest mniejsza niż ta wartość, to lodówka powie nam o ilości (stanie) krytycznym tej ilości)
        //
        //Stwórz klasę Przepis:
        //- String nazwa;
        //- Set<Składnik> składniki;
        //- String instrukcje;
        //
        //Stwórz klasę Lodówka/Spiżarnia/Nie wiem... magazyn produktów spożywczych w domu?:
        //- kolekcja Składników (mapa, set, lista ?)
        //metody:
        //- zwróć składniki ktorych ilość jest niska (poziom niższy lub równy limitOstrzeżenie)
        //- zwróć składniki ktorych ilość jest krytyczna (poziom niższy lub równy limitKrytyczny)
        //- dodaj składnik (jako parametr przyjmujemy nazwę, iloscKrytyczna, iloscOstrzezenie i jednostkę) Składnik tworzy się w lodówce mając ilośćSkładnika(0, jednostka))
        //- zwiększ stan składnika (nazwa, ilość) (rzuca exception jeśli nie ma składnika)
        //- zmniejsz stan składnika (nazwa, ilość) (rzuca exception jeśli nie ma składnika)
        //- zwróć stan składnika (nazwa) (zwraca optional empty jeśli nie ma składnika)
        //- zmien limitOstrzeżenie (nazwa, nowaIlosc) (rzuca exception jeśli nie ma składnika)
        //- zmien limitKrytyczny (nazwa, nowaIlosc) (rzuca exception jeśli nie ma składnika)

        //

    }
}