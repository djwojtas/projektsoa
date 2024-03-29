
package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapService", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateElement", targetNamespace = "http://soap/", className = "soap.UpdateElement")
    @ResponseWrapper(localName = "updateElementResponse", targetNamespace = "http://soap/", className = "soap.UpdateElementResponse")
    public void updateElement(
        @WebParam(name = "arg0", targetNamespace = "")
        Element arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateCategory", targetNamespace = "http://soap/", className = "soap.UpdateCategory")
    @ResponseWrapper(localName = "updateCategoryResponse", targetNamespace = "http://soap/", className = "soap.UpdateCategoryResponse")
    public void updateCategory(
        @WebParam(name = "arg0", targetNamespace = "")
        Category arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addNewCategoryType", targetNamespace = "http://soap/", className = "soap.AddNewCategoryType")
    @ResponseWrapper(localName = "addNewCategoryTypeResponse", targetNamespace = "http://soap/", className = "soap.AddNewCategoryTypeResponse")
    public void addNewCategoryType(
        @WebParam(name = "arg0", targetNamespace = "")
        CategoryType arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addNewElementType", targetNamespace = "http://soap/", className = "soap.AddNewElementType")
    @ResponseWrapper(localName = "addNewElementTypeResponse", targetNamespace = "http://soap/", className = "soap.AddNewElementTypeResponse")
    public void addNewElementType(
        @WebParam(name = "arg0", targetNamespace = "")
        ElementType arg0);

}
