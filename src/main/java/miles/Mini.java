package miles;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Mini {

    public static void main(String[] args) throws Exception {
        ResourceConfig config = new ResourceConfig().register(Yo.class);

        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9999).build();

        JdkHttpServerFactory.createHttpServer(baseUri, config, true);
        System.out.println("Startet på port 9999");
    }
}
