package soap;

import paw.entity.Category;
import paw.entity.CategoryType;
import paw.entity.Element;
import paw.entity.ElementType;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SoapService {

    @WebMethod
    void addNewCategoryType(CategoryType categoryType);

    @WebMethod
    void addNewElementType(ElementType elementType);

    @WebMethod
    void updateElement(Element element);

    @WebMethod
    void updateCategory(Category category);
}