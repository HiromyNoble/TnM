 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


 

public class RIPC_LeftHandPanel {
	
	public static String xlsFilePath = System.getProperty("user.dir") + "\\src\\testdata\\testdata.xls";
	public String sheet="Login"; 
	public String url;
	public String id;
	public String paswd;
	
	WebDriver driver;
	
	@BeforeTest
	    public void setup(){
		ProfilesIni ini = new ProfilesIni();
    	FirefoxProfile profile = ini.getProfile("default");
    	//WebDriver driver =  new FirefoxDriver(profile);
			
    	driver = new FirefoxDriver(profile);
    	
	    	Reporter.log("Firefox browser initialized...............");
	    	
	    	driver.get("http://demo.guru99.com/V4/");
	       
	 
	        
	    }	
	
	
  @Test
  public void f() {
	  //driver.get(url);
  }
}
