package logging;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConstructionLogging {
	private static final Logger LOGGER= Logger.getLogger(Logging.class.getName());
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.log(Level.INFO,"enter n");
		LOGGER.log(Level.INFO,"enter area");
		String n=sc.next();
		int area=sc.nextInt();
		if(n.equals("standardmaterial"))
		{
			LOGGER.log(Level.INFO,"constructioncost:"+(area*1200));
		}
		else if(n.equals("abovestandardmaterial"))
		{
			LOGGER.log(Level.INFO,"constructioncost:"+(area*1500));
			
		}
		else if(n.equals("highstandardmaterial"))
		{
			LOGGER.log(Level.INFO,"constructioncost:"+area*1800);
		}
		else if(n.equals("highandfullyautomated"))
		{
			LOGGER.log(Level.INFO,"constructioncost:"+area*2500);
		}
		
		
	}

}
