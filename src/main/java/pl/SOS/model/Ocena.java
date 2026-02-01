package pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Oceny")
public class Ocena {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "student_id")
    private int studentID;
    @Column(name = "przedmiot_id")
    private int przedmiotID;
    @Column(name = "semestr")
    private int semestr;
    @Column(name = "wartosc")
    private String wartosc;
    @Column(name = "punkty")
    private int punkty;
    @Column(name = "rodzaj")
    private String rodzaj;
    @Column(name = "data_wystawienia")
    private LocalDate dataWystawienia;
    @Column(name = "prowadzacy_id")
    private int prowadzacyID;

    public Ocena(int id, int studentID, int przedmiotID, int semestr, String wartosc, int punkty, String rodzaj, LocalDate dataWystawienia, int prowadzacyID) {
        this.id = id;
        this.studentID = studentID;
        this.przedmiotID = przedmiotID;
        this.semestr = semestr;
        this.wartosc = wartosc;
        this.punkty = punkty;
        this.rodzaj = rodzaj;
        this.dataWystawienia = dataWystawienia;
        this.prowadzacyID = prowadzacyID;
    }

    public Ocena() {
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

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public String getWartosc() {
        return wartosc;
    }

    public void setWartosc(String wartosc) {
        this.wartosc = wartosc;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public int getProwadzacyID() {
        return prowadzacyID;
    }

    public void setProwadzacyID(int prowadzacyID) {
        this.prowadzacyID = prowadzacyID;
    }
}