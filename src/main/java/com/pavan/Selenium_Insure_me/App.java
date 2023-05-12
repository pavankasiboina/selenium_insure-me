package com.pavan.Selenium_Insure_me;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Insure-me application Test
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException 
    {
    	//System.setProperty("webdriver.chrome.driver","E:\\LatestChromeDriver");
    	
    	WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
        System.out.println( "Selenium test scripts executed started ...." );
        
        
        System.out.println("Opening Insure-Me Browser");
        driver.get("http://43.204.220.96:8090/contact.html");
        Thread.sleep(2000);
        
        System.out.println("Hitting Contact-US button");
        //driver.findElement(By.className("nav-link")).click();
        Thread.sleep(2000);
        
        System.out.println("Entering Name");
        driver.findElement(By.id("inputName")).sendKeys("pavan kasiboina");
        Thread.sleep(1500);
        
        System.out.println("Entering Mobile Number");
        driver.findElement(By.id("inputNumber")).sendKeys("7896834783");
        Thread.sleep(1000);
        
        System.out.println("Entering Email");
        driver.findElement(By.id("inputMail")).sendKeys("pavank@gmail.com");
        Thread.sleep(1000);
        
        System.out.println("Entering Message");
        driver.findElement(By.id("inputMessage")).sendKeys("I need more information regarding this policy");
        Thread.sleep(1000);
        
        System.out.println("Hitting Send Button");
        driver.findElement(By.id("my-button")).click();
        Thread.sleep(1000);
        Thread.sleep(5000);
        
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("E:\\selenium-scrshot\\test-report.jpg");
        FileUtils.copyFile(srcFile, destFile);
        Thread.sleep(1000);
        
        driver.quit();
        System.out.println("Scripts executed successfully");
        
        
    }
}
