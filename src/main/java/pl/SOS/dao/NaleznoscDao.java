package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Naleznosc;

public interface NaleznoscDao {
    void dodaj(Naleznosc naleznosc);
    void edytuj(Naleznosc naleznosc);
    void usun(int id);
    Naleznosc pobierzPoId(int id);
    List<Naleznosc> pobierzWszystkie();
    List<Naleznosc> pobierzCzesneStudenta(int studentId);
    List<Naleznosc> pobierzNieoplacone(int studentId);
    List<Naleznosc> pobierzHistorieWplat(int studentId);
    double obliczSumeZadluzenia(int studentId);
}