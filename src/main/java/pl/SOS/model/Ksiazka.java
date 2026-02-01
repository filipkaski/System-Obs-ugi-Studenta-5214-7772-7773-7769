package pl.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ksiazki")
public class Ksiazka {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "tytul")
    private String tytul;
    @Column(name = "autor")
    private String autor;
    @Column(name = "rok")
    private int rok;

    public Ksiazka(int id, String isbn, String tytul, String autor, int rok) {
        this.id = id;
        this.isbn = isbn;
        this.tytul = tytul;
        this.autor = autor;
        this.rok = rok;
    }

    public Ksiazka() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}