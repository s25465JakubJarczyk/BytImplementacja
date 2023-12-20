import java.util.ArrayList;
import java.util.List;

public class Przedmiot
    {
    private static int GlobalId = 0;
    private final int Id;
    private final String Nazwa;
    private final int Semestr;
    private final List<EgzaminKolokwium> egzaminyKolokwia = new ArrayList<>();
    private final List<KierunekStudiow> kierunekiStudiow = new ArrayList<>();
    private final List<BlokZajec> blokiZajec = new ArrayList<>();
    private Wykladowca wykladowca;

    public Przedmiot(String Nazwa, int Semestr)
        {
        this.Id = GlobalId++;
        this.Nazwa = Nazwa;
        this.Semestr = Semestr;
        }

    public void WstawianiaZaliczeniaPrzedmiotow()
        {
        return;
        }
    }
