package pl.SOS.dao.impl;

import pl.SOS.dao.WplataDao;
import pl.SOS.model.Wplata;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.List;

public class WplataDaoImpl implements WplataDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void dodaj(Wplata wplata) {
        entityManager.persist(wplata);
    }

    @Override
    public void edytuj(Wplata wplata) {
        entityManager.merge(wplata);
    }

    @Override
    public void usun(int id) {
        Wplata wplata = pobierzPoId(id);
        if (wplata != null) {
            entityManager.remove(wplata);
        }
    }

    @Override
    public Wplata pobierzPoId(int id) {
        return entityManager.find(Wplata.class, id);
    }

    @Override
    public List<Wplata> pobierzWszystkie() {
        String queryString = "SELECT w FROM Wplata w ORDER BY w.data DESC";
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }

    @Override
    public List<Wplata> pobierzWplatyStudenta(int studentId) {
        String queryString = "SELECT w FROM Wplata w WHERE w.student.id = :sid ORDER BY w.data DESC";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("sid", studentId);

        return query.getResultList();
    }

    @Override
    public List<Wplata> pobierzWplatyZOkresu(LocalDate dataOd, LocalDate dataDo) {
        StringBuilder sb = new StringBuilder("SELECT w FROM Wplata w WHERE 1=1");

        if (dataOd != null) {
            sb.append(" AND w.data >= :dataOd");
        }
        if (dataDo != null) {
            sb.append(" AND w.data <= :dataDo");
        }

        sb.append(" ORDER BY w.data DESC");

        Query query = entityManager.createQuery(sb.toString());

        if (dataOd != null) {
            query.setParameter("dataOd", dataOd);
        }
        if (dataDo != null) {
            query.setParameter("dataDo", dataDo);
        }

        return query.getResultList();
    }

    @Override
    public double sumaWplatStudenta(int studentId) {
        String queryString = "SELECT COALESCE(SUM(w.kwota), 0) FROM Wplata w WHERE w.student.id = :sid";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("sid", studentId);

        Object result = query.getSingleResult();
        if (result == null) {
            return 0.0;
        }

        return (double) result;

    }
}
