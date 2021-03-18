package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNgListener implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		System.out.println("******** Test Started :" + result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("******** Test is Started :" + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("******** Test is failed :" + result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("******** Test is skipped :" + result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onTStart(ITestContext context) {
		System.out.println("******** Test is onTStart :" + context.getName());

	}
	public void onTestFinish(ITestContext context) {
		System.out.println("******** Test is finiished :" + context.getName());
	}
}
