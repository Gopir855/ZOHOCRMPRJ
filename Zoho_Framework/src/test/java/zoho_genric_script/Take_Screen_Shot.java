package zoho_genric_script;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import zoho_base.BaseTest;

public class Take_Screen_Shot extends BaseTest {
	 public static void capture_ScreenShot()
	 {
		try 
		{
			TakesScreenshot tss = (TakesScreenshot) driver;
			Date d = new Date();
			String s = d.toString().replace(":", "-");
			File src = tss.getScreenshotAs(OutputType.FILE);
			File dst = new File("./ScreenShot/"+s+".png");
			FileHandler.copy(src, dst);
			driver.quit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}
