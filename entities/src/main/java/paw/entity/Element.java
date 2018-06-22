package paw.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="elements")
@ToString(exclude = {"category"})
@EqualsAndHashCode(exclude = {"stringParam", "longParam1", "longParam2", "longParam3", "category", "elementType"})
@FacesConverter(forClass = Element.class)
@NamedQueries({
        @NamedQuery(name="Element.findAll",
                query="SELECT e FROM Element e"),
        @NamedQuery(name="Element.findById",
                query="SELECT e FROM Element e where e.id = :id"),
        @NamedQuery(name="Element.findByCategory",
                query="SELECT e FROM Element e where e.category = :category"),
        @NamedQuery(name="Element.findByLogin",
                query="SELECT e FROM Element e join e.category c join c.authUser a where a.login = :login")
})
public class Element implements Converter, Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String stringParam;

    @Column(name = "longParam1")
    private Long longParam1;

    @Column(name = "longParam2")
    private Long longParam2;

    @Column(name = "longParam3")
    private Long longParam3;

    @ManyToOne
    @JoinColumn(name = "elementType", referencedColumnName = "id")
    private ElementType elementType;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

//    @Inject
//    @Transient
//    private ElementDAO elementDAO;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        Element e = new Element();
        e.setId(Long.parseLong(s));
        return e;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null) {
            return "";
        }
        return "" + ((Element) o).getId();
    }
}
