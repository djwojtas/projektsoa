package paw.test;

import lombok.Getter;
import lombok.Setter;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;
import paw.entity.Category;
import paw.entity.CategoryType;
import paw.entity.Element;
import paw.entity.ElementType;
import paw.push.ChangeEvent;
import remote.RemoteGameService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
//@ManagedBean
@SessionScoped
public class GameController implements Serializable {
    @EJB(mappedName = "java:global/server/GameService!remote.RemoteGameService")
    private RemoteGameService remoteGameService;

    @Inject
    private Event<ChangeEvent> changeEvent;

    private List<Element> topElements;

    public List<Element> getTopElements() {
        return topElements;
    }

    public void setTopElements(List<Element> topElements) {
        this.topElements = topElements;
    }

    public String testService() {
        return remoteGameService.test();
    }
    public List<CategoryType> getCategoryTypes() {
        return remoteGameService.getCategoryTypes();
    }
    public List<Category> getCategoryByType(CategoryType categoryType) {
        return remoteGameService.getCategoryByType(categoryType);
    }
    public List<Element> getElementsByCategory(Category category) {
        return remoteGameService.getElementByCategory(category);
    }
    public ElementType getElementTypeById(Long id) {
        return remoteGameService.getElementTypeById(id);
    }
    public List<ElementType> getElementTypes() {
        return remoteGameService.getElementTypes();
    }
    public List<Category> getCategories() {
        if(FacesContext.getCurrentInstance().getExternalContext().isUserInRole("Manager")) return remoteGameService.getCategories();
        else return remoteGameService.getCategoryByLogin(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser());
    }
    public void removeCategory(Long id) {
        remoteGameService.removeCategory(id);
    }

    public void removeElement(Long id) {
        remoteGameService.removeElement(id);
        changeEvent.fire(new ChangeEvent());
    }
    public boolean checkOwner(String login) {
        return FacesContext.getCurrentInstance().getExternalContext().isUserInRole("Manager") || FacesContext.getCurrentInstance().getExternalContext().getRemoteUser().equals(login);
    }
    public void getTopElements(@Observes ChangeEvent changeEvent) {
        topElements = remoteGameService.getTopElements();
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/notify", new FacesMessage(topElements.toString()));
    }
}
