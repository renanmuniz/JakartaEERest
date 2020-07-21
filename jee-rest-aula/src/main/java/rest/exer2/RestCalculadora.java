package rest.exer2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculadora")
public class RestCalculadora {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String somar(@QueryParam("v1") Integer v1,@QueryParam("v2") Integer v2) {
		return "Soma de " + v1 + " + " + v2 + " = " + (v1+v2);
	}

}
