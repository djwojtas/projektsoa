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
@Table(name="elementTypes")
@ToString
@EqualsAndHashCode(exclude = {"elementName", "stringParamName", "longParamName1", "longParamName2", "longParamName3"})
@FacesConverter(forClass = ElementType.class)
@NamedQueries({
        @NamedQuery(name="ElementType.findAll",
                query="SELECT et FROM ElementType et"),
        @NamedQuery(name="ElementType.findById",
                query="SELECT et FROM ElementType et where et.id = :id")
})
public class ElementType implements Converter, Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "elementName")
    String elementName;

    @Column(name = "stringParamName")
    String stringParamName;

    @Column(name = "longParamName1")
    String longParamName1;

    @Column(name = "longParamName2")
    String longParamName2;

    @Column(name = "longParamName3")
    String longParamName3;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        ElementType e = new ElementType();
        e.setId(Long.parseLong(s));
        return e;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o == null) {
            return "";
        }
        return "" + ((ElementType) o).getId();
    }
}
