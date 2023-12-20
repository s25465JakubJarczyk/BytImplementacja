public abstract class Uzytkownik
    {
    private static int globalId = 0;
    int id;
    String adres;
    String imie;
    String nazwisko;
    String nrTel;
    String obywatelstwo;
    String pesel;

    public Uzytkownik(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel)
        {
        this.id = ++globalId;
        this.adres = adres;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTel = nrTel;
        this.obywatelstwo = obywatelstwo;
        this.pesel = pesel;
        }

    public void aktualizowanieDanychOsobowych(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel)
        {
        this.adres = adres;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTel = nrTel;
        this.obywatelstwo = obywatelstwo;
        this.pesel = pesel;
        }
    }
