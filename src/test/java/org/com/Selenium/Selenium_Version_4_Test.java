package org.com.Selenium;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Selenium_Version_4_Test
{	
	  
      public final static int TIMEOUT = 10;
      public static String URL ="https://www.google.com";
      public static WebDriver driver;
	
	
	@BeforeTest
	public void InitializeSelenium()
	{
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
          System.out.println("Navigation Success");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}
	
	
	@Test
	public void Selenium_Version_4_Launch()
	{
		long startTime = System.nanoTime();
		try{FluentWait(); } catch(Exception e) {System.out.println("Fluent wait is over");}
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double durationInSeconds = duration / 1_000_000_000.0; 
        System.out.println("Time taken: " + durationInSeconds + " seconds");						
	}
	
	public void FluentWait()
	{
		FluentWait<WebDriver> wait = new FluentWait<>(driver) 
				.withTimeout(Duration.ofSeconds(20)) 
                .pollingEvery(Duration.ofSeconds(5)) 
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Sign in'])[2]")));
		           element.click();
		
				
	}

}










