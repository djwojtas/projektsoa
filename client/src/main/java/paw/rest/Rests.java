package paw.rest;

import paw.entity.Category;
import paw.entity.CategoryType;
import paw.entity.Element;
import remote.RemoteGameService;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

@Path("/gamedb")
public class Rests {
    @EJB(mappedName = "java:global/server/GameService!remote.RemoteGameService")
    private RemoteGameService remoteGameService;

    @Path("{categoryId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategories(@Context HttpServletRequest request, @PathParam("categoryId") Long id, final @Context SecurityContext securityContext){
        List<Category> categories = remoteGameService.getCategoryByType(remoteGameService.getCategoryTypeById(id));
        GenericEntity<List<Category>> entity = new GenericEntity<List<Category>>(categories){};
        return categories.isEmpty() ? Response.status(403).build() : Response.status(200).entity(entity).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategoryTypes(){
        List<CategoryType> types = remoteGameService.getCategoryTypes();
        GenericEntity<List<CategoryType>> entity = new GenericEntity<List<CategoryType>>(types){};
        return Response.ok().entity(entity).build();
    }

    @POST
    @Path("/add/{elementType}/{categoryId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createElement(@PathParam("elementType") Long elementType, @PathParam("categoryId") Long categoryId, Element element){
        element.setCategory(remoteGameService.getCategoryById(categoryId));
        element.setElementType(remoteGameService.getElementTypeById(elementType));
        remoteGameService.saveElement(element);
        return Response.status(200).build();
    }
}
