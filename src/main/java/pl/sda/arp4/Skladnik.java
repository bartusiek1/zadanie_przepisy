package pl.sda.arp4;


//Stwórz klasę Składnik:
//- String nazwa
//- IloscSkladnika ilosc
//- double limitOstrzeżenie 	(to jest liczba którą dopiszemy i jeśli ilość jest mniejsza niż ta wartość, to lodówka "ostrzeże nas" o małej ilości)
//- double limitKrytyczny		(to jest liczba którą dopiszemy i jeśli ilość jest mniejsza niż ta wartość, to lodówka powie nam o ilości (stanie) krytycznym tej ilości)

public class Skladnik {

    private String nazwa;
    IloscSkladnika ilosc;
    private double limitOstrzezenie;
    private double limitKrytyczny;

    public Skladnik(String nazwa, IloscSkladnika ilosc, double limitOstrzezenie, double limitKrytyczny) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.limitOstrzezenie = limitOstrzezenie;
        this.limitKrytyczny = limitKrytyczny;
    }

    public Skladnik(String nazwa, IloscSkladnika ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;


    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public IloscSkladnika getIlosc() {
        return ilosc;
    }

    public void setIlosc(IloscSkladnika ilosc) {
        this.ilosc = ilosc;
    }

    public double getLimitOstrzezenie() {
        return limitOstrzezenie;
    }

    public double getLimitKrytyczny() {
        return limitKrytyczny;
    }

    @Override
    public String toString() {
        return "Skladnik{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                ", limitOstrzezenie=" + limitOstrzezenie +
                ", limitKrytyczny=" + limitKrytyczny +
                '}';
    }
}
