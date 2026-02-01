package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.WymaganieWstepne;

public interface WymaganieWstepneDao {
    void dodaj(WymaganieWstepne wymaganie);
    void usun(int id);
    WymaganieWstepne pobierzPoId(int id);
    List<WymaganieWstepne> pobierzWszystkie();
    List<WymaganieWstepne> pobierzWymaganiaDlaPrzedmiotu(int przedmiotId);
    boolean czyPrzedmiotMaWymagania(int przedmiotId);
}