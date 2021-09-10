package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Projektleiter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProjektleiterService {
    @Inject
    private EntityManager entityManager;

    public ProjektleiterService() {
    }
    Projektleiter projektleiter = new Projektleiter();
    @Transactional
    public Projektleiter createProjektleiter(Projektleiter projektleiter) {

        entityManager.persist(projektleiter);
        return projektleiter;
    }

    @SuppressWarnings("unchecked")
    public List<Projektleiter> findAll() {
        var query = entityManager.createQuery("FROM Projektleiter");
        return query.getResultList();
    }
}
