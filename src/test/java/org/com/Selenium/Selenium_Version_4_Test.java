package org.com.Selenium;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Selenium_Version_4_Test
{	
	  
      public static String URL ="https://www.amazon.in";
      public static WebDriver driver;
      public static WebDriverListener listener;   
      public static EventFiringDecorator<WebDriver> decorator;
	
	
	@BeforeTest
	public void InitializeSelenium_Version_4()
	{
		  driver    = new ChromeDriver();
		  listener  = new MyWebDriverListener();                       // New  in Selenium 4 
		  decorator = new EventFiringDecorator<WebDriver>(listener);  //  New  in Selenium 4 
		  
		  driver = decorator.decorate(driver);
		  driver.manage().window().maximize();
		  driver.get(URL);
	}
	
	
	
	
	
	@Test()
	public void Selenium_Version_4_Launch() throws InterruptedException
	{
	
		doSendKeys(driver,"//input[@id = 'twotabsearchtextbox']","Pomodoro",10);
		
		doClick(driver,"//input[@id = 'nav-search-submit-button']",10);
		
		doClick(driver,"(//button[@name='submit.addToCart'])[1]",10);	
			
		doClick(driver,"(//span[contains(text(),'Cart')])[2]",10); //a[contains(text(),'Go to Cart')]"		
		
		try { doClick(driver,"//div[contains(text(),'Proceed to Buy')]",10);} catch(Exception e) {}

		doSendKeys(driver,"//input[@id='ap_email_login']","@gmail.com",10);
		
		doClick(driver,"//input[@class='a-button-input']",10);
		
		doSendKeys(driver,"//input[@id='ap_password']","1234",10);
		
		doClick(driver,"//input[@id='signInSubmit']",10);
				
	    waitForOTPAndSignIn(driver,"//input[@id='auth-mfa-otpcode']","//input[@id='auth-signin-button']", 60); 
		
		
	}
	
	
	

	
	public void doClick(WebDriver driver, String xpath, int seconds) 
	{
	   // long startTime = System.currentTimeMillis();

	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	   .withTimeout(Duration.ofSeconds(seconds))
	   .pollingEvery(Duration.ofSeconds(2))
	   .ignoring(NoSuchElementException.class);
	    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	    element.click();
	   //  long endTime = System.currentTimeMillis();
	  //   long totalTime = (endTime - startTime) / 1000;
	 //   System.out.println("Element located in: " + totalTime + " seconds");
	  
	}
	
	public void doSendKeys(WebDriver driver, String xpath, String value,int seconds) 
	{
	   // long startTime = System.currentTimeMillis();

	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	   .withTimeout(Duration.ofSeconds(seconds))
	   .pollingEvery(Duration.ofSeconds(2))
	   .ignoring(NoSuchElementException.class);
	    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	    element.sendKeys(value);
	   //  long endTime = System.currentTimeMillis();
	  //   long totalTime = (endTime - startTime) / 1000;
	 //   System.out.println("Element located in: " + totalTime + " seconds");
	  
	}

	
	public void static_wait(int seconds) throws InterruptedException 
	{
	   // System.out.println("Static wait started for " + seconds + " seconds...");

	    for (int i = 1; i <= seconds; i++) {
	        Thread.sleep(1000); 
	       // System.out.println("✅ " + i + " second" + (i > 1 ? "s" : "") + " passed");
	    }

	//    System.out.println("Static wait of " + seconds + " seconds is over.");
	}
	
	
	public void waitForOTPAndSignIn(WebDriver driver, String otpXPath, String signInXPath, int timeoutSeconds) throws InterruptedException 
	{
	
	    int elapsed = 0;
	    while (elapsed < timeoutSeconds)
	    {
	        WebElement otpField = driver.findElement(By.xpath(otpXPath));
	        String otp = otpField.getAttribute("value");

	        if (otp != null && otp.matches("\\d{6}")) 
	        {
	           // System.out.println("✅ 6-digit OTP entered: " + otp);
	            WebElement signInButton = driver.findElement(By.xpath(signInXPath));
	            signInButton.click();
	           // System.out.println("🚀 Sign In button clicked.");
	            return;
	        }

	        System.out.println("⏳ Waiting for OTP... (" + elapsed + "s)");
	        Thread.sleep(1000);
	        elapsed++;
	    }

	    throw new TimeoutException("❌ OTP not entered within " + timeoutSeconds + " seconds.");
	}

	

}