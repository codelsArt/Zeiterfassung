package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Arbeiter;
import ch.zli.m223.punchclock.domain.Projekt;
import ch.zli.m223.punchclock.domain.Projektleiter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProjektService {
    @Inject
    private EntityManager entityManager;

    public ProjektService() {
    }
    Projekt projekt = new Projekt();
    @Transactional
    public Projekt createProjekt(Projekt projekt) {

        entityManager.persist(projekt);
        return projekt;
    }

    @SuppressWarnings("unchecked")
    public List<Projekt> findAll() {
        var query = entityManager.createQuery("FROM Projekt");
        return query.getResultList();
    }
}
