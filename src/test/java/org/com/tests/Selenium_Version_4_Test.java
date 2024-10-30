package org.com.tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Version_4_Test
{
	
	  private static WebDriver driver;
      public final static int TIMEOUT = 10;
	
	
	@BeforeTest
	public void InitializeSelenium()
	{
		   WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	
	}
	
	
	
	@Test
	public void Selenium_Version_4_Launch()
	{
		
		
	}

}
