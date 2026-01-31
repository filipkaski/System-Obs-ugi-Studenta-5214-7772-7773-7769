package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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
    private LocalDateTime dataUtworzenia;
    @Column(name = "ostatnie_logowanie")
    private LocalDateTime ostatnieLogowanie;
    @Column(name = "nieudane_logowania")
    private int nieudaneLogowania;
    @Column(name = "blokada_do")
    private LocalDateTime blokadaDo;

    public Uzytkownik(int id, String email, String hasloHash, String status, LocalDate dataUtworzenia, LocalDate ostatnieLogowanie, int nieudaneLogowania, LocalDate blokadaDo) {
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

    public LocalDate getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(LocalDate dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public LocalDate getOstatnieLogowanie() {
        return ostatnieLogowanie;
    }

    public void setOstatnieLogowanie(LocalDate ostatnieLogowanie) {
        this.ostatnieLogowanie = ostatnieLogowanie;
    }

    public int getNieudaneLogowania() {
        return nieudaneLogowania;
    }

    public void setNieudaneLogowania(int nieudaneLogowania) {
        this.nieudaneLogowania = nieudaneLogowania;
    }

    public LocalDate getBlokadaDo() {
        return blokadaDo;
    }

    public void setBlokadaDo(LocalDate blokadaDo) {
        this.blokadaDo = blokadaDo;
    }
}
