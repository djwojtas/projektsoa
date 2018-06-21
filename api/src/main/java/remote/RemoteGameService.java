package remote;

import paw.entity.*;

import java.util.List;

public interface RemoteGameService {
    String test();
    List<CategoryType> getCategoryTypes();
    List<Category> getCategoryByType(CategoryType categoryType);
    List<Element> getElementByCategory(Category category);
    ElementType getElementTypeById(Long id);
    CategoryType getCategoryTypeById(Long id);
    Category getCategoryById(Long id);
    void saveCategory(Category category);
    Element getElementById(Long id);
    void saveElement(Element element);
    List<ElementType> getElementTypes();
    List<Category> getCategories();
    void removeCategory(Long id);
    void removeElement(Long id);
    void addUser(AuthUser authUser, Role role);
    List<AuthUser> getUserList();
    AuthUser getAuthUserByLogin(String login);
    void updateUser(AuthUser authUser);
    List<Category> getCategoryByLogin(String remoteUser);
    List<Element> getTopElements();
}
