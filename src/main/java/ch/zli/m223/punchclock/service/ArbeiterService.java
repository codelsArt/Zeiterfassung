package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Arbeiter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ArbeiterService {
    @Inject
    private EntityManager entityManager;

    public ArbeiterService() {
    }
    Arbeiter arbeiter = new Arbeiter();
    @Transactional
    public Arbeiter createArbeiter(Arbeiter arbeiter) {

        entityManager.persist(arbeiter);
        return arbeiter;
    }

    @SuppressWarnings("unchecked")
    public List<Arbeiter> findAll() {
        var query = entityManager.createQuery("FROM Arbeiter");
        return query.getResultList();
    }

    public Arbeiter findArbeiter(String eMail, String passwort) {
        var query = entityManager.createQuery("FROM User WHERE eMail='" +eMail +"' and password='" + passwort + "'");
        return (Arbeiter) query.getSingleResult();
    }
}
