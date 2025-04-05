package org.com.Others;

import java.io.IOException;

import org.testng.annotations.Test;

public class KillDrivers {
	
   @Test
   public void KillChromeDriver() throws IOException, InterruptedException
    {
        
            @SuppressWarnings("deprecation")
			Process process = Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
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
     
         @SuppressWarnings("deprecation")
			Process process = Runtime.getRuntime().exec("taskkill /F /IM msedge.exe /T");
         process.waitFor();
         
         if (process.exitValue() == 0) 
         {
             System.out.println("All Edge Browser were successfully terminated.");
         } else {
             System.out.println("There was an issue terminating Edge processes.");
         }
     } 
 }