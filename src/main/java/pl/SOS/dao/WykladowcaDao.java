package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.Wykladowca;

public interface WykladowcaDao {
    void dodaj(Wykladowca wykladowca);
    void edytuj(Wykladowca wykladowca);
    void usun(int id);
    Wykladowca pobierzPoId(int id);
    List<Wykladowca> pobierzWszystkie();
    List<Wykladowca> szukajPoNazwisku(String nazwisko);
    Wykladowca znajdzPoEmail(String email);
}