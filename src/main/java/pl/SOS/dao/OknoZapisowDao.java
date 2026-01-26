package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.OknoZapisow;

public interface OknoZapisowDao {
    void dodaj(OknoZapisow okno);
    void edytuj(OknoZapisow okno);
    void usun(int id);
    OknoZapisow pobierzPoId(int id);
    List<OknoZapisow> pobierzWszystkie();
    List<OknoZapisow> pobierzAktywneOkna(double obecnyCzasTS);
    boolean czyStudentMaDostep(int studentId, int oknoId);
    List<OknoZapisow> pobierzOknaDlaSemestru(int semestr);
}