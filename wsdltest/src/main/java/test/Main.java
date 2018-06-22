package test;

import soap.*;

public class Main {
    public static void main(String[] args) {
        SoapService service = new SoapServiceImplService().getSoapServiceImplPort();

        CategoryType categoryType = new CategoryType();
        categoryType.setCategoryName("cave");
        categoryType.setParamName("area");

        service.addNewCategoryType(categoryType);

        ElementType elementType = new ElementType();
        elementType.setStringParamName("dragon");
        elementType.setLongParamName1("gold");
        elementType.setLongParamName2("color");
        elementType.setLongParamName3("power");

        service.addNewElementType(elementType);


        Category category = new Category();
        category.setId(35L);

        AuthUser a = new AuthUser();
        a.setLogin("a");

        categoryType.setId(3L);

        category.setAuthUser(a);
        category.setCategoryType(categoryType);
        category.setParameter(12345L);

        service.updateCategory(category);
    }
}
