package pl.SOS.dao;

import java.time.LocalDate;
import java.util.List;
import pl.SOS.model.OknoZapisow;

public interface OknoZapisowDao {
    void dodaj(OknoZapisow okno);
    void edytuj(OknoZapisow okno);
    void usun(int id);
    OknoZapisow pobierzPoId(int id);
    List<OknoZapisow> pobierzWszystkie();
    List<OknoZapisow> pobierzAktywneOkna(LocalDate obecnyCzasTS);
    boolean czyStudentMaDostep(int studentId, int oknoId);
    List<OknoZapisow> pobierzOknaDlaSemestru(int semestr);
}