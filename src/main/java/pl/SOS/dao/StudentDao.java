package pl.SOS.dao;

import java.util.List;
import pl.SOS.model.Student;

public interface StudentDao {
    void dodaj(Student student);
    void edytuj(Student student);
    void usun(int id);
    Student pobierzPoId(int id);
    List<Student> pobierzWszystkich();
    Student znajdzPoNrIndeksu(int nrIndeksu);
    Student znajdzPoUzytkowniku(int uzytkownikID);
    List<Student> pobierzPoKierunku(String kierunek);
    List<Student> pobierzPoRoku(int rok);
}