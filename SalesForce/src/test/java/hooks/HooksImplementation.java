package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.BaseClass;

public class HooksImplementation extends BaseClass{
	@BeforeMethod
	public void preCondition() {
		opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://login.salesforce.com2/");
		driver.get("https://qeagle-d-dev-ed.develop.my.salesforce.com/");
		
	}
	@AfterMethod
	public void postCondition() {
		
	}

}
