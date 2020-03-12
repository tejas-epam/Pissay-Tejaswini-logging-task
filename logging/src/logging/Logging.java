package logging;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
	private static final Logger LOGGER= Logger.getLogger(Logging.class.getName());
	public static void main(String[] args) throws SecurityException,IOException
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.log(Level.WARNING,"enter sp sr st");
		LOGGER.log(Level.WARNING,"enter cp cr ct");
		double sp=sc.nextDouble();
		double sr=sc.nextDouble();
		double st =sc.nextDouble();
		double cp=sc.nextDouble();
		double cr=sc.nextDouble();
		double ct=sc.nextDouble();
		double si,ci;
		si=(sp*sr*st)/100;
		ci=cp*Math.pow((1+cr/100),ct);
		LOGGER.log(Level.INFO,"The simple interest is:"+si);
		LOGGER.log(Level.INFO,"\n");
		LOGGER.log(Level.INFO,"The compound interest is:"+ci);
		
	}

}
