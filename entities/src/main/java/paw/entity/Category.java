package paw.entity;

import lombok.*;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="categories")
@ToString(exclude = {"authUser"})
@EqualsAndHashCode(exclude = {"parameter", "categoryType", "authUser", "elements"})
@FacesConverter(forClass = Category.class)
@NamedQueries({
        @NamedQuery(name="Category.findAll",
                query="SELECT c FROM Category c"),
        @NamedQuery(name="Category.findById",
                query="SELECT c FROM Category c where c.id = :id"),
        @NamedQuery(name="Category.findByLogin",
                query="SELECT c FROM Category c join c.authUser a where a.login = :login"),
        @NamedQuery(name="Category.findByType",
                query="SELECT c FROM Category c join c.categoryType t where t = :categoryType")
})
public class Category implements Converter, Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "parameter")
    private Long parameter;

    @ManyToOne
    @JoinColumn(name = "categoryType", referencedColumnName = "id")
    private CategoryType categoryType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authUser", referencedColumnName = "login")
    private AuthUser authUser;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Element> elements;

    public void setParameter(Long parameter) {
        this.parameter = parameter;
    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        Category c = new Category();
        c.setId(Long.parseLong(s));
        return c;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null) {
            return "";
        }
        return "" + ((Category) o).getId();
    }
}
