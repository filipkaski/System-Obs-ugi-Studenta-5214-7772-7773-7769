package main.java.pl.SOS.dao.impl;

import main.java.pl.SOS.dao.StudentDao;
import main.java.pl.SOS.model.Student;
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
    public Student pobierzPoId(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> pobierzWszystkich() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
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
    

}