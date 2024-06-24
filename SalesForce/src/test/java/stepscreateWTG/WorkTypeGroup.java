package stepscreateWTG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class WorkTypeGroup extends BaseClass {


	

	@Given("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
}

	@Given("Enter Work Type Group Name as {string}")
	public void enter_work_type_group_name_as(String string) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(string);

	}

	@Given("Click save and")
	public void click_save_and() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		}

	@Then("Verify Work Type Group Name")
	public void verify_work_type_group_name() {
	String string1 = driver.findElement(By.xpath("//slot[@name='primaryField']")).getText();
	//String string2 = "Salesforce Automation by Avila";
	//Assert.assertEquals(string1, string2);
	assertTrue(string1.contains("Avila"));

	}
	

}
