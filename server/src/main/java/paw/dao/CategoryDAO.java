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
public class CategoryDAO {
    private static final Logger LOGGER = Logger.getLogger(CategoryDAO.class.toString());
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-Zajecia");
    EntityManager em = factory.createEntityManager();

    public void saveCategory(Category category) {
        LOGGER.info("saveCategory() call");
        try {
            if(em.getTransaction().isActive()) em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(em.contains(category) ? category : em.merge(category));
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + category);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public void deleteCategory(Category category) {
        LOGGER.info("deleteCategory() call");
        try {
            if(!em.getTransaction().isActive()) em.getTransaction().begin();
            em.remove(em.contains(category) ? category : em.merge(category));
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + category);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public List<Category> findAll() {
//        em.getEntityManagerFactory().getCache().evict(Category.class);
//        em.getEntityManagerFactory().getCache().evict(Element.class);
        TypedQuery<Category> query =
                em.createNamedQuery("Category.findAll", Category.class);
        return query.getResultList();
    }

    public List<Category> findByLogin(String login) {
//        em.getEntityManagerFactory().getCache().evict(Category.class);
//        em.getEntityManagerFactory().getCache().evict(Element.class);
        TypedQuery<Category> query =
                em.createNamedQuery("Category.findByLogin", Category.class)
                .setParameter("login", login);
        return query.getResultList();
    }

    public List<Category> findByType(CategoryType categoryType) {
        TypedQuery<Category> query =
                em.createNamedQuery("Category.findByType", Category.class)
                        .setParameter("categoryType", categoryType);
        return query.getResultList();
    }

    public Category findById(Long id) {
        TypedQuery<Category> query =
                em.createNamedQuery("Category.findById", Category.class)
                        .setParameter("id", id);
        return query.getSingleResult();
    }
}
