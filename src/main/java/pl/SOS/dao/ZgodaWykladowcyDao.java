package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.ZgodaWykladowcy;

public interface ZgodaWykladowcyDao {
    void dodaj(ZgodaWykladowcy zgoda);
    void edytuj(ZgodaWykladowcy zgoda);
    void usun(int id);
    ZgodaWykladowcy pobierzPoId(int id);
    List<ZgodaWykladowcy> pobierzWszystkie();
    List<ZgodaWykladowcy> pobierzZgodyStudenta(int studentId);
    ZgodaWykladowcy sprawdzZgode(int studentId, int przedmiotId);
    List<ZgodaWykladowcy> pobierzWydanePrzezWykladowce(int prowadzacyId);
}