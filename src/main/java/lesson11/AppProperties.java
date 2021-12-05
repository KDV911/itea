package lesson11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppProperties
{
	private static Properties properties;
	private AppProperties() {}

	private static void loadProperties()
	{
		properties = new Properties();
		try
		{
			properties.load(new FileReader("src/main/resources/app.properties"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static String getProperty(String property)
	{
		if(properties == null)
		{
			loadProperties();
		}

		return properties.getProperty(property);
	}
}
