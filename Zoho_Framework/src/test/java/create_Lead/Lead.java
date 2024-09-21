package create_Lead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import zoho_base.BaseTest;

@Listeners(zoho_genric_script.ListenerClass.class)
public class Lead extends BaseTest {
	@Test
	public void create_Lead_SignUp_Page() 
	{
		driver.findElement(By.xpath("//button[@cscript-tag='create']")).click();
		   String title4 = driver.getTitle();
			 Assert.assertEquals(title4, "Leads - Zoho CRM");
		   
		   driver.findElement(By.id("Leads_photo")).click();
		   driver.findElement(By.id("upload_photo")).sendKeys("C:\\Users\\admin\\eclipse-workspace\\Zoho_Framework\\photos\\upload.png");
		   driver.findElement(By.xpath("//input[@value='Crop and Set']")).click();
		   driver.findElement(By.id("Crm_Leads_FIRSTNAME_LInput")).sendKeys("rahul");
		   driver.findElement(By.id("Crm_Leads_DESIGNATION_LInput")).sendKeys("Associate Engineer");
		   
		   driver.findElement(By.id("Crm_Leads_PHONE_LInput")).sendKeys("9845123567");
		   driver.findElement(By.id("Crm_Leads_MOBILE_LInput")).sendKeys("9495123451");
		   
		   driver.findElement(By.id("Crm_Leads_LEADSOURCE")).click();
		   driver.findElement(By.xpath("//lyte-drop-item[text()='Advertisement']")).click();
		   
		   
		   driver.findElement(By.id("Crm_Leads_ANNUALREVENUE_LInput")).sendKeys("5000");
		  // driver.findElement(By.id("//input[@tabindex=\"21\"]")).click();
		   driver.findElement(By.id("//input[@placeholder=\"Search Users\"]")).sendKeys("sdbjcdsfher");
		   driver.findElement(By.id("Crm_Leads_LASTNAME_LInput")).sendKeys("rathod");
		   driver.findElement(By.id("Crm_Leads_EMAIL_LInput")).sendKeys("rahul@rathod.com");
		   driver.findElement(By.id("Crm_Leads_FAX_LInput")).sendKeys("sdbcwwaf");
		   driver.findElement(By.id("Crm_Leads_WEBSITE")).sendKeys("dsfldncher");
		   driver.findElement(By.id("Crm_Leads_STATUS")).click();
		   driver.findElement(By.id("Lyte_Drop_Item_52")).click();
	       driver.findElement(By.id("Crm_Leads_EMPCT_LInput")).sendKeys("wefwefer");
		   driver.findElement(By.id("Crm_Leads_RATING")).click();
		   driver.findElement(By.id("Lyte_Drop_Item_61")).click(); 
	       driver.findElement(By.id("Crm_Leads_SKYPEIDENTITY_LInput")).sendKeys("weiugfer");
		   driver.findElement(By.id("Crm_Leads_ADDN_EMAIL_LInput")).sendKeys("salkshfefwea");
		   driver.findElement(By.id("Crm_Leads_TWITTER_LInput")).sendKeys("tfwajfef");
		   
	       driver.findElement(By.id("Crm_Leads_LANE_LInput")).sendKeys("no 4 th cross");
		   
		   driver.findElement(By.id("Crm_Leads_STATE_LInput")).sendKeys("Karnataka");
		   driver.findElement(By.id("inputId")).sendKeys("tfwajfef");
		   
		   
		   driver.findElement(By.id("Crm_Leads_CITY_LInput")).sendKeys("Karnataka");
		   driver.findElement(By.id("Crm_Leads_CODE_LInput")).sendKeys("560022");
		   
		   
		   driver.findElement(By.id("Crm_Leads_DESCRIPTION")).sendKeys("track the parcel");
		   driver.findElement(By.id("crm_create_savebutn")).click();
		   
		   driver.findElement(By.xpath("//button[@class=\"lyte-button lyteDefaultBtn\"]")).click();
		  
}
	@Test
	public void filter() throws InterruptedException
	   {
		driver.findElement(By.id("lyte_accordion_header_0")).click();
		driver.findElement(By.xpath("//span[text()='City']")).click();
		WebElement te= driver.findElement(By.xpath("//input[@class='cxBorderBottom ']"));
		te.sendKeys("chennai");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	   }
}