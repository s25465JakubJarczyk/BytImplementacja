import java.util.ArrayList;
import java.util.List;

public class ProfilStudenta
    {
    private static int GlobalId = 0;
    private final int Id;
    private final String Email;
    private final String Haslo;
    private final List<Podanie> podania = new ArrayList<>();
    private final List<Platnosc> platnosci = new ArrayList<>();
    private Student student;

    public ProfilStudenta(String Email, String Haslo)
        {
        this.Id = GlobalId++;
        this.Email = Email;
        this.Haslo = Haslo;
        }

    public boolean Logowanie(String haslo)
        {
        return true;
        }

    public void PrzegladanieMaterialow()
        {
        return;
        }

    public void PrzegladanieZakladek()
        {
        return;
        }
    }
