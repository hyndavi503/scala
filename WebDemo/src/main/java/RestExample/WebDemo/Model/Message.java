package RestExample.WebDemo.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message 

{

	private int id;
	private String sender;
	private String receiver;
	
public Message()
{
	
}
	public Message(int id, String sender, String receiver) {
		super();
		this.id = id;
		this.sender = sender;
		
		this.receiver = receiver;
	}
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
	
	
}
