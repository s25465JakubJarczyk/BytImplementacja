public class PracownikDziekanatu extends Uzytkownik implements Pracownik<PracownikDziekanatu>
    {
    int dzial;
    String funkcjonalnosc;

    private Dziekanat dziekanat;


    public PracownikDziekanatu(int dzial, String funkcjonalnosc, String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel)
        {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.dzial = dzial;
        this.funkcjonalnosc = funkcjonalnosc;
        }

    @Override
    public PracownikDziekanatu zatrudnij(
            String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel)
        {
        return new PracownikDziekanatu(
                this.dzial,
                this.funkcjonalnosc,
                adres,
                imie,
                nazwisko,
                nrTel,
                obywatelstwo,
                pesel
        );
        }

    }
