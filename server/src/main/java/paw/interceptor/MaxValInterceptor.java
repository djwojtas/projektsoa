package paw.interceptor;

import paw.dao.ElementDAO;
import paw.entity.Element;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.Optional;

public class MaxValInterceptor {
    @Inject
    private ElementDAO elementDAO;

    @AroundInvoke
    public Object interceptorMethod(InvocationContext ictx) throws Exception{
        Element element = (Element) ictx.getParameters()[0];
        Optional<Element> topElement = elementDAO.getTopElements().stream()
                .filter(e -> e.getElementType().getId() == element.getElementType().getId())
                .findFirst();
        if (element.getId() == null && topElement.isPresent() && element.getLongParam3()> topElement.get().getLongParam3()) {
            element.setLongParam3(topElement.get().getLongParam3());
        }
        ictx.proceed();
        return element;
    }
}
