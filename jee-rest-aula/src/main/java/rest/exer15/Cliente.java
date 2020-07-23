package rest.exer15;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Cliente {

	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();
		cliente.register(FiltroNumero.class);		
		WebTarget web = cliente.target("http://localhost:8080/numerorandomico");
		Response resposta = web.request().get();
		if(resposta.getStatus() == 200) {
			String mensagem = resposta.readEntity(String.class);
			System.out.println(mensagem);
		} else {
			System.out.println("Erro na resposta: " + resposta);
			System.out.println("          status: " + resposta.getStatus());
		}
		resposta.close();
		cliente.close();
	}

}
