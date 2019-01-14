package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static Properties readPropertiesFile(String filepath) throws IOException {
	File file = new File(filepath);
	Properties props = new Properties();
	FileInputStream in = new FileInputStream(file);
	props.load(in);
	
	return props;
	//read properties file

	}
	
	
	
	
	
	
	
	
	
	
	

}
