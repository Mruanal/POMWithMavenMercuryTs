package com.mstr.testExecution;

import java.io.IOException;

import com.mstr.pages.FlightFinderpage;
import com.mstr.pages.LoginPage;
import com.mstr.utility.LaunchApp;

public class Main 
{
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
		
		FlightFinderpage ff= new FlightFinderpage();
		ff.LoadFilghtFinderpage();
		ff.verifyFFpage();
		ff.clickonSignoff();
	}
}
