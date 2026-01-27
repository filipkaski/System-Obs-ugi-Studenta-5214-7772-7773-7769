package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Wplata;

public interface WplataDao {
    void dodaj(Wplata wplata);
    void edytuj(Wplata wplata);
    void usun(int id);
    Wplata pobierzPoId(int id);
    List<Wplata> pobierzWszystkie();
    List<Wplata> pobierzWplatyStudenta(int studentId);
    List<Wplata> pobierzWplatyZOkresu(double dataOd, double dataDo);
    double sumaWplatStudenta(int studentId);
}