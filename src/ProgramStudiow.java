import java.time.LocalDateTime;

public class ProgramStudiow
    {
    private final LocalDateTime odKiedy;
    private final LocalDateTime doKiedy;
    private final KierunekStudiow kierunek;
    private final Student student;
    private int iloscStudentow;

    public ProgramStudiow(Student student, KierunekStudiow kierunek)
        {
        this.student = student;
        this.kierunek = kierunek;
        this.kierunek.powiazanieStudenta(student);

        this.odKiedy = LocalDateTime.now();
        this.doKiedy = this.odKiedy.plusDays(1024);
        }

    public void sprawdzProgramStudiow()
        {
        return;
        }
    }
