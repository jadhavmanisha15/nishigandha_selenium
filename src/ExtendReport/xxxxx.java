package ExtendReport;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class xxxxx implements IReporter{

	
	
	
	private static final String TestName = null;
	public static ExtentReports reportfile=null;
	public static ExtentTest test=null ;

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {


		reportfile = new ExtentReports("D:\\ExtentReports\\Nrew.html", true);
		
		String description = null;
		test = reportfile.startTest(TestName, description);
		 //Iterate over every suite assigned for execution
	      for (ISuite suite : suites) {
	            
	         String suiteName = suite.getName();
	         Map<String, ISuiteResult> suiteResults = suite.getResults();
	         for (ISuiteResult sr : suiteResults.values()) {
	            ITestContext tc = sr.getTestContext();
	            System.out.println("Passed tests for suite '" + suiteName +
	               "' is:" + tc.getPassedTests().getAllResults().size());
	            System.out.println("Failed tests for suite '" + suiteName +
	               "' is:" + tc.getFailedTests().getAllResults().size());
	            System.out.println("Skipped tests for suite '" + suiteName +
	               "' is:" + tc.getSkippedTests().getAllResults().size());
	         }
	      }
	}

}
