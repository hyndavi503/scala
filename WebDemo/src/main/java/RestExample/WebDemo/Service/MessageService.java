package RestExample.WebDemo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import RestExample.WebDemo.Database.Database;
import RestExample.WebDemo.Model.Message;

public class MessageService {

	
	public static Map<Integer,Message> messages=Database.getMessages();
	
	public MessageService()
	{
		messages.put(1, new Message(1, "Hi!", "Hyndavi"));
		messages.put(2, new Message(2, "Hello!", "Hyndavi"));
	}
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesPaginated(int start,int size)
	{
	ArrayList<Message> list=new ArrayList<Message>(messages.values());
	if(start+size>list.size())
	return new ArrayList<Message>();
	return list.subList(start, start+size);
	}
	public Message getMessage(int id)
	{
		return messages.get(id);
	}
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}

	
	public Message  updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	
	public Message removeMessage(int id)
	{
		return messages.remove(id);
	}
	
	
	
}
