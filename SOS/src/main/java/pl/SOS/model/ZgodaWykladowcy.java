package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Zgody Prowdzacych")
public class ZgodaWykladowcy {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "student_id")
    private int studentID;
    @Column(name = "przedmiot_id")
    private int przedmiotID;
    @Column(name = "prowadzacy_id")
    private int prowadzacyID;
    @Column(name = "data_wydania")
    private LocalDateTime dataWydania;
    @Column(name = "uwagi")
    private String uwagi;

    public ZgodaWykladowcy(int id, int studentID, int przedmiotID, int prowadzacyID, LocalDate dataWydania, String uwagi) {
        this.id = id;
        this.studentID = studentID;
        this.przedmiotID = przedmiotID;
        this.prowadzacyID = prowadzacyID;
        this.dataWydania = dataWydania;
        this.uwagi = uwagi;
    }

    public ZgodaWykladowcy() {
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

    public int getPrzedmiotID() {
        return przedmiotID;
    }

    public void setPrzedmiotID(int przedmiotID) {
        this.przedmiotID = przedmiotID;
    }

    public int getProwadzacyID() {
        return prowadzacyID;
    }

    public void setProwadzacyID(int prowadzacyID) {
        this.prowadzacyID = prowadzacyID;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(LocalDate dataWydania) {
        this.dataWydania = dataWydania;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }
}