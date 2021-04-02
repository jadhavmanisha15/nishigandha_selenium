package Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;

public class IMethod1 implements IInvokedMethodListener
{
	public static ExtentTest test=null;

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if(test==null) 
		{
			System.out.println(method.getTestMethod().getMethodName());
			test=Isuite1.reports.startTest(method.getTestMethod().getMethodName(),"login");
		}	
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		if(test!=null) {
			Isuite1.reports.endTest(test);
			test=null;
		}
	}

}
