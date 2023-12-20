import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Student extends Uzytkownik implements Urlop
    {
    private final String kontoWplat;
    private final int rok;
    private final List<Ocena> ListaOcen = new ArrayList<>();
    private final List<PrzynaleznoscGrupy> przynaleznosci = new ArrayList<>();
    private KierunekStudiow kierunekStudiow;
    private ProfilStudenta Profil;


    public Student(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, String kontoWplat, int rok)
        {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.kontoWplat = kontoWplat;
        this.rok = rok;
        }

    public static Student dodawanieNowegoStudenta(
            String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, String kontoWplat, Grupa domyslnaGrupa
    )
        {
        int rok = Year.now().getValue();

        var student = new Student(
                adres,
                imie,
                nazwisko,
                nrTel,
                obywatelstwo,
                pesel,
                kontoWplat,
                rok
        );

        student.przynaleznosci.add(new PrzynaleznoscGrupy(student, domyslnaGrupa));

        return student;
        }

    public static void main(String[] args)
        {
        var grupa = new Grupa();

        var s = Student.dodawanieNowegoStudenta(
                "Koszykowa 86",
                "Jan",
                "Kowalski",
                "123456789",
                "Polska",
                "12345678901",
                "12345678901234567890123456",
                grupa
        );

        System.out.println(s);
        }
    }
