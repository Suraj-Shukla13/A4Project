package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
this class is property class with generic function
@author Suraj shukla
@version1.4


*/
public class PropertiesUtil {
/*
 * This is generic method to read the data from the properties
 */
	public String getDataFromProperties(String Data) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\SeleniumFolder/A4CommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(Data);
		return value;
	}
}
