package rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("demoadmin")
@RolesAllowed("Admin")
public class Admin {
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String getSomething(){
    return "{\"message\" : \"This message was delivered via a REST call accesible by only authenticated ADMINS\"}"; 
  }
 
}
