package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Zajecia")
public class Zajecie {
    public Zajecie(int id, int przedmiotID, int prowadzacyID, int salaID, String typ, dniTygodnia dzienTygodnia, LocalDate godzinaOd, LocalDate godzinaDo, int semestr, int limitMiejsc) {
        this.id = id;
        this.przedmiotID = przedmiotID;
        this.prowadzacyID = prowadzacyID;
        this.salaID = salaID;
        this.typ = typ;
        this.dzienTygodnia = dzienTygodnia;
        this.godzinaOd = godzinaOd;
        this.godzinaDo = godzinaDo;
        this.semestr = semestr;
        this.limitMiejsc = limitMiejsc;
    }

    public Zajecie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalaID() {
        return salaID;
    }

    public void setSalaID(int salaID) {
        this.salaID = salaID;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public dniTygodnia getDzienTygodnia() {
        return dzienTygodnia;
    }

    public void setDzienTygodnia(dniTygodnia dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }

    public LocalDate getGodzinaOd() {
        return godzinaOd;
    }

    public void setGodzinaOd(LocalDate godzinaOd) {
        this.godzinaOd = godzinaOd;
    }

    public LocalDate getGodzinaDo() {
        return godzinaDo;
    }

    public void setGodzinaDo(LocalDate godzinaDo) {
        this.godzinaDo = godzinaDo;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public int getLimitMiejsc() {
        return limitMiejsc;
    }

    public void setLimitMiejsc(int limitMiejsc) {
        this.limitMiejsc = limitMiejsc;
    }

    enum dniTygodnia{PN, WT, SR, CZ, PT, SB, ND}

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "przedmiot_id")
    private int przedmiotID;
    @Column(name = "prowadzacy_di")
    private int prowadzacyID;
    @Column(name = "sala_id")
    private int salaID;
    @Column(name = "typ")
    private String typ;
    @Column(name = "dzien_tygodnia")
    private dniTygodnia dzienTygodnia;
    @Column(name = "godzina_od")
    private LocalDate godzinaOd;
    @Column(name = "godzina_do")
    private LocalDate godzinaDo;
    @Column(name = "semestr")
    private int semestr;
    @Column(name = "limit_miejsc")
    private int limitMiejsc;
}