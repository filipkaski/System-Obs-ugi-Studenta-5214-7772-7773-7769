package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.Ksiazka;

public interface KsiazkaDao {
    void save(Ksiazka ksiazka);
    void update(Ksiazka ksiazka);
    void delete(int id);
    Ksiazka findById(int id);
    List<Ksiazka> findAll();
    List<Ksiazka> findByTytul(String tytul);
    List<Ksiazka> findByAutor(String autor);
    Ksiazka findByIsbn(String isbn);
    List<Ksiazka> pobierzWypozyczonePrzezStudenta(int studentId);
    List<Ksiazka> pobierzPrzeterminowane(int studentId);
    List<Ksiazka> pobierzOczekujaceWKolejce(int studentId);
}