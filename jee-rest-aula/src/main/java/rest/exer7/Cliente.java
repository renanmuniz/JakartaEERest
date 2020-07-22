package rest.exer7;

import java.math.BigDecimal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Cliente {
	
	
	public static void viaXML() {
		Pessoa renan = new Pessoa("Renan", 30, new BigDecimal(2095.0));
		Client cliente = ClientBuilder.newClient();
		WebTarget web = cliente.target("http://localhost:8080/telefonia/xml");
		Response resposta = web.request().post(Entity.xml(renan));
		if(resposta.getStatus() == 204) {
			System.out.println("Objeto pessoa enviado com sucesso via xml.");
		} else {
			System.out.println("Erro na respsota: " + resposta.toString());
		}
		resposta.close();
		cliente.close();
	}
	
	public static void viaJSON() {
		Pessoa renan = new Pessoa("Renan", 30, new BigDecimal(2095.0));
		Client cliente = ClientBuilder.newClient();
		WebTarget web = cliente.target("http://localhost:8080/telefonia/json");
		Response resposta = web.request().post(Entity.json(renan));
		if(resposta.getStatus() == 204) {
			System.out.println("Objeto pessoa enviado com sucesso via json.");
		} else {
			System.out.println("Erro na respsota: " + resposta.toString());
		}
		resposta.close();
		cliente.close();	
	}
	
	
	public static void main(String[] args) {
		viaXML();
		viaJSON();
	}

}
