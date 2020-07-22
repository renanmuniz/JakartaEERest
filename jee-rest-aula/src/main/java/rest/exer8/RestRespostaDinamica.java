package rest.exer8;

import java.math.BigDecimal;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/teste")
public class RestRespostaDinamica {
	
	@GET
	public Response teste(@QueryParam("numero") @DefaultValue("1") Integer numero) {
		if(numero == 1) {
			return Response.status(Status.FORBIDDEN).type(MediaType.TEXT_PLAIN).entity("N�o permitido").build();
		}
		Funcionario f = new Funcionario();
		f.setNome("Renan");
		f.setCpf(12345678901L);
		f.setSalario(new BigDecimal(2095.0));
		if(numero == 2) {
			return Response.ok().type(MediaType.APPLICATION_XML).entity(f).build();
		}
		if(numero == 3) {
			return Response.ok().type(MediaType.APPLICATION_JSON).entity(f).build();
		}
		return Response.ok().type(MediaType.TEXT_PLAIN).entity("C�digo n�o tratado").build();
	}
}
