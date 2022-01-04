package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config {
static private Properties config;
//1kez calýsacagý ýcýn statýc blogu ýcýnde yazarýz
static {
	String path="./src/test/resources/test_Data/configuration.properties";
	
try {
	FileInputStream input=new FileInputStream(path);
	config=new Properties();
	config.load(input);
	input.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 


}
public static String getProperties(String key) {
	return config.getProperty(key);
}
}
