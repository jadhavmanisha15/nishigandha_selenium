package ExtendReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Extends1 {
	
	public static ExtentReports reportfile=null;
	public static ExtentTest test=null ;



	public static void extend1()
	{
	if(reportfile==null) {
		
	
	reportfile = new ExtentReports(getReportName(), true);
	}
	}
	
	
	

	public static void addtest(String TestName, String description)
	{
	if(test == null) {
	test = reportfile.startTest(TestName, description);
	       }
	}
	
	
	

	public static void endtest()
	{
	if(test != null)
	{
	reportfile.endTest(test);
	test= null;
	}
	}


	public static void endReort()
	{
	if(reportfile != null)
	{


	reportfile.flush();
	reportfile.close();
	reportfile = null;
	}
	}
	public static String getReportName()
	{
		
		
		StringBuffer reportFilename=new StringBuffer("D:\\ExtentReports\\report2222222_");
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		String format=sdf.format(dt).replace("-", "_").replace(" ", "_").replace(":", "_");
		
		
		return reportFilename.append(format).append(".html").toString();
		
	}


}
