import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Wykladowca extends Uzytkownik implements Urlop
    {
    private static int GlobalId = 0;
    private final int Id;
    private final LocalDateTime DataZatrudnienia;
    private final int StawkaGodzinowa;
    private final String TytulNaukowy;
    private final List<EgzaminKolokwium> egzaminyKolokwia = new ArrayList<>();
    private final List<Przedmiot> przedmioty = new ArrayList<>();
    private final List<BlokZajec> blokiZajec = new ArrayList<>();
    private List<String> Certyfikaty = new ArrayList<>();

    public Wykladowca(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, List<String> Certyfikaty, LocalDateTime DataZatrudnienia, int StawkaGodzinowa, String TytulNaukowy)
        {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.Id = GlobalId++;
        this.Certyfikaty = Certyfikaty;
        this.DataZatrudnienia = DataZatrudnienia;
        this.StawkaGodzinowa = StawkaGodzinowa;
        this.TytulNaukowy = TytulNaukowy;
        }

    public void DodawanieMaterialowWykladowych()
        {
        return;
        }
    }
