package bs_listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class MyTestListner implements ITestListener{ 
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("My test case passed... Name of test case: "+ result.getName());
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("My test case failed... Name of test case: "+ result.getName());
	}
	
	

	
}



