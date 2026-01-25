package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Naleznosci")
public class Naleznosc {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "student_id")
    private int studentID;
    @Column(name = "typ")
    private String typ;
    @Column(name = "kwota")
    private double kwota;
    @Column(name = "termin")
    private double termin;
    @Column(name = "status")
    private String status;
    @Column(name = "opis")
    private String opis;

    public Naleznosc(int id, int studentID, String typ, double kwota, double termin, String status, String opis) {
        this.id = id;
        this.studentID = studentID;
        this.typ = typ;
        this.kwota = kwota;
        this.termin = termin;
        this.status = status;
        this.opis = opis;
    }

    public Naleznosc() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public double getTermin() {
        return termin;
    }

    public void setTermin(double termin) {
        this.termin = termin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}