package rest.ressources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("dashboard")
public class GestionCompteRessource {
	@GET
	@Produces(value = MediaType.TEXT_PLAIN)
	@Path("{numeroEtudiant}")
	public Response verifyExistance(@PathParam(value = "numeroEtudiant") int numeroEtudiant) {
		if (numeroEtudiant == 1) {
			return Response.status(200).entity("true").build();
		} else {
			return Response.status(Status.NO_CONTENT).build();
		}
	}
}
