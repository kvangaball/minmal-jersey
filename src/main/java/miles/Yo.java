package miles;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("yo")
public class Yo {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response yo(@QueryParam("dude") String dude) {

        Map<String, String> res = new HashMap<>();
        res.put("who", dude);

        return Response.ok(res).build();
    }
}
