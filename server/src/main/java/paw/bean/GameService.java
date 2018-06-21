package paw.bean;

import paw.dao.CategoryDAO;
import paw.dao.CategoryTypeDAO;
import paw.dao.ElementDAO;
import paw.dao.ElementTypeDAO;
import paw.entity.*;
import paw.security.HashUtil;
import paw.security.RegistrationDAO;
import remote.RemoteGameService;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;
import java.security.Principal;
import java.util.List;

@Remote(RemoteGameService.class)
@Stateless
public class GameService implements RemoteGameService, Serializable {
    @Inject
    private CategoryDAO categoryDAO;
    @Inject
    private CategoryTypeDAO categoryTypeDAO;
    @Inject
    private ElementDAO elementDAO;
    @Inject
    private ElementTypeDAO elementTypeDAO;
    @Inject
    private RegistrationDAO registrationDAO;


    public String test() {
        return "dziala";
    }

    private Principal getPrincipal() {
        return FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
    }

    @Override
    public List<CategoryType> getCategoryTypes() {
        return categoryTypeDAO.findAll();
    }

    @Override
    public List<Category> getCategoryByType(CategoryType categoryType) {
        return categoryDAO.findByType(categoryType);
    }

    @Override
    public List<Element> getElementByCategory(Category category) {
        return elementDAO.findByCategory(category);
    }

    @Override
    public ElementType getElementTypeById(Long id) {
        return elementTypeDAO.findById(id);
    }

    @Override
    public CategoryType getCategoryTypeById(Long id) {
        return categoryTypeDAO.findById(id);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryDAO.findById(id);
    }

    @Override
    public void saveCategory(Category category) {
        categoryDAO.saveCategory(category);
    }

    @Override
    public Element getElementById(Long id) {
        return elementDAO.findById(id);
    }

    @Override
    public void saveElement(Element element) {
        elementDAO.saveElement(element);
    }

    @Override
    public List<ElementType> getElementTypes() {
        return elementTypeDAO.findAll();
    }

    @Override
    public List<Category> getCategories() {
        return categoryDAO.findAll();
    }

    @Override
    public void removeCategory(Long id) {
        Category c = new Category();
        c.setId(id);
        categoryDAO.deleteCategory(c);
    }

    @Override
    public void removeElement(Long id) {
        Element e = new Element();
        e.setId(id);
        elementDAO.deleteElement(e);
    }

    @Override
    public void addUser(AuthUser authUser, Role role) {
        authUser.setPassword(HashUtil.getMD5Hash(authUser.getPassword()));
        registrationDAO.addUser(authUser, role);
    }

    @Override
    public List<AuthUser> getUserList() {
        return registrationDAO.getAuthUsers();
    }

    @Override
    public AuthUser getAuthUserByLogin(String login) {
        return registrationDAO.getAuthUserByLogin(login);
    }

    @Override
    public void updateUser(AuthUser authUser) {
        authUser.setPassword(HashUtil.getMD5Hash(authUser.getPassword()));
        registrationDAO.saveUser(authUser);
    }

    @Override
    public List<Category> getCategoryByLogin(String remoteUser) {
        return categoryDAO.findByLogin(remoteUser);
    }

    @Override
    public List<Element> getTopElements() {
        return elementDAO.getTopElements();
    }

    public void removeCategory(Category category) {
        categoryDAO.deleteCategory(category);
    }

    public void removeElement(Element element) {
        elementDAO.deleteElement(element);
    }
}
