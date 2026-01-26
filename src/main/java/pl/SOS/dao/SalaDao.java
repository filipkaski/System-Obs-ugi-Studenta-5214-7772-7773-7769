package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Sala;

public interface SalaDao {
    void dodaj(Sala sala);
    void edytuj(Sala sala);
    void usun(int id);
    Sala pobierzPoId(int id);
    List<Sala> pobierzWszystkie();
    List<Sala> pobierzPoBudynku(String budynek);
    List<Sala> pobierzDostepneDlaPojemnosci(int minimalnaPojemnosc);
    Sala znajdzPoNumeruIBudynku(String numer, String budynek);
}