package zoho_base;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import zoho_genric_script.Take_Screen_Shot;

public class BaseTest implements URL 
{
	public static WebDriver driver;
//before testNG annotation to launch the browser
	@BeforeMethod
	public void openApp() throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2); 
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
		driver.get(url);
		String Title = driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(Title);
		Assert.assertEquals(Title, "Zoho CRM | Top-rated Sales CRM Software by Customers");
		driver.findElement(By.className("zgh-login")).click();
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		Assert.assertEquals(Title1, "Zoho Accounts");

		driver.findElement(By.id("login_id")).sendKeys(UN);
		driver.findElement(By.id("nextbtn")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(PWD);
		driver.findElement(By.id("nextbtn")).click();
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		Assert.assertEquals(Title2, "Zoho Accounts");

		driver.findElement(By.xpath("//a[@id=\"Visible_Leads\"]")).click();
		String Title3 = driver.getTitle();
		System.out.println(Title3);
		Assert.assertEquals(Title3, "Home Page - Zoho CRM");	
	}

	@AfterMethod
	public void closeApp(ITestResult res)  
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Take_Screen_Shot.capture_ScreenShot();
			driver.quit();
		}
		driver.quit();
	}

}