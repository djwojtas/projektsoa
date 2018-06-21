package paw.dao;

import paw.entity.Category;
import paw.entity.CategoryType;
import paw.entity.Element;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class CategoryTypeDAO {
    private static final Logger LOGGER = Logger.getLogger(CategoryTypeDAO.class.toString());
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-Zajecia");
    EntityManager em = factory.createEntityManager();

    public void saveCategoryType(CategoryType categoryType) {
        LOGGER.info("saveCategoryType() call");
        try {
            em.getTransaction().begin();
            em.persist(categoryType);
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + categoryType);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public void deleteCategoryType(CategoryType categoryType) {
        LOGGER.info("deleteCategoryType() call");
        try {
            em.getTransaction().begin();
            em.remove(categoryType);
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + categoryType);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public List<CategoryType> findAll() {
//        em.getEntityManagerFactory().getCache().evict(Category.class);
//        em.getEntityManagerFactory().getCache().evict(Element.class);
        TypedQuery<CategoryType> query =
                em.createNamedQuery("CategoryType.findAll", CategoryType.class);
        return query.getResultList();
    }

    public CategoryType findById(Long id) {
//        em.getEntityManagerFactory().getCache().evict(Category.class);
//        em.getEntityManagerFactory().getCache().evict(Element.class);
        TypedQuery<CategoryType> query =
                em.createNamedQuery("CategoryType.findById", CategoryType.class)
                        .setParameter("id", id);
        return query.getSingleResult();
    }
}
