package org.com.Others;

import java.io.IOException;

import org.testng.annotations.Test;

public class KillDrivers {
	
   @Test
   public void KillChromeDriver() throws IOException, InterruptedException
    {
        
	   ProcessBuilder builder = new ProcessBuilder("taskkill", "/F", "/IM", "chromedriver.exe", "/T");
	   Process process = builder.start();
            process.waitFor();
            
            if (process.exitValue() == 0) 
            {
                System.out.println("All chromedriver processes were successfully terminated.");
            } else {
                System.out.println("There was an issue terminating chromedriver processes.");
            }
        } 
   

  @Test
  public void KillEdge() throws IOException, InterruptedException
    {
     
	    ProcessBuilder builder = new ProcessBuilder("taskkill", "/F", "/IM", "msedge.exe", "/T");
	    Process process = builder.start();
	    process.waitFor();
	    
         if (process.exitValue() == 0) 
         {
             System.out.println("All Edge Browser were successfully terminated.");
         } else {
             System.out.println("There was an issue terminating Edge processes.");
         }
     } 
 }