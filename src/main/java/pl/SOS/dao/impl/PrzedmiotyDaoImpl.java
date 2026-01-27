package main.java.pl.SOS.dao.impl;

import main.java.pl.SOS.dao.PrzedmiotyDao;
import main.java.pl.SOS.model.Przedmioty;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PrzedmiotyDaoImpl implements PrzedmiotyDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void dodaj(Przedmioty przedmioty) {
        entityManager.persist(przedmioty);
    }

    @Override
    public void edytuj(Przedmioty przedmioty) {
        entityManager.merge(przedmioty);
    }

    @Override
    public void usun(int id) {
        Przedmioty przedmioty = pobierzPoId(id);
        if (student != null) {
            entityManager.remove(przedmioty);
        }
    }

    @Override
    public Przedmioty pobierzPoId(int id) {
        return entityManager.find(Przedmioty.class, id);
    }

    @Override
    public List<Przedmioty> pobierzWszystkich() {
        return entityManager.createQuery("SELECT s FROM Przedmioty s", Przedmioty.class).getResultList();
    }
}
