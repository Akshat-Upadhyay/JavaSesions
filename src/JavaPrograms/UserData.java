package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {

		
		//HashMap<String, String> usermap= new HashMap<String, String>();//As in ArrayList we gave generics, same thing
		                                          						// but in key and value pair format
		
				//OR
		
		
		Map<String, String> userMap= new HashMap<String, String>();//Top Casting
		
		
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Bangalore");
		
		
		System.out.println(userMap.get("id"));
		
		System.out.println(userMap.get(0));// it will give you value a Null because it doesnot store value in the form of index
		
		System.out.println(userMap.size());
		
		
		for(Map.Entry m: userMap.entrySet())
		{
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

}



//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>NOTES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// HashMap And Hash Table are two special collections available
// And, it stores data in the form of Key and value pair format


//1. HashMap
//It is a class which stores data in the form of Key and value generics.
// it has one parent interface-->Map

// it is order less. it does not maintain any order-->it stores in key and value pair format only
// hence we cannot use for loop

// so when ever we want ot print the value from HashMap, we use Entery SET