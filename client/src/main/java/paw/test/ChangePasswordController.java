package paw.test;

import lombok.Getter;
import lombok.Setter;
import paw.entity.AuthUser;
import paw.entity.Role;
import remote.RemoteGameService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ManagedBean
public class ChangePasswordController {
    @EJB(mappedName = "java:global/server/GameService!remote.RemoteGameService")
    private RemoteGameService remoteGameService;
    private String newPassword;

    public List<AuthUser> getUserList() {
        if(FacesContext.getCurrentInstance().getExternalContext().isUserInRole("Manager")) {
            return remoteGameService.getUserList();
        } else {
            List<AuthUser> list = new ArrayList<>();
            list.add(remoteGameService.getAuthUserByLogin(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser()));
            return list;
        }
    }

    public void changePassword(AuthUser authUser) {
        authUser.setPassword(newPassword);
        remoteGameService.updateUser(authUser);
    }
}
