package first;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.Test;

public class currentDate {
	
	@Test
	public void m1() throws ParseException
	{
		SimpleDateFormat month_date = new SimpleDateFormat("MMM yyyy", Locale.ENGLISH);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String actualDate =currentDate.today();

		Date date = sdf.parse(actualDate);

		String month_name = month_date.format(date);
		System.out.println("Month :" + month_name);
	}
	
	
	public static String today()
    {
	 // Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(date1);
         return date1;
	     }

}
