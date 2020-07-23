package rest.exer14;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/logar")
public class RestAutenticacao {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String logar() {
		return "Bem-Vindo ao Sistema";
	}

}
