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

}
