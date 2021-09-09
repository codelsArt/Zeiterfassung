package ch.zli.m223.punchclock.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Arbeiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vorname;
    private String nachname;
    private String eMail;
    private String password;

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}

