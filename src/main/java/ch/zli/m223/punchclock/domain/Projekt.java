package ch.zli.m223.punchclock.domain;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
public class Projekt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Arbeiter> arbeiterList;
    @ManyToOne
    private Projektleiter projektleiter;
    @ManyToOne
    private Arbeiter arbeiter;


    //Getters and Setters
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public List<Arbeiter> getArbeiterList() {return arbeiterList;}
    public void setArbeiterList(List<Arbeiter> arbeiterList) {this.arbeiterList = arbeiterList;}
    public Projektleiter getProjektleiter() {return projektleiter;}
    public void setProjektleiter(Projektleiter projektleiter) {this.projektleiter = projektleiter;}
    public Arbeiter getArbeiter() {return arbeiter;}
    public void setArbeiter(Arbeiter arbeiter) {this.arbeiter = arbeiter;}
}
