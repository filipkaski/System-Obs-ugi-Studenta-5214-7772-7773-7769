package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Zapis;

public interface ZapisDao {
    void dodaj(Zapis zapis);
    void edytuj(Zapis zapis);
    void usun(int id);
    Zapis pobierzPoId(int id);
    List<Zapis> pobierzWszystkie();
    List<Zapis> pobierzZapisyStudenta(int studentId);
    List<Zapis> pobierzListeStudentowNaZajeciach(int zajeciaId);
    boolean czyStudentJuzZapisany(int studentId, int zajeciaId);
    void wypiszStudenta(int studentId, int zajeciaId);
}