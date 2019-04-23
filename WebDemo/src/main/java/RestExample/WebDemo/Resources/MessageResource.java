package RestExample.WebDemo.Resources;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import RestExample.WebDemo.Model.Message;
import RestExample.WebDemo.Service.MessageService;;

@Path("messages")
public class MessageResource {

	
	MessageService messageService=new MessageService();
	@GET
	/* @Produces(MediaType.APPLICATION_JSON) */
	public List<Message> getMessage(@QueryParam("start") int start,@QueryParam("size") int size)
	{
		if(start>0 && size>0)
		{
			return messageService.getAllMessagesPaginated(start, size);
		}
		return messageService.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message postMessage( Message message)
	{
		return messageService.addMessage(message);
	}
	
	
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("id") int id,Message message)
	{
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("id") int id)
	{
		messageService.removeMessage(id);
	}
	
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message text(@PathParam("id") int id)
	{
		return messageService.getMessage(id);
	}
}
