package pl.SOS.dao;

import java.time.LocalDate;
import java.util.List;
import pl.SOS.model.Uzytkownik;

public interface UzytkownikDao {
    void dodaj(Uzytkownik uzytkownik);
    void edytuj(Uzytkownik uzytkownik);
    void usun(int id);
    Uzytkownik pobierzPoId(int id);
    List<Uzytkownik> pobierzWszystkie();
    Uzytkownik znajdzPoEmail(String email);
    void aktualizujNieudaneLogowania(int id, int liczba);
    void zablokujKonto(int id, LocalDate czasBlokady);
    boolean sprawdzDostepnoscEmail(String email);
}