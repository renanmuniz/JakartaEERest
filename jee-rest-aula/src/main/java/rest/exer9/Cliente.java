package rest.exer9;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class Cliente {

	private static WebTarget criar() {
		Client client = ClientBuilder.newClient();
		WebTarget web = client.target("http://localhost:8080/titulos");
		return web;
	}
	
	
	public static void listar() {
		WebTarget web = criar().path("/listar");
		Response resposta = web.request().get();
		System.out.println(resposta.getStatus());
		List<Titulo> titulos = resposta.readEntity(new GenericType<List<Titulo>>(){});
		for(Titulo titulo : titulos) {
			System.out.println(titulo.getSacado() + " - " + titulo.getValor());
		}
	}
	
	
	public static void main(String[] args) {
		listar();

	}

}
