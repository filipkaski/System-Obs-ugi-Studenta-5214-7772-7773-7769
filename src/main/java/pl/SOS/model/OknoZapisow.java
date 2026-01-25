package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Okna Zapisow")
public class OknoZapisow {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "semestr")
    private int semetr;
    @Column(name = "start_ts")
    private double startTS;
    @Column(name = "koniec_ts")
    private double koniecTS;
    @Column(name = "opis")
    private String opis;

    public OknoZapisow(int id, int semetr, double startTS, double koniecTS, String opis) {
        this.id = id;
        this.semetr = semetr;
        this.startTS = startTS;
        this.koniecTS = koniecTS;
        this.opis = opis;
    }

    public OknoZapisow() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemetr() {
        return semetr;
    }

    public void setSemetr(int semetr) {
        this.semetr = semetr;
    }

    public double getStartTS() {
        return startTS;
    }

    public void setStartTS(double startTS) {
        this.startTS = startTS;
    }

    public double getKoniecTS() {
        return koniecTS;
    }

    public void setKoniecTS(double koniecTS) {
        this.koniecTS = koniecTS;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}