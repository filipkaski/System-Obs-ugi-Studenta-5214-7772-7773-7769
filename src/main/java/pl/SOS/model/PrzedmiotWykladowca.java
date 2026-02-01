package pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Przedmioty_Prowadzacy")
public class PrzedmiotWykladowca {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "przedmiot_id")
    private int przedmiotID;
    @Column(name = "prowadzacy_id")
    private int prowadzacyID;

    public PrzedmiotWykladowca(int id, int przedmiotID, int prowadzacyID) {
        this.id = id;
        this.przedmiotID = przedmiotID;
        this.prowadzacyID = prowadzacyID;
    }

    public PrzedmiotWykladowca() {
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
}