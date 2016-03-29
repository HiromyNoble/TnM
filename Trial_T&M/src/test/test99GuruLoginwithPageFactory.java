package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

 
import org.testng.Assert;
 
import org.testng.annotations.BeforeTest;
 
import org.testng.annotations.Test;
 
import PageFactory.Guru99HomePage;
 
import PageFactory.Guru99LoginPage;

public class test99GuruLoginwithPageFactory {

	 WebDriver driver;
	 
	    Guru99LoginPage objLogin;
	 
	    Guru99HomePage objHomePage;
	 
	     
	 
	    @BeforeTest
	 
	    public void setup(){
	 
	    	ProfilesIni ini = new ProfilesIni();
	    	FirefoxProfile profile = ini.getProfile("default");
	    	WebDriver driver =  new FirefoxDriver(profile);
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://demo.guru99.com/V4/");
	 
	    }
	 
	    /**
	 
	     * This test go to http://demo.guru99.com/V4/
	 
	     * Verify login page title as guru99 bank
	 
	     * Login to application
	 
	     * Verify the home page using Dashboard message
	 
	     */
	 
	    @Test(priority=0)
	 
	    public void test_Home_Page_Appear_Correct(){
	 
	        //Create Login Page object
	 
	    objLogin = new Guru99LoginPage(driver);
	 
	    //Verify login page title
	 
	    String loginPageTitle = objLogin.getLoginTitle();
	 
	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	 
	    //login to application
	 
	    objLogin.loginToGuru99("mgr123", "mgr!23");
	 
	    // go the next page
	 
	    objHomePage = new Guru99HomePage(driver);
	 
	    //Verify home page
	 
	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	 
	    }
	
}
