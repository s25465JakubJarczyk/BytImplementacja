import java.time.LocalDateTime;

public interface Pracownik<T extends Uzytkownik>
    {
    LocalDateTime zatrudnienie = LocalDateTime.now();
    int stawka = 0;

    T zatrudnij(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel);
    }
