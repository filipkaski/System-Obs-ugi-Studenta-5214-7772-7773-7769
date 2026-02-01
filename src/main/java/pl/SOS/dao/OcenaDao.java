package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.Ocena;

public interface OcenaDao {
    void dodaj(Ocena ocena);
    void edytuj(Ocena ocena);
    void usun(int id);
    Ocena pobierzPoId(int id);
    List<Ocena> pobierzWszystkie();
    List<Ocena> pobierzOcenyStudenta(int studentId);
    List<Ocena> filtrujOceny(int studentId, int semestr);
    List<Ocena> pobierzZPrzedmiotu(int studentId, int przedmiotId);
    List<Ocena> pobierzPoProwadzacym(int studentId, int prowadzacyId);
}