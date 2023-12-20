import java.util.ArrayList;
import java.util.List;

public class Grupa
    {
    private static int globalGrupaID = 0;
    private final int numerGrupy;
    private final List<Student> studenci = new ArrayList<>();
    private PlanZajec planZajec;

    public Grupa()
        {
        numerGrupy = globalGrupaID++;
        }

    public void powiazanieStudenta(Student student)
        {
        if (this.studenci.size() >= 20)
            {
            throw new RuntimeException("Grupa jest pełna");
            }
        studenci.add(student);
        }
    }
