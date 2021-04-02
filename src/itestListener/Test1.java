package itestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("OnTeststart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Successs");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Skip");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On TestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}

}
