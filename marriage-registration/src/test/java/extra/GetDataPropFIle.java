package extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataPropFIle {
	public static void main(String[] args) throws IOException {
		
//		step 1 -> get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		
//		step 2 -> Create the object of Properties class of java and load the keys
		Properties pObj = new Properties();
		pObj.load(fis);
		
//		step - 3 -> get the value by using getProperty()
		String BROWSER = pObj.getProperty("bro");
		String URL = pObj.getProperty("url");
		String USER_NAME = pObj.getProperty("us_un");
		String USER_PASSWORD = pObj.getProperty("us_pwd");
		String ADMIN_NAME = pObj.getProperty("admin_un");
		String ADMIN_PASSWORD = pObj.getProperty("admin_pwd");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USER_NAME);
		System.out.println(USER_PASSWORD);
		System.out.println(ADMIN_NAME);
		System.out.println(ADMIN_PASSWORD);
	}
}
