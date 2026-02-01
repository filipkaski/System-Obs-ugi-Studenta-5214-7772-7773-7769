package pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Przedmioty")
public class Przedmiot {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "kod")
    private String kod;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "ects")
    private int ects;
    @Column(name = "semestr")
    private int semestr;

    public Przedmiot(int id, String kod, String nazwa, int ects, int semestr) {
        this.id = id;
        this.kod = kod;
        this.nazwa = nazwa;
        this.ects = ects;
        this.semestr = semestr;
    }

    public Przedmiot() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }
}
