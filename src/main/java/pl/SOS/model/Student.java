package pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studenci")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "uzytkownik_id")
    private int uzytkownikID;
    @Column(name = "nr_indeksu")
    private int nrIndeksu;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "kierunek")
    private String kierunek;
    @Column(name = "rok")
    private int rok;

    public Student(int id, int uzytkownikID, int nrIndeksu, String imie, String nazwisko, String kierunek, int rok) {
        this.id = id;
        this.uzytkownikID = uzytkownikID;
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
        this.rok = rok;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUzytkownikID() {
        return uzytkownikID;
    }

    public void setUzytkownikID(int uzytkownikID) {
        this.uzytkownikID = uzytkownikID;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}
