package mate.academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class ConfigController {

public static void writeConfig (Config config) {
		
		XStream xs = new XStream(new StaxDriver());
		try {
			xs.toXML(config, new FileOutputStream("config.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Config readConfig() {
		XStream xs = new XStream(new DomDriver());
		Config tempConfig = new Config();
		try {
			xs.fromXML(new FileInputStream("config.xml"), tempConfig);
			System.out.println(tempConfig);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return tempConfig;
		
	}

	
}
