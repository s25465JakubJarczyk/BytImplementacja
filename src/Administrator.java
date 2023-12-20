enum AccessLevel
    {
        FORBIDDEN, BASIC, ELEVATED, ROOT
    }

public class Administrator extends Uzytkownik implements Pracownik<Administrator>
    {
    AccessLevel poziomDostepu;

    public Administrator(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel)
        {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.poziomDostepu = AccessLevel.FORBIDDEN;
        }

    public void nadajUprawnienia(AccessLevel poziomDostepu)
        {
        this.poziomDostepu = poziomDostepu;
        }

    @Override
    public Administrator zatrudnij(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel)
        {
        return new Administrator(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        }
    }
