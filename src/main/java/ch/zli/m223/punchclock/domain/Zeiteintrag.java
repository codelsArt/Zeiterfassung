package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Zeiteintrag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Arbeiter arbeiter;
    @ManyToOne
    private Projekt projekt;

    public Arbeiter getArbeiter() {
        return arbeiter;
    }

    public void setArbeiter(Arbeiter arbeiter) {
        this.arbeiter = arbeiter;
    }

    public Projekt getProjekt() {
        return projekt;
    }

    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
