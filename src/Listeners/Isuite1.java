package Listeners;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.google.common.collect.FluentIterable;
import com.relevantcodes.extentreports.ExtentReports;

public class Isuite1 implements ISuiteListener
{

public static ExtentReports reports=null;
	@Override
	public void onStart(ISuite suite) {
		reports=new ExtentReports(getReportName(), true);
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		if(reports!=null) 
		{
			reports.flush();
			reports.close();
			reports=null;
		}
		
		
	}
	
	public static String getReportName()
	{
		
		
		StringBuffer reportFilename=new StringBuffer("D:\\ExtentReports\\NewReport_");
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		String format=sdf.format(dt).replace("-", "_").replace(" ", "_").replace(":", "_");
		
		
		return reportFilename.append(format).append(".html").toString();
		
	}

}
