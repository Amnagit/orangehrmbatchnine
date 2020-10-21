package com.pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


	public class LoginPageOrange {
		WebDriver driver;
		public LoginPageOrange(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
		private WebElement username;

		@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
		private WebElement password;
		
		@FindBy(how = How.XPATH, using = "//*[@name='Submit']")
		private WebElement signInBtn;
		
		@FindBy (how = How.XPATH, using = "//*[contains(text(),'Logout')")
		private WebElement LogOutBtn;
		
		
		public WebElement getLogOutBtn() {
			return LogOutBtn;
		}

		public void setLogOutBtn(WebElement logOutBtn) {
			LogOutBtn = logOutBtn;
		}

		public WebElement getSignInBtn() {
			return signInBtn;
		}

		public void setSignInBtn(WebElement signInBtn) {
			this.signInBtn = signInBtn;
		}

		public WebElement getUsername() {
			return username;
		}

		public void setUsername(WebElement username) {
			this.username = username;
		}

		public WebElement getPassword() {
			return password;
		}

		public void setPassword(WebElement password) {
			this.password = password;
		}

          

		
	
	}

