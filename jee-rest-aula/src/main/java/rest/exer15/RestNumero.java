package rest.exer15;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/numerorandomico")
public class RestNumero {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String processarNumero() {
		Random numero = new Random();
		return "Numero = " + numero.nextInt(100000);
	}

}
