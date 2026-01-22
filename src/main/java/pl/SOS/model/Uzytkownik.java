package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Uzytkownicy")
public class Uzytkownik {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "haslo_hash")
    private String hasloHash;
    @Column(name = "status")
    private String status;
    @Column(name = "data_utworzenia")
    private double dataUtworzenia;
    @Column(name = "ostatnie_logowanie")
    private double ostatnieLogowanie;
    @Column(name = "nieudane_logowania")
    private int nieudaneLogowania;
    @Column(name = "blokada_do")
    private double blokadaDo;

    public Uzytkownik(int id, String email, String hasloHash, String status, double dataUtworzenia, double ostatnieLogowanie, int nieudaneLogowania, double blokadaDo) {
        this.id = id;
        this.email = email;
        this.hasloHash = hasloHash;
        this.status = status;
        this.dataUtworzenia = dataUtworzenia;
        this.ostatnieLogowanie = ostatnieLogowanie;
        this.nieudaneLogowania = nieudaneLogowania;
        this.blokadaDo = blokadaDo;
    }

    public Uzytkownik() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHasloHash() {
        return hasloHash;
    }

    public void setHasloHash(String hasloHash) {
        this.hasloHash = hasloHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(double dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public double getOstatnieLogowanie() {
        return ostatnieLogowanie;
    }

    public void setOstatnieLogowanie(double ostatnieLogowanie) {
        this.ostatnieLogowanie = ostatnieLogowanie;
    }

    public int getNieudaneLogowania() {
        return nieudaneLogowania;
    }

    public void setNieudaneLogowania(int nieudaneLogowania) {
        this.nieudaneLogowania = nieudaneLogowania;
    }

    public double getBlokadaDo() {
        return blokadaDo;
    }

    public void setBlokadaDo(double blokadaDo) {
        this.blokadaDo = blokadaDo;
    }
}
