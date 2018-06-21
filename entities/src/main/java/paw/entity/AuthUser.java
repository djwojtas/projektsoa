package paw.entity;

import lombok.*;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.*;
import java.io.Serializable;

@ToString(exclude = {"password"})
@EqualsAndHashCode(exclude = {"password"})//, "categories"})
@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="auth_users")
@FacesConverter(forClass = AuthUser.class)
@NamedQueries({
        @NamedQuery(name = "AuthUser.findAll",
                query = "SELECT u FROM AuthUser u")
})
public class AuthUser implements Converter, Serializable {

    @Id
    @Column(name="login")
    String login;

    @Column(name="passwd")
    String password;
//
//    @OneToMany(mappedBy = "authUser")
//    private List<Category> categories;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        AuthUser u = new AuthUser();
        u.setLogin(s);
        return u;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null) {
            return "";
        }
        return "" + ((AuthUser) o).getLogin();
    }
}
