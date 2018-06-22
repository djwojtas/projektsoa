package soap;

import paw.entity.Category;
import paw.entity.CategoryType;
import paw.entity.Element;
import paw.entity.ElementType;
import remote.RemoteGameService;

import javax.ejb.EJB;
import javax.jws.WebService;

@WebService
public class SoapServiceImpl implements SoapService {

    @EJB(mappedName = "java:global/server/GameService!remote.RemoteGameService")
    private RemoteGameService remoteGameService;

    public void addNewCategoryType(CategoryType categoryType) {
        remoteGameService.addCategoryType(categoryType);
    }

    public void addNewElementType(ElementType elementType) {
        remoteGameService.addElementType(elementType);
    }

    public void updateElement(Element element) {
        remoteGameService.saveElement(element);
    }

    public void updateCategory(Category category) {
        remoteGameService.saveCategory(category);
    }
}
