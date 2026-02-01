package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.Zajecie;

public interface ZajecieDao {
    void dodaj(Zajecie zajecie);
    void edytuj(Zajecie zajecie);
    void usun(int id);
    Zajecie pobierzPoId(int id);
    List<Zajecie> pobierzWszystkie();
    List<Zajecie> pobierzPlanNaDzien(int semestr, String dzien);
    List<Zajecie> pobierzZajeciaPrzedmiotu(int przedmiotId);
    List<Zajecie> pobierzZajeciaWSali(int salaId, String dzien);
    int sprawdzWolneMiejsca(int zajecieId);
}