package ch.zli.m223.punchclock.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ch.zli.m223.punchclock.domain.Entry;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@ApplicationScoped
public class EntryService {
    @Inject
    private EntityManager entityManager;

    public EntryService() {
    }

    @Transactional 
    public Entry createEntry(Entry entry) {
        entityManager.persist(entry);
        return entry;
    }
    @Transactional
    public Entry deleteEntry(Entry entry) {
        entityManager.find(Entry.class, entry);
        return entry;
    }

    @SuppressWarnings("unchecked")
    public List<Entry> findAll() {
        var query = entityManager.createQuery("FROM Entry");
        return query.getResultList();
    }

    @Transactional
    public void delete(Long id){
        Entry entry = getEntryById(id);
        entityManager.remove(entry);
}

    public Entry getEntryById(@PathParam Long Id){
        return entityManager.find(Entry.class, Id);
    }

    @Transactional
    public void update(Entry entry){
        entityManager.merge(entry);
    }
}
