package testpackage;

import java.io.FileReader;
import java.util.Properties;

/**
 * not use this class with spring environment
 * 
 * @author KHS
 * 
 */
public class ConfigUtil {
	
	private static ConfigUtil configUtil = new ConfigUtil();
	
	private static Properties prop;
	
	private String currentPath = this.getClass().getResource("/").getPath();
	
	private String filePath = currentPath + "config.properties";
	
	public ConfigUtil() {
		try {
			if(prop == null) {
				prop = new Properties();
			}
			
			prop.load(new FileReader(filePath));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static ConfigUtil getInsatance() {
		return configUtil;
	}
	
	public String get(String key) {
		return StringUtil.nullToEmpty(prop.get(key).toString());
	}
	
	public String get(String key, String replaceStr) {
		return StringUtil.nullToString(prop.get(key).toString(), replaceStr);
	}
	
}
