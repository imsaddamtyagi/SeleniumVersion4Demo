package org.com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel_Execution 
{
	
	
	@Test
	public void Launch_Chome()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String chromeThreadName = Thread.currentThread().getName();
		System.out.println("Chrome Thread Name: " + chromeThreadName);
	
	}
	
	@Test
	public void Launch_Edge()
	{
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String edgeThreadName = Thread.currentThread().getName();	
		System.out.println("  Edge Thread Name: "+edgeThreadName);

	}
	
	

}
