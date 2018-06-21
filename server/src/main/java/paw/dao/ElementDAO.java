package paw.dao;

import paw.entity.Category;
import paw.entity.Element;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class ElementDAO {
    private static final Logger LOGGER = Logger.getLogger(ElementDAO.class.toString());
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-Zajecia");
    EntityManager em = factory.createEntityManager();

    public void saveElement(Element element) {
        LOGGER.info("saveElement() call");
        try {
            if(em.getTransaction().isActive()) em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(em.contains(element) ? element : em.merge(element));
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + element);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public void deleteElement(Element element) {
        LOGGER.info("deleteElement() call");
        try {
            if(!em.getTransaction().isActive()) em.getTransaction().begin();
            em.remove(em.contains(element) ? element : em.merge(element));
//            em.remove(element);
            em.getTransaction().commit();
//            em.getEntityManagerFactory().getCache().evict(Category.class);
//            em.getEntityManagerFactory().getCache().evict(Element.class);
            LOGGER.info("Saved in database: " + element);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public List<Element> findByLogin(String login) {
//        em.getEntityManagerFactory().getCache().evict(Category.class);
//        em.getEntityManagerFactory().getCache().evict(Element.class);
        TypedQuery<Element> query =
                em.createNamedQuery("Element.findByLogin", Element.class)
                        .setParameter("login", login);
        return query.getResultList();
    }

    public Element findById(Long id) {
//        em.getEntityManagerFactory().getCache().evict(Category.class);
//        em.getEntityManagerFactory().getCache().evict(Element.class);
        TypedQuery<Element> query =
                em.createNamedQuery("Element.findById", Element.class)
                        .setParameter("id", id);
        return query.getSingleResult();
    }

    public List<Element> findByCategory(Category category) {
        TypedQuery<Element> query =
                em.createNamedQuery("Element.findByCategory", Element.class)
                        .setParameter("category", category);
        return query.getResultList();
    }
}
