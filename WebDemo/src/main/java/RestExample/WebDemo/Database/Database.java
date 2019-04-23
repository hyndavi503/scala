package RestExample.WebDemo.Database;

import java.util.HashMap;
import java.util.Map;

import RestExample.WebDemo.Model.Message;
import RestExample.WebDemo.Model.Profile;

public class Database
{
 private static Map<Integer, Message> message=new HashMap<>();
 private static Map<Integer, Profile> profile=new HashMap<>();
 
 public static Map<Integer, Message> getMessages()
 {
	 return message;
 }
 
 public static Map<Integer, Profile> getProfiles()
 {
	 return profile;
 }
 
}
