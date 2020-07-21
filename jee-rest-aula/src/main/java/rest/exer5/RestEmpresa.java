package rest.exer5;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/funcionario/")
public class RestEmpresa {
	
	private Funcionario criar() {
		Funcionario contato = new Funcionario();
		contato.setNome("Renan");
		contato.setCpf(123456789L);
		contato.setSalario(new BigDecimal("2095.00"));
		return contato;
	}
	
	@Path("/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Funcionario servicoXml() {
		System.out.println("Criando bojeto java xml");
		Funcionario contato = criar();
		return contato;
	}
	
	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Funcionario servicoJson() {
		System.out.println("Criando bojeto java json");
		Funcionario contato = criar();
		return contato;
	}

}
