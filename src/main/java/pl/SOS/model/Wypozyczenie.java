package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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
    private LocalDate dataWypozyczenia;
    @Column(name = "temin_zwrotu")
    private LocalDate terminZwrotu;
    @Column(name = "data_zwrotu")
    private LocalDate dataZwrotu;
    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(LocalDate dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public LocalDate getTerminZwrotu() {
        return terminZwrotu;
    }

    public void setTerminZwrotu(LocalDate terminZwrotu) {
        this.terminZwrotu = terminZwrotu;
    }

    public LocalDate getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(LocalDate dataWypozyczenia) {
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


    public Wypozyczenie(int id, int studentID, int ksiazkaID, LocalDate dataWypozyczenia, LocalDate terminZwrotu, LocalDate dataZwrotu, String status) {
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