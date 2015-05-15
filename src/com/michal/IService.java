package com.michal;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/logowanie")
@Produces("application/json")
public interface IService {

	@GET
	@Path("/{login}/{haslo}")
	public Uzytkownik getLogin(@PathParam("login") String login,
			@PathParam("haslo") String haslo);

	@GET
	@Path("/zalogowano/{zeton}")
	public String wypiszCos(@PathParam("zeton") UUID zeton);

	

}