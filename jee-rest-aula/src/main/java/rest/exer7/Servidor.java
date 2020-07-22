package rest.exer7;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

	public static void main(String[] args) {
		try {
			URI uri = UriBuilder.fromUri("http://localhost").port(8080).build();
			ResourceConfig config = new ResourceConfig();
			config.packages("rest.exer7");
			HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
			System.out.println("Servidor de teste no ar..." + server);
		} catch (Exception e) {
			System.out.println("Erro na execu��o do servidor jse - " + e.getMessage());
			e.printStackTrace();
		}
	}
}
