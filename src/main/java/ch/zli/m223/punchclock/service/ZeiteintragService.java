package ch.zli.m223.punchclock.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.punchclock.domain.Zeiteintrag;

@ApplicationScoped
public class ZeiteintragService {
    @Inject
    private EntityManager entityManager;

    public ZeiteintragService() {
    }

    @Transactional 
    public Zeiteintrag createEntry(Zeiteintrag zeiteintrag) {
        entityManager.persist(zeiteintrag);
        return zeiteintrag;
    }

    @SuppressWarnings("unchecked")
    public List<Zeiteintrag> findAll() {
        var query = entityManager.createQuery("FROM Entry");
        return query.getResultList();
    }
}
