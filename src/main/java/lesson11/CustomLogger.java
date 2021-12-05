package lesson11;

import java.sql.Timestamp;
import java.util.Date;

public class CustomLogger
{
	private static final String BLUE = "\u001B[34m";
	private static final String YELLOW = "\u001B[33m";
	private static final String RED = "\u001B[31m";
	private static final String WHITE = "\u001B[37m";


	private void printInfo(String message, String color)
	{
		Date date = new Date();
		System.out.println(color);
		System.out.println(new Timestamp(date.getTime()));
		System.out.println(" " + message);
	}

	public void info(String message)
	{
		printInfo(message, WHITE);
	}

	public void debug(String message)
	{
		printInfo(message, BLUE);
	}

	public void warm(String message)
	{
		printInfo(message, YELLOW);
	}

	public void error(String message)
	{
		printInfo(message, RED);
	}

	public static void main(String[] args)
	{
		CustomLogger log = new CustomLogger();

		log.info("INFO");
		log.debug("DEBUG");
		log.warm("WARM");
		log.error("ERROR");
	}
}
