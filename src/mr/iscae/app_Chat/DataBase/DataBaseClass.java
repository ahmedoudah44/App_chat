package mr.iscae.app_Chat.DataBase;

import java.util.HashMap;
import java.util.Map;

import mr.iscae.app_Chat.model.*;






public class DataBaseClass {

	private static Map<Long, Message> messages= new HashMap<>();
	private static Map<String, Profile> profiles= new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile>  getProfile(){
		
		return profiles;
	}
}
