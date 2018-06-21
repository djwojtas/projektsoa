package paw.dao;

import paw.entity.Category;
import paw.entity.CategoryType;
import paw.entity.Element;
import paw.entity.ElementType;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class ElementTypeDAO {
    private static final Logger LOGGER = Logger.getLogger(ElementTypeDAO.class.toString());
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-Zajecia");
    EntityManager em = factory.createEntityManager();

    public void saveElementType(ElementType elementType) {
        LOGGER.info("saveElementType() call");
        try {
            em.getTransaction().begin();
            em.persist(elementType);
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + elementType);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public void deleteElementType(ElementType elementType) {
        LOGGER.info("deleteElementType() call");
        try {
            em.getTransaction().begin();
            em.remove(elementType);
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + elementType);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public ElementType findById(Long id) {
        TypedQuery<ElementType> query =
                em.createNamedQuery("ElementType.findById", ElementType.class)
                        .setParameter("id", id);
        return query.getSingleResult();
    }

    public List<ElementType> findAll() {
        TypedQuery<ElementType> query =
                em.createNamedQuery("ElementType.findAll", ElementType.class);
        return query.getResultList();
    }
}
