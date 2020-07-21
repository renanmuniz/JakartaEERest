package rest.exer4;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/venda")
public class RestVenda {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String vender(@QueryParam("nome")String nome,
						 @QueryParam("produto") String produto,
						 @QueryParam("tipo") @DefaultValue("pdf") String tipo) {
		System.out.println("Venda=" + nome);
		System.out.println("Produto=" + produto);
		System.out.println("Tipo=" + tipo);
		return "Nota Fiscal = " + nome + " - " + tipo;
	}

}
