package com.mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mstr.config.Config;
import com.mstr.utility.LaunchApp;

public class LoginPage 
{
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	
	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		System.out.println("In EnterUsername Method");
		objUsername.sendKeys(username);
		System.out.println("Username is entered successfully");
	}
	
	public void enterPassword(String password)
	{
		objPassword.sendKeys(password);
		System.out.println("Password is entered successfully");
	}
	
	public void clickonLogin()
	{
		objLogin.click();
	}
	
	public static void main(String[] args) throws IOException
	{
		
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizebrowser();
		lc.waittillLoginpageloaded(15);
		
		LoginPage lp= new LoginPage();
		lp.loadLoginpage();
		lp.enterUsername("Mruanal1");
		lp.enterPassword("Password123@");
		lp.clickonLogin();
		
	}

}
