package genericUtilityOrLib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/*
 * this is a generic method for Calender
 * @parameter pattern
 * @return
 */

public class javaUtility {
	public String calenderHandling(String pattern)
	{
		Calendar cal=Calendar.getInstance();
		Date d= cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		String date= sdf.format(d);
		return date;
				
	}
	
	/*
	 * this is a generic method to avoid duplicates
	 * @parameter range
	 * @return
	 */
	
	public int getRandomNumber(int range)
	{
		Random r= new Random();
		int num=r.nextInt(range);
		return num;
	}

}
