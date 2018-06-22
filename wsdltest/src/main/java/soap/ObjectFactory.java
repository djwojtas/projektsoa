
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateElement_QNAME = new QName("http://soap/", "updateElement");
    private final static QName _UpdateCategoryResponse_QNAME = new QName("http://soap/", "updateCategoryResponse");
    private final static QName _AddNewElementTypeResponse_QNAME = new QName("http://soap/", "addNewElementTypeResponse");
    private final static QName _AddNewElementType_QNAME = new QName("http://soap/", "addNewElementType");
    private final static QName _UpdateElementResponse_QNAME = new QName("http://soap/", "updateElementResponse");
    private final static QName _AddNewCategoryTypeResponse_QNAME = new QName("http://soap/", "addNewCategoryTypeResponse");
    private final static QName _UpdateCategory_QNAME = new QName("http://soap/", "updateCategory");
    private final static QName _AddNewCategoryType_QNAME = new QName("http://soap/", "addNewCategoryType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateElementResponse }
     * 
     */
    public UpdateElementResponse createUpdateElementResponse() {
        return new UpdateElementResponse();
    }

    /**
     * Create an instance of {@link AddNewCategoryType }
     * 
     */
    public AddNewCategoryType createAddNewCategoryType() {
        return new AddNewCategoryType();
    }

    /**
     * Create an instance of {@link AddNewCategoryTypeResponse }
     * 
     */
    public AddNewCategoryTypeResponse createAddNewCategoryTypeResponse() {
        return new AddNewCategoryTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateCategory }
     * 
     */
    public UpdateCategory createUpdateCategory() {
        return new UpdateCategory();
    }

    /**
     * Create an instance of {@link UpdateCategoryResponse }
     * 
     */
    public UpdateCategoryResponse createUpdateCategoryResponse() {
        return new UpdateCategoryResponse();
    }

    /**
     * Create an instance of {@link UpdateElement }
     * 
     */
    public UpdateElement createUpdateElement() {
        return new UpdateElement();
    }

    /**
     * Create an instance of {@link AddNewElementType }
     * 
     */
    public AddNewElementType createAddNewElementType() {
        return new AddNewElementType();
    }

    /**
     * Create an instance of {@link AddNewElementTypeResponse }
     * 
     */
    public AddNewElementTypeResponse createAddNewElementTypeResponse() {
        return new AddNewElementTypeResponse();
    }

    /**
     * Create an instance of {@link AuthUser }
     * 
     */
    public AuthUser createAuthUser() {
        return new AuthUser();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateElement")
    public JAXBElement<UpdateElement> createUpdateElement(UpdateElement value) {
        return new JAXBElement<UpdateElement>(_UpdateElement_QNAME, UpdateElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateCategoryResponse")
    public JAXBElement<UpdateCategoryResponse> createUpdateCategoryResponse(UpdateCategoryResponse value) {
        return new JAXBElement<UpdateCategoryResponse>(_UpdateCategoryResponse_QNAME, UpdateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewElementTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addNewElementTypeResponse")
    public JAXBElement<AddNewElementTypeResponse> createAddNewElementTypeResponse(AddNewElementTypeResponse value) {
        return new JAXBElement<AddNewElementTypeResponse>(_AddNewElementTypeResponse_QNAME, AddNewElementTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addNewElementType")
    public JAXBElement<AddNewElementType> createAddNewElementType(AddNewElementType value) {
        return new JAXBElement<AddNewElementType>(_AddNewElementType_QNAME, AddNewElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateElementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateElementResponse")
    public JAXBElement<UpdateElementResponse> createUpdateElementResponse(UpdateElementResponse value) {
        return new JAXBElement<UpdateElementResponse>(_UpdateElementResponse_QNAME, UpdateElementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewCategoryTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addNewCategoryTypeResponse")
    public JAXBElement<AddNewCategoryTypeResponse> createAddNewCategoryTypeResponse(AddNewCategoryTypeResponse value) {
        return new JAXBElement<AddNewCategoryTypeResponse>(_AddNewCategoryTypeResponse_QNAME, AddNewCategoryTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateCategory")
    public JAXBElement<UpdateCategory> createUpdateCategory(UpdateCategory value) {
        return new JAXBElement<UpdateCategory>(_UpdateCategory_QNAME, UpdateCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addNewCategoryType")
    public JAXBElement<AddNewCategoryType> createAddNewCategoryType(AddNewCategoryType value) {
        return new JAXBElement<AddNewCategoryType>(_AddNewCategoryType_QNAME, AddNewCategoryType.class, null, value);
    }

}
