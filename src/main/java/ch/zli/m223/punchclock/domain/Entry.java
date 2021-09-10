package ch.zli.m223.punchclock.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime checkIn;
    @Column(nullable = false)
    private LocalDateTime checkOut;
    @ManyToOne
    private Arbeiter arbeiter;
    @ManyToOne
    private Projektleiter projektleiter;
    @ManyToOne
    private Projekt projekt;

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public Arbeiter getArbeiter() {return arbeiter;}

    public void setArbeiter(Arbeiter arbeiter) {this.arbeiter = arbeiter;}

    public Projektleiter getProjektleiter() {return projektleiter;}

    public void setProjektleiter(Projektleiter projektleiter) {this.projektleiter = projektleiter;}

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
}