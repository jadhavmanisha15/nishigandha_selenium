package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Itest1 implements ITestListener
{
	
	public static ExtentTest test=null;

	@Override
	public void onTestStart(ITestResult result) 
	
	{
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, "Test Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	test.log(LogStatus.FAIL, "Test FAIL");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, "Test SKIP");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		if(test==null) 
		{
			System.out.println(context.getName());
			test=Isuite1.reports.startTest(context.getName(),"login");
		}		
	}

	@Override
	public void onFinish(ITestContext context) {
		if(test!=null) {
			Isuite1.reports.endTest(test);
			test=null;
		}
	}

}
