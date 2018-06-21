package paw.test;

import lombok.Getter;
import lombok.Setter;
import paw.entity.Element;
import remote.RemoteGameService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class CreateElementController {
    @Getter
    @Setter
    public Element element;

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

    public CreateElementController() {
        this.element = new Element();
    }

    public void loadElementType() {
        if(element.getElementType() != null) {
            element.setElementType(remoteGameService.getElementTypeById(element.getElementType().getId()));
            typeChosen = true;
        } else {
            typeChosen = false;
        }
    }

    @PostConstruct
    public void init() {
        if(id != null && id != 0) {
            element = remoteGameService.getElementById(id);
        }
    }

    public void saveElement() {
        remoteGameService.saveElement(element);
    }
}
