package paw.security;

import paw.entity.AuthUser;
import paw.entity.Role;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class RegistrationDAO {

    private static final Logger LOGGER = Logger.getLogger(RegistrationDAO.class.toString());
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-Zajecia");
    EntityManager em = factory.createEntityManager();

    public void addUser(AuthUser user, Role role) {
        LOGGER.info("addUser() call");
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.persist(role);
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + user);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }

    public AuthUser getAuthUserByLogin(String login) {
        Query query = em.createQuery("select a from " + AuthUser.class.getName() + " a where a.login = :login")
                .setParameter("login", login);
        return (AuthUser) query.getSingleResult();
    }

    public List<AuthUser> getAuthUsers() {
        TypedQuery<AuthUser> query =
                em.createNamedQuery("AuthUser.findAll", AuthUser.class);
        return query.getResultList();
    }

    public void saveUser(AuthUser authUser) {
        LOGGER.info("saveUser() call");
        try {
            if(em.getTransaction().isActive()) em.getTransaction().commit();
            em.getTransaction().begin();
            em.persist(em.contains(authUser) ? authUser : em.merge(authUser));
            em.getTransaction().commit();
            LOGGER.info("Saved in database: " + authUser);
        }
        catch(Exception e) {
            LOGGER.warning("Error while adding to database: " + e);
        }
    }
}
