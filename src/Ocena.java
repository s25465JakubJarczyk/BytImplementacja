import java.time.LocalDateTime;

public class Ocena
    {
    private final LocalDateTime Data;
    private final String Uwagi;
    private final Student student;
    private int Stopien;
    private EgzaminKolokwium egzaminKolokwium;

    public Ocena(LocalDateTime Data, int Stopien, String Uwagi, Student student)
        {
        this.student = student;
        this.Data = Data;
        this.Stopien = Stopien;
        this.Uwagi = Uwagi;
        }

    public int SprawdzanieOceny()
        {
        return Stopien;
        }

    public void WystawianieOcen(int ocena)
        {
        this.Stopien = ocena;
        }
    }
