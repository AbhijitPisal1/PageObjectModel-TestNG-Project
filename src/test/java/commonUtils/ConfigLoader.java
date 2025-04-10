package commonUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	Properties prop;
//	public void GetVariables() throws IOException {
//		prop = new Properties();
//		String path = System.getProperty("user.dir") + "//src//test//resources//configFiles//config.properties";
//		FileInputStream fileIn = new FileInputStream(path);
//		prop.load(fileIn);
//	}
	
	public String URLValue() {
		String strURL= prop.getProperty("baseUrl");
		return strURL;
	}
	
	public String User() {
		String strUser= prop.getProperty("username");
		return strUser;
	}
	
	public String Pass() {
		String strPass= prop.getProperty("password");
		return strPass;
	}

}
