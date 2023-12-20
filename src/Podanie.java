import java.time.LocalDateTime;

public class Podanie
    {
    private static int GlobalId = 0;
    private final int Id;
    private final LocalDateTime DataZlozenia;
    private final String TypPodania;
    private final String Tresc;
    private PracownikDziekanatu pracownikDziekanatu;
    private ProfilStudenta profilStudenta;

    public Podanie(LocalDateTime DataZlozenia, String TypePodania, String Tresc)
        {
        this.Id = GlobalId++;
        this.DataZlozenia = DataZlozenia;
        this.TypPodania = TypePodania;
        this.Tresc = Tresc;
        }

    public static boolean AkceptowaniePodania(Podanie podanie)
        {
        return true;
        }

    public static Podanie PisaniePodania(LocalDateTime DataZlozenia, String TypePodania, String Tresc)
        {
        return new Podanie(DataZlozenia, TypePodania, Tresc);
        }


    }
