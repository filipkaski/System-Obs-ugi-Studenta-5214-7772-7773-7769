package main.java.pl.SOS.dao.impl;

import main.java.pl.SOS.dao.BibliotekaDao;
import main.java.pl.SOS.model.Biblioteka;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BibliotekaDaoImpl implements BibliotekaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void dodaj(Biblioteka biblioteka) {
        entityManager.persist(biblioteka);
    }

    @Override
    public void edytuj(Biblioteka biblioteka) {
        entityManager.merge(biblioteka);
    }

    @Override
    public void usun(int id) {
        Biblioteka biblioteka = pobierzPoId(id);
        if (student != null) {
            entityManager.remove(biblioteka);
        }
    }

    @Override
    public Biblioteka pobierzPoId(int id) {
        return entityManager.find(Biblioteka.class, id);
    }

    @Override
    public List<Biblioteka> pobierzWszystkich() {
        return entityManager.createQuery("SELECT s FROM Biblioteka s", Biblioteka.class).getResultList();
    }
}
