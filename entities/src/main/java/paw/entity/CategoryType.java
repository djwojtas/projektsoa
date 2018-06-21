package paw.entity;

import lombok.*;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="categoryTypes")
@ToString
@EqualsAndHashCode(exclude = {"paramName", "categoryName"})
@FacesConverter(forClass = CategoryType.class)
@NamedQueries({
        @NamedQuery(name="CategoryType.findAll",
                query="SELECT ct FROM CategoryType ct"),
        @NamedQuery(name="CategoryType.findById",
                query="SELECT ct FROM CategoryType ct where ct.id = :id")
})
public class CategoryType implements Converter, Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "categoryName")
    String categoryName;

    @Column(name = "paramName")
    String paramName;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        CategoryType t = new CategoryType();
        t.setId(Long.parseLong(s));
        return t;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null) {
            return "";
        }
        return "" + ((CategoryType) o).getId();
    }
}
