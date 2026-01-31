package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sale")
public class Sala {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "budynek")
    private String budynek;
    @Column(name = "numer")
    private String numer;
    @Column(name = "pojemnosc")
    private int pojemnosc;

    public Sala(int id, String budynek, String numer, int pojemnosc) {
        this.id = id;
        this.budynek = budynek;
        this.numer = numer;
        this.pojemnosc = pojemnosc;
    }

    public Sala() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBudynek() {
        return budynek;
    }

    public void setBudynek(String budynek) {
        this.budynek = budynek;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
}