package rest.ressources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("place")
public class GooglePlacesRessource {

	private static List<Place> places = new ArrayList<Place>();

	public Boolean checkKey(String key) {
		return key.equals("	");
	}

	public static List<Place> getPlaces() {
		return places;
	}

	public static void setPlaces(List<Place> places) {
		GooglePlacesRessource.places = places;
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response verifyExistance(Place place, @QueryParam(value = "key") String key) {
		if (checkKey(key)) {
			places.add(place);
			return Response.status(Status.CREATED).entity("Created").build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("Not Acceptable").build();
		}
	}

	@GET
	@Path("{latitude}/{aze}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response searchByLatLong(@PathParam(value = "latitude") String latitude,
			@PathParam(value = "aze") String aze, @QueryParam(value = "key") String key) {
		if (checkKey(key)) {
			return Response.status(Status.FOUND).entity(places.get(0)).build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("Not Acceptable").build();
		}
	}

	@GET
	@Path("{latitude}/{aze}")
	@Produces(value = MediaType.APPLICATION_XML)
	public Response searchByLatLongXML(@PathParam(value = "latitude") String latitude,
			@PathParam(value = "aze") String aze, @QueryParam(value = "key") String key) {
		if (checkKey(key)) {
			return Response.status(Status.FOUND).entity(places.get(0)).build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("Not Acceptable").build();
		}
	}

	public Response deletePlace(@QueryParam(value = "key") String key, @QueryParam(value = "lat") float lat,
			@QueryParam(value = "lon") float lon) {
		if (checkKey(key)) {
			return Response.status(Status.FOUND).entity(places.get(0)).build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("Not Acceptable").build();
		}
	}
}
