package paw.test;

import lombok.Getter;
import lombok.Setter;
import paw.entity.AuthUser;
import paw.entity.Category;
import remote.RemoteGameService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean
public class CreateCategoryController {
    @Getter
    @Setter
    public Category category;

    @EJB(mappedName = "java:global/server/GameService!remote.RemoteGameService")
    private RemoteGameService remoteGameService;

    private boolean typeChosen = true;

    public boolean isTypeChosen() {
        return typeChosen;
    }

    @Getter
    @Setter
    @ManagedProperty("#{param.id}")
    private Long id;

    public CreateCategoryController() {
        this.category = new Category();
    }

    public void loadCategoryType() {
        if(category.getCategoryType() != null) {
            category.setCategoryType(remoteGameService.getCategoryTypeById(category.getCategoryType().getId()));
            typeChosen = true;
        } else {
            typeChosen = false;
        }
    }

    @PostConstruct
    public void init() {
        if(id != null && id != 0) {
            category = remoteGameService.getCategoryById(id);
        }
    }

    public void saveCategory() {
        category.setAuthUser(remoteGameService.getAuthUserByLogin(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser()));
        remoteGameService.saveCategory(category);
    }
}
