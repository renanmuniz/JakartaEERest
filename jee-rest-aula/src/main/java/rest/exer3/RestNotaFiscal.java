package rest.exer3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/notafiscal/{id:[0-9]*}")
public class RestNotaFiscal {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String processarNotaFiscal(@PathParam("id") Long id) {
		System.out.println("Processando nota fiscal n�" + id);
		return "Nota Fiscal n�" + id + " processada com sucesso.";
	}
}
