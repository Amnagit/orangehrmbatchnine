package com.stepDef;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.pagefactory.LoginPageOrange;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps {
	WebDriver driver;
	LoginPageOrange obj;
	
	@Given("^user open web browser and navigate to HRM login screen$")
	public void user_open_web_browser_and_navigate_to_HRM_login_screen() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gull_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		obj = PageFactory.initElements(driver, LoginPageOrange.class); 
	}

	

	@Then("^user Navigate to Page and verify the Page Title is \"([^\"]*)\"$")
	public void user_Navigate_to_Page_and_verify_the_Page_Title_is(String arg1) throws Throwable {
		
    driver.getTitle();
 


	}

	@Then("^user enter a valid username and password$")
	public void user_enter_a_valid_username_and_password() throws Throwable {
//driver.findElement(By.id("username")).sendKeys("Admin");
//driver.findElement(By.id("password")).sendKeys("admin123");
 
		
	obj.getUsername().sendKeys("Admin");
	
		obj.getPassword().sendKeys("admin123");
	}

	@Then("^user click the Sign in button$")
	public void user_click_the_Sign_in_button() throws Throwable {
		obj.getSignInBtn().click();
		
		//WebElement signin = driver.findElement(By.xpath("//*[@name='Submit']"));
	  // signin.click();		

//		WebElement Welcome = driver.findElement(By.xpath("//*[name='Submit']"));

	}

	@When("^user click on log out button for Orange Hrm$")
	public void user_click_on_log_out_button_for_Orange_Hrm() throws Throwable {
		WebElement welcome = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
		welcome.click();
		
		WebElement logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		logout.click();

				
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(30, TimeUnit.SECONDS)
				  .pollingEvery(1, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(logout)).click();

	}

}
