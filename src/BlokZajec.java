import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BlokZajec
    {
    private final List<Grupa> grupy = new ArrayList<>();
    Przedmiot przedmiot;
    LocalDateTime Poczatek;
    LocalDateTime Koniec;
    boolean Zdalnie;
    Sala Sala;
    private PlanZajec planZajec;

    public BlokZajec(Przedmiot przedmiot, LocalDateTime poczatek, boolean zdalnie, Sala sala)
        {
        this.przedmiot = przedmiot;
        this.Poczatek = poczatek;
        this.Koniec = getKoniec();
        this.Zdalnie = zdalnie;
        this.Sala = sala;
        }

    LocalDateTime getKoniec()
        {
        return this.Poczatek.plusMinutes(90);
        }

    }
