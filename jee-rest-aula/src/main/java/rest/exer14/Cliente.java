package rest.exer14;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Cliente {

	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();
		cliente.register(FiltroCliente.class);
		WebTarget web = cliente.target("http://localhost:8080/logar");
		Response resposta = web.request().get();
		if(resposta.getStatus() == 200) {
			String mensagem = resposta.readEntity(String.class);
			System.out.println(mensagem);
		} else {
			System.out.println(resposta.toString());
		}
		resposta.close();
		cliente.close();
	}

}
