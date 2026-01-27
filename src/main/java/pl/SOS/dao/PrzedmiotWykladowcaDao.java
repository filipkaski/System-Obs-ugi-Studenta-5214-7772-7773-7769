package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.PrzedmiotWykladowca;

public interface PrzedmiotWykladowcaDao {
    void dodaj(PrzedmiotWykladowca powiazanie);
    void usun(int id);
    PrzedmiotWykladowca pobierzPoId(int id);
    List<PrzedmiotWykladowca> pobierzWszystkie();
    List<PrzedmiotWykladowca> pobierzPoPrzedmiocie(int przedmiotId);
    List<PrzedmiotWykladowca> pobierzPoProwadzacym(int prowadzacyId);
    void usunPowiazanie(int przedmiotId, int prowadzacyId);
}