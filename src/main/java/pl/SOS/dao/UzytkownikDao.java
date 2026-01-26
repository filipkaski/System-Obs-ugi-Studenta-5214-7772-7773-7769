package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Uzytkownik;

public interface UzytkownikDao {
    void dodaj(Uzytkownik uzytkownik);
    void edytuj(Uzytkownik uzytkownik);
    void usun(int id);
    Uzytkownik pobierzPoId(int id);
    List<Uzytkownik> pobierzWszystkie();
    Uzytkownik znajdzPoEmail(String email);
    void aktualizujNieudaneLogowania(int id, int liczba);
    void zablokujKonto(int id, double czasBlokady);
    boolean sprawdzDostepnoscEmail(String email);
}