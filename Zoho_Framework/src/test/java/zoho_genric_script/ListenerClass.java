package zoho_genric_script;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import zoho_base.BaseTest;

public class ListenerClass extends BaseTest implements ITestListener
{
	@Test
	public void onTestFailure(ITestResult res)
	{
		System.out.println("test case failed");
		Take_Screen_Shot.capture_ScreenShot();
	}
}
