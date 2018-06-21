package paw.test;

import lombok.Getter;
import lombok.Setter;
import paw.entity.AuthUser;
import paw.entity.Role;
import remote.RemoteGameService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@Getter
@Setter
@ManagedBean
public class CreateUserController {
    private String login;
    private String role;
    private String password;

    @EJB(mappedName = "java:global/server/GameService!remote.RemoteGameService")
    private RemoteGameService remoteGameService;

    public void addUser() {
        remoteGameService.addUser(
                new AuthUser(login, password),
                new Role(login, role));
    }
}
