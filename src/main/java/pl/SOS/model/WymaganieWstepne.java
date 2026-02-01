package pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wymagania Wstepne")
public class WymaganieWstepne {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "przedmiot_id")
    private int przedmiotID;
    @Column(name = "wymagany_przedmiot_id")
    private int wymaganyPrzedmiotID;

    public WymaganieWstepne(int id, int przedmiotID, int wymaganyPrzedmiotID) {
        this.id = id;
        this.przedmiotID = przedmiotID;
        this.wymaganyPrzedmiotID = wymaganyPrzedmiotID;
    }

    public WymaganieWstepne() {
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

    public int getWymaganyPrzedmiotID() {
        return wymaganyPrzedmiotID;
    }

    public void setWymaganyPrzedmiotID(int wymaganyPrzedmiotID) {
        this.wymaganyPrzedmiotID = wymaganyPrzedmiotID;
    }
}