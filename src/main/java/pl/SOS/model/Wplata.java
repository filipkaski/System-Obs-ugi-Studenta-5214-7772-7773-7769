package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Wplaty")
public class Wplata {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "naleznosc_id")
    private int naleznoscID;
    @Column(name = "kwota")
    private double kwota;
    @Column(name = "data_wplaty")
    private LocalDate dataWplaty;
    @Column(name = "referencja")
    private String referencja;

    public Wplata(int id, int naleznoscID, double kwota, LocalDate dataWplaty, String referencja) {
        this.id = id;
        this.naleznoscID = naleznoscID;
        this.kwota = kwota;
        this.dataWplaty = dataWplaty;
        this.referencja = referencja;
    }

    public Wplata() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNaleznoscID() {
        return naleznoscID;
    }

    public void setNaleznoscID(int naleznoscID) {
        this.naleznoscID = naleznoscID;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public LocalDate getDataWplaty() {
        return dataWplaty;
    }

    public void setDataWplaty(LocalDate dataWplaty) {
        this.dataWplaty = dataWplaty;
    }

    public String getReferencja() {
        return referencja;
    }

    public void setReferencja(String referencja) {
        this.referencja = referencja;
    }
}