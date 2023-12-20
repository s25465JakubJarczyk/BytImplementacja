import java.time.LocalDateTime;

public class Platnosc
    {
    private static int GlobalId = 0;
    private final int Id;
    private final LocalDateTime DataPlatnosci;
    private final int Kwota;
    private final String MetodaPlatnosci;
    private final LocalDateTime[] OkresOplaty;
    private ProfilStudenta profilStudenta;

    public Platnosc(LocalDateTime DataPlatnosci, int Kwota, String MetodaPlatnosci, LocalDateTime[] OkresOplaty)
        {
        this.Id = GlobalId++;
        this.DataPlatnosci = DataPlatnosci;
        this.Kwota = Kwota;
        this.MetodaPlatnosci = MetodaPlatnosci;
        this.OkresOplaty = OkresOplaty;
        }

    public static Platnosc DodawaniePlatnosci(LocalDateTime DataPlatnosci, int Kwota, String MetodaPlatnosci, LocalDateTime[] OkresOplaty)
        {
        return new Platnosc(DataPlatnosci, Kwota, MetodaPlatnosci, OkresOplaty);
        }

    }
