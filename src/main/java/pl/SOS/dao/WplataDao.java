package pl.SOS.dao;

import java.time.LocalDate;
import java.util.List;
import pl.SOS.model.Wplata;

public interface WplataDao {
    void dodaj(Wplata wplata);
    void edytuj(Wplata wplata);
    void usun(int id);
    Wplata pobierzPoId(int id);
    List<Wplata> pobierzWszystkie();
    List<Wplata> pobierzWplatyStudenta(int studentId);
    List<Wplata> pobierzWplatyZOkresu(LocalDate dataOd, LocalDate dataDo);
    double sumaWplatStudenta(int studentId);
}