package rest.exer16;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/telefones")
public class ListaTelefonica {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Telefone> processarCadastro() {
		List<Telefone> lista = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			lista.add(new Telefone("Nome " + i, "3325-" + i));
		}
		return lista;
	}
}
