package com.org.webdriversample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_open {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		WebDriver ff = new FirefoxDriver();
		ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ff.get("http://newtours.demoaut.com/");
		ff.get("https://my.norton.com/extspa/idsafe");
		ff.findElement(By.xpath(".//*[@id='sign_in_block']/div/div[1]/a")).click();
		
		ff.findElement(By.xpath(".//*[@id='loginUsername']")).sendKeys("sudarsanans79@yahoo.com");
		ff.findElement(By.xpath(".//*[@id='loginPassword']")).click();
		ff.findElement(By.xpath(".//*[@id='loginPassword']")).sendKeys("Vijay@22");
		
		ff.findElement(By.cssSelector("input[id='signin_button']")).click();
	    
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='unlock-container']/div/div[2]/div[1]/div/div/input")));
		//ff.findElement(By.xpath(".//*[@id='unlock-container']/div/div[2]/div[1]/div/div/input")).sendKeys("Padmini#22");
		
		Thread.sleep(10000);
		
		ff.findElement(By.className("passwordinput")).click();
		//ff.findElement(By.cssSelector("input[class='passwordinput']")).sendKeys("Hai");
		
	}
}
