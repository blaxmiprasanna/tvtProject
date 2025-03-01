package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseHelper {
	
	static String filePath = "C:\\Users\\blaxm\\workspace\\com.tvtProject\\src\\main\\config.properties";
	Properties property;
	
	public  Properties readPropertyFile(){
		
		try{
			FileInputStream fis = new FileInputStream(filePath);
			property = new Properties();
			property.load(fis);
		}catch(Exception e){
			e.printStackTrace();
		}
		return property;
	}

}
