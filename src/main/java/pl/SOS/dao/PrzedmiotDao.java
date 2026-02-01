package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.Przedmiot;

public interface PrzedmiotDao {
    void dodaj(Przedmiot przedmiot);
    void edytuj(Przedmiot przedmiot);
    void usun(int id);
    Przedmiot pobierzPoId(int id);
    List<Przedmiot> pobierzWszystkie();
    List<Przedmiot> filtrujPrzedmioty(String nazwa, int semestr);
    List<Przedmiot> pobierzPoProwadzacym(int prowadzacyId);
    List<Przedmiot> pobierzPlanNaSemestr(int semestr);
    Przedmiot znajdzPoKodzie(String kod);
}