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


    //Getters and Setters
    public String geteMail() {return eMail;}
    public String getPassword() {return password;}
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getVorname() {return vorname;}
    public void setVorname(String vorname) {this.vorname = vorname;}
    public String getNachname() {return nachname;}
    public void setNachname(String nachname) {this.nachname = nachname;}
    public void setPassword(String password) {this.password = password;}
}

