package pl.SOS.dao.impl;

import pl.SOS.dao.PrzedmiotDao;
import pl.SOS.model.Przedmiot;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PrzedmiotDaoImpl implements PrzedmiotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void dodaj(Przedmiot przedmiot) {
        entityManager.persist(przedmiot);
    }

    @Override
    public void edytuj(Przedmiot przedmiot) {
        entityManager.merge(przedmiot);
    }

    @Override
    public void usun(int id) {
        Przedmiot przedmiot = pobierzPoId(id);
        if (przedmiot != null) {
            entityManager.remove(przedmiot);
        }
    }

    @Override
    public Przedmiot pobierzPoId(int id) {
        return entityManager.find(Przedmiot.class, id);
    }

    @Override
    public List<Przedmiot> pobierzWszystkie() {
        String queryString = "SELECT p FROM Przedmiot p";
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> filtrujPrzedmioty(String nazwa, int semestr) {
        StringBuilder queryBuilder = new StringBuilder("SELECT p FROM Przedmiot p WHERE 1=1");

        if (nazwa != null && !nazwa.trim().isEmpty()) {
            queryBuilder.append(" AND LOWER(p.nazwa) LIKE :nazwa");
        }
        if (semestr > 0) {
            queryBuilder.append(" AND p.semestr = :semestr");
        }

        Query query = entityManager.createQuery(queryBuilder.toString());

        if (nazwa != null && !nazwa.trim().isEmpty()) {
            query.setParameter("nazwa", "%" + nazwa.toLowerCase() + "%");
        }
        if (semestr > 0) {
            query.setParameter("semestr", semestr);
        }

        return query.getResultList();
    }

    @Override
    public List<Przedmiot> pobierzPoProwadzacym(int prowadzacyId) {
        String queryString = "SELECT p FROM Przedmiot p WHERE p.prowadzacy.id = :pid";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("pid", prowadzacyId);

        return query.getResultList();
    }

    @Override
    public List<Przedmiot> pobierzPlanNaSemestr(int semestr) {
        String queryString = "SELECT p FROM Przedmiot p WHERE p.semestr = :s ORDER BY p.nazwa";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("s", semestr);

        return query.getResultList();
    }

    @Override
    public Przedmiot znajdzPoKodzie(String kod) {
        String queryString = "SELECT p FROM Przedmiot p WHERE p.kod = :kod";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("kod", kod);

        return (Przedmiot) query.getSingleResult();

    }
}
