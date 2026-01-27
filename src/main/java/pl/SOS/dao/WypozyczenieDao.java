package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Wypozyczenie;

public interface WypozyczenieDao {
    void dodaj(Wypozyczenie wypozyczenie);
    void edytuj(Wypozyczenie wypozyczenie);
    void usun(int id);
    Wypozyczenie pobierzPoId(int id);
    List<Wypozyczenie> pobierzWszystkie();
    List<Wypozyczenie> pobierzAktywneStudenta(int studentId);
    List<Wypozyczenie> pobierzPrzeterminowane();
    List<Wypozyczenie> historiaWypozyczenStudenta(int studentId);
    void zmienStatus(int id, String nowyStatus);
}