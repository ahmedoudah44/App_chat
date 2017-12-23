package mr.iscae.app_Chat.DataBase;

import java.util.HashMap;
import java.util.Map;

import mr.iscae.app_Chat.model.*;
import sun.rmi.runtime.Log;





public class DataBaseClass {

	private static Map<Log, Message> messages= new HashMap<>();
	private static Map<Log, Profile> profiles= new HashMap<>();
	
	public static Map<Log, Message> getMessages(){
		return messages;
	}
	
	public static Map<Log, Profile>  getProfile(){
		
		return profiles;
	}
}
