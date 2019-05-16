package rest.ressources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import webservices.Don;

@Path("dons")
public class GestionDonRessource {

	private static List<Don> listeDons = new ArrayList<Don>();

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

	@POST
	@Consumes(value = MediaType.APPLICATION_XML)
	public Response verifyExistance(Don don) {
		if (listeDons.add(don)) {
			return Response.status(Status.CREATED).entity("Le don a été ajouté").build();
		}
		return Response.status(Status.NOT_FOUND).entity("Aucun don").build();

	}

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response search(@QueryParam(value = "donateur") String donateur, @QueryParam(value = "poids") int poids) {

		for (Don d : listeDons) {
			if (d.getDonateur().equals(donateur) && poids == d.getPoids()) {
				return Response.status(Status.FOUND).entity(d).build();

			}
		}

		return Response.status(Status.NOT_FOUND).entity("Not FOUND").build();

	}

	@PUT
	@Path("{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response update(@PathParam(value = "id") int id, Don don) {

		for (Don d : listeDons) {
			if (d.getId() == id) {
				d = don;
				return Response.status(Status.OK).entity("L'etat du don a ete modifie avec succes").build();
			}
		}

		return Response.status(Status.NOT_FOUND).entity("Not FOUND").build();

	}

}
