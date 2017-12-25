package mr.iscae.app_Chat.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mr.iscae.app_Chat.model.Message;
import mr.iscae.app_Chat.service.MessageService;

@Path("/messages")
@Produces("application/json")
public class MessageResource {
  MessageService messageservice = new MessageService();
	
  @GET 
	public List<Message> getmessage(){
	  return messageservice.getToutMessage();
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Message addtMasseges(Message message){
	  return messageservice.addMessage(message);
  }
  
  @PUT
  @Path("/{messageId}")
  @Consumes(MediaType.APPLICATION_JSON)
  public Message updateMasseges(@PathParam("messageId") long id,Message message){
	 message.setId(id);
	  return messageservice.updateMessage(message);
  }
 
  @DELETE
  @Path("/{messageId}")
  @Consumes(MediaType.APPLICATION_JSON)
  public Message deletMasseges(@PathParam("messageId") long id){	 
	  return messageservice.delateMessage(id);
  }
  
  @GET
  @Path("/{messageId}")
  public Message getMasseges(@PathParam("messageId") long id){
	  return messageservice.getMessage(id);
  }
	
}
