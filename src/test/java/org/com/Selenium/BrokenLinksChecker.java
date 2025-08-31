package org.com.Selenium;

import java.net.URL;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksChecker {

    @Test
    public void GetBrokenLinks() throws IOException 
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.in");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("🔍 Total links found: " + allLinks.size());

        int validLinks = 0;
        int brokenLinks = 0;


        for (WebElement link : allLinks)
        {
            String href = link.getAttribute("href");

            if (href != null && (href.startsWith("http") || href.startsWith("https"))) 
            {
                try 
                {
                    URI uri = new URI(href); 
                    URL url = uri.toURL();  

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("HEAD"); // Lightweight check
                    connection.setConnectTimeout(3000);  // Optional: timeout
                    connection.connect();

                    int responseCode = connection.getResponseCode();

                    if (responseCode >= 400) 
                    {
                        brokenLinks++;
                        System.out.println("❌ Broken link: " + href + " → Status: " + responseCode);
                    } else
                    {
                        validLinks++;
                       // System.out.println("✅ Valid link: " + href + " → Status: " + responseCode);
                    }

                } catch (URISyntaxException | IOException e) {

                    System.out.println("⚠️ Unreachable link: " + href + " → " + e.getMessage());
                }

            } else {
                System.out.println("⏭️ Skipped non-HTTP link: " + href);
            }
        }

        System.out.println("\n📊 Count Summary:");
        System.out.println("Total links scanned: " + allLinks.size());
        System.out.println("Valid links: " + validLinks);
        System.out.println("Broken links: " + brokenLinks);

        driver.quit();
    }
}