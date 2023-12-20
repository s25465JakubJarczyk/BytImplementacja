import java.util.ArrayList;
import java.util.List;

public class KierunekStudiow
    {
    private final String nazwaKierunku;
    private final String opisKierunku;
    private final List<Student> studenci = new ArrayList<Student>();

    public KierunekStudiow(String nazwaKierunku, String opisKierunku)
        {
        this.nazwaKierunku = nazwaKierunku;
        this.opisKierunku = opisKierunku;
        }

    public void powiazanieStudenta(Student student)
        {
        studenci.add(student);
        }

    }
