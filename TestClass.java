import java.io.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.logging.*;


public class TestClass	{
	public static void main(String[] args) throws IOException	{
		/*Ensure directory has been created  */
		new File("logs").mkdir();
		
		/*Get the date to be used in the filename  */
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
		LocalDateTime now = LocalDateTime.now();
		String date = now.format(df);
		
		/*Set up the filename in the logs directory*/
		String logFileName = "logs\\testlog-" + date + ".txt";
		
		/*Set up Logger  */
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.addHandler(myFileHandler);
		
		/* Log Message  */
		ocajLogger.info("\nThis is a logged information message. ");
		
		/* Close the file */
		myFileHandler.close();
		
	}


}
