package main.java.pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Zapisy")
public class Zapis {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "student_id")
    private int studentID;
    @Column(name = "zajecia_id")
    private int zajeciaID;
    @Column(name = "data_zapisu")
    private LocalDateTime dataZapisu;
    @Column(name = "status")
    private String Status;
    @Column(name = "zapisal_admin_id")
    private int zapisalAdminID;

    public Zapis(int id, int studentID, int zajeciaID, LocalDate dataZapisu, String status, int zapisalAdminID) {
        this.id = id;
        this.studentID = studentID;
        this.zajeciaID = zajeciaID;
        this.dataZapisu = dataZapisu;
        Status = status;
        this.zapisalAdminID = zapisalAdminID;
    }

    public Zapis() {
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

    public int getZajeciaID() {
        return zajeciaID;
    }

    public void setZajeciaID(int zajeciaID) {
        this.zajeciaID = zajeciaID;
    }

    public LocalDate getDataZapisu() {
        return dataZapisu;
    }

    public void setDataZapisu(LocalDate dataZapisu) {
        this.dataZapisu = dataZapisu;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getZapisalAdminID() {
        return zapisalAdminID;
    }

    public void setZapisalAdminID(int zapisalAdminID) {
        this.zapisalAdminID = zapisalAdminID;
    }
}