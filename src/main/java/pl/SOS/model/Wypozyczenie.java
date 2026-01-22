package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wypozyczenia")
public class Wypozyczenie {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "student_id")
    private int studentID;
    @Column(name = "ksiazka_id")
    private int ksiazkaID;
    @Column(name = "data_wypozyczenia")
    private double dataWypozyczenia;
    @Column(name = "temin_zwrotu")
    private double terminZwrotu;
    @Column(name = "data_zwrotu")
    private double dataZwrotu;
    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(double dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public double getTerminZwrotu() {
        return terminZwrotu;
    }

    public void setTerminZwrotu(double terminZwrotu) {
        this.terminZwrotu = terminZwrotu;
    }

    public double getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(double dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public int getKsiazkaID() {
        return ksiazkaID;
    }

    public void setKsiazkaID(int ksiazkaID) {
        this.ksiazkaID = ksiazkaID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Wypozyczenie(int id, int studentID, int ksiazkaID, double dataWypozyczenia, double terminZwrotu, double dataZwrotu, String status) {
        this.id = id;
        this.studentID = studentID;
        this.ksiazkaID = ksiazkaID;
        this.dataWypozyczenia = dataWypozyczenia;
        this.terminZwrotu = terminZwrotu;
        this.dataZwrotu = dataZwrotu;
        this.status = status;
    }

    public Wypozyczenie() {
    }


}