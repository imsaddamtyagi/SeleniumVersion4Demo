package org.com.Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class JavascriptExecutorDemo
{
	
	
	@Test
	public void JavascriptExecutor_Click() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
 
		WebElement SearchbBox = waitForElementByXPath(driver, "//input[@id = 'twotabsearchtextbox']",20);			
		dosend_JavascriptExecutor(driver,SearchbBox,"Pomodoro");
		
		WebElement SearchBtn = waitForElementByXPath(driver, "//input[@id = 'nav-search-submit-button']",20);		
		doclick_JavascriptExecutor(driver,SearchBtn);
		
		WebElement AddToCart = waitForElementByXPath(driver, "(//button[@name='submit.addToCart'])[1]",20);		
		doclick_JavascriptExecutor(driver,AddToCart);
		
		WebElement GoToCart = waitForElementByXPath(driver, "//a[contains(text(),'Go to Cart')]",20);		
		doclick_JavascriptExecutor(driver,GoToCart);
		
		WebElement ProceedToBuy = waitForElementByXPath(driver, "//div[contains(text(),'Proceed to Buy')]",20);		
		doclick_JavascriptExecutor(driver,ProceedToBuy);
		static_wait(1);
		dodoubleclick_JavascriptExecutor(driver,ProceedToBuy);
		
		WebElement UserName = waitForElementByXPath(driver, "//input[@id='ap_email_login']",20);			
		dosend_JavascriptExecutor(driver,UserName,"husainahamad055@gmail.com");
		
		WebElement Continue = waitForElementByXPath(driver, "//input[@class='a-button-input']",20);		
		doclick_JavascriptExecutor(driver,Continue);
		
		WebElement Password = waitForElementByXPath(driver, "//input[@id='ap_password']",20);			
		dosend_JavascriptExecutor(driver,Password,"Lincoln@1234");
		
		WebElement SignIn = waitForElementByXPath(driver, "//input[@id='signInSubmit']",20);		
		doclick_JavascriptExecutor(driver,SignIn);
				
	    waitForOTPAndSignIn(driver,"//input[@id='auth-mfa-otpcode']","//input[@id='auth-signin-button']", 60); 

	}
		
		
	
	
	public WebElement waitForElementByXPath(WebDriver driver, String xpath, int seconds) 
	{
	    long startTime = System.currentTimeMillis();

	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	   .withTimeout(Duration.ofSeconds(seconds)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	    
	    long endTime = System.currentTimeMillis();
	    long totalTime = (endTime - startTime) / 1000;
	    System.out.println("Element located in: " + totalTime + " seconds");
	    return element;
	}
	

	public void doclick_JavascriptExecutor(WebDriver driver, WebElement element)
	{		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	     jse.executeScript("arguments[0].style.border='2px solid orange'", element);
	     jse.executeScript("arguments[0].click();", element);
		System.out.println("Click Success");
		
	}
	
	
	public void dodoubleclick_JavascriptExecutor(WebDriver driver, WebElement element)
	{		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	     jse.executeScript("arguments[0].style.border='2px solid orange'", element);
	        String script = "var evt = new MouseEvent('dblclick', {" +
                    "bubbles: true, cancelable: true, view: window});" +
                    "arguments[0].dispatchEvent(evt);";
         jse.executeScript(script, element);

		System.out.println("Double Click Success on");
		
	}
	
	public static void dosend_JavascriptExecutor(WebDriver driver, WebElement element,String value)
	{		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	     jse.executeScript("arguments[0].style.border='2px solid orange'", element);
	     jse.executeScript("arguments[0].value = arguments[1];", element, value);
		System.out.println("Sending "+value+ "...success");
		
	}
	
	
	public void static_wait(int seconds) throws InterruptedException 
	{
	    System.out.println("Static wait started for " + seconds + " seconds...");

	    for (int i = 1; i <= seconds; i++) {
	        Thread.sleep(1000); 
	        System.out.println("✅ " + i + " second" + (i > 1 ? "s" : "") + " passed");
	    }

	    System.out.println("Static wait of " + seconds + " seconds is over.");
	}
	
	
	public void waitForOTPAndSignIn(WebDriver driver, String otpXPath, String signInXPath, int timeoutSeconds) throws InterruptedException 
	{
	
	    int elapsed = 0;
	    while (elapsed < timeoutSeconds)
	    {
	        WebElement otpField = driver.findElement(By.xpath(otpXPath));
	        String otp = otpField.getAttribute("value");

	        if (otp != null && otp.matches("\\d{6}")) {
	            System.out.println("✅ 6-digit OTP entered: " + otp);
	            WebElement signInButton = driver.findElement(By.xpath(signInXPath));
	            signInButton.click();
	            System.out.println("🚀 Sign In button clicked.");
	            return;
	        }

	        System.out.println("⏳ Waiting for OTP... (" + elapsed + "s)");
	        Thread.sleep(1000);
	        elapsed++;
	    }

	    throw new TimeoutException("❌ OTP not entered within " + timeoutSeconds + " seconds.");
	}


}
