package utilities.com.flipkart;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileReader {
	public String fileReader(String block, String userdata) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("testData.json");
		Object obj = jsonParser.parse(reader);
		JSONArray usersList = (JSONArray) obj;
		String userdata1 = null;
        for(int i=0;i<usersList.size();i++) {
        JSONObject users = (JSONObject) usersList.get(i);
        JSONObject user = (JSONObject) users.get(block);
        userdata1 = (String) user.get(userdata);
        }
		return userdata1;
	}
	
	public Collection fileReadValuseByBlock(String block) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("testData.json");
		Object obj = jsonParser.parse(reader);

		JSONArray usersList = (JSONArray) obj;
		Collection userdata1 = null;
        for(int i=0;i<usersList.size();i++) {
        JSONObject users = (JSONObject) usersList.get(i);
        JSONObject user = (JSONObject) users.get(block);
        return user.values();
        
        }
		return userdata1;
	}
	
	public static void main(String args[]) throws IOException, ParseException {
	JSONFileReader js1 = new JSONFileReader();
	System.out.println(js1.fileReadValuseByBlock("countries"));			
	}
}
