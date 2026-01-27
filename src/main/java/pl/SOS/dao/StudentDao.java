package main.java.pl.SOS.dao;

import java.util.List;
import main.java.pl.SOS.model.Student;

public interface StudentDao {
    void dodaj(Student student);
    void edytuj(Student student);
    void usun(int id);
    Student pobierzPoId(int id);
    List<Student> pobierzWszystkie();
    Student znajdzPoNrIndeksu(int nrIndeksu);
    Student znajdzPoUzytkowniku(int uzytkownikID);
    List<Student> pobierzPoKierunku(String kierunek);
    List<Student> pobierzPoRoku(int rok);
}