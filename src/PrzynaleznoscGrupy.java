import java.time.LocalDateTime;

public class PrzynaleznoscGrupy
    {
    private final LocalDateTime dolaczanie;
    private final Student student;
    private final Grupa grupa;
    private LocalDateTime wypisanie;

    public PrzynaleznoscGrupy(Student student, Grupa grupa)
        {
        this.student = student;
        this.grupa = grupa;
        this.grupa.powiazanieStudenta(student);

        this.dolaczanie = LocalDateTime.now();
        }
    }
