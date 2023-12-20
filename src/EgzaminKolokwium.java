import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EgzaminKolokwium
    {
    private static int GlobalId = 0;
    private final int Id;
    private final List<Student> studenci = new ArrayList<>();
    private final List<Przedmiot> przedmioty = new ArrayList<>();
    private LocalDateTime Data;
    private String Tresc;
    private Wykladowca wykladowca;
    private Ocena ocena;

    public EgzaminKolokwium(LocalDateTime Data, String Tresc)
        {
        this.Id = GlobalId++;
        this.Data = Data;
        this.Tresc = Tresc;
        }

    public void PisanieEgzaminowIKolokwiow(String tresc)
        {
        this.Tresc += tresc;
        }

    public EgzaminKolokwium TworzenieEgzaminu(LocalDateTime Data, String Tresc)
        {
        return new EgzaminKolokwium(Data, Tresc);
        }

    public void UstalanieTerminowEgzaminuKolokwiow(LocalDateTime time)
        {
        this.Data = time;
        }
    }
