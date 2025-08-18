package extra;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetDataFromJsonFile {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fr = new FileReader("C:\\Users\\User\\git\\ocmrs\\marriage-registration\\src\\test\\resources\\commondata.json");
		
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(fr);
		
		JSONObject jObj = (JSONObject) obj;
		
//		String value2 = (String) jObj.get("key2");
		String value2 = jObj.get("key2").toString();
		
		System.out.println(value2);
	}
}	
