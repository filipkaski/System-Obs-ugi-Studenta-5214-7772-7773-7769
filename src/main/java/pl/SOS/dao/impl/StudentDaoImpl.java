package pl.SOS.dao.impl;

import pl.SOS.dao.StudentDao;
import pl.SOS.model.Student;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void dodaj(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void edytuj(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void usun(int id) {
        Student student = pobierzPoId(id);
        if (student != null) {
            entityManager.remove(student);
        }
    }

    @Override
    public Student pobierzPoId(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> pobierzWszystkich() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    @Override
    public Student znajdzPoNrIndeksu(int nrIndeksu) {
        return entityManager.createQuery("SELECT s FROM Student s WHERE s.nrIndeksu = :nr", Student.class)
                .setParameter("nr", nrIndeksu)
                .getSingleResult();

    }

    public Student znajdzPoUzytkowniku(int uzytkownikID) {
            return entityManager.createQuery("SELECT s FROM Student s WHERE s.uzytkownik.id = :uid", Student.class)
                    .setParameter("uid", uzytkownikID)
                    .getSingleResult();
    }

    @Override
    public List<Student> pobierzPoKierunku(String kierunek) {
        return entityManager.createQuery(
                        "SELECT s FROM Student s WHERE s.kierunek = :k",
                        Student.class)
                .setParameter("k", kierunek)
                .getResultList();
    }

    @Override
    public List<Student> pobierzPoRoku(int rok) {
        return entityManager.createQuery(
                        "SELECT s FROM Student s WHERE s.rok = :r",
                        Student.class)
                .setParameter("r", rok)
                .getResultList();
    }
}