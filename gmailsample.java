package com.org.webdriversample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailsample {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		
		WebDriver ff = new FirefoxDriver();
		//ff.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		ff.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		ff.findElement(By.xpath(".//*[@id='identifierId']")).clear();
		ff.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("shritika1581@gmail.com");
		ff.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		
		ff.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			
		WebDriverWait wait = new WebDriverWait(ff,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")));
			
		ff.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Narashima15");
		
		ff.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			
		ff.findElement(By.cssSelector("div.aic div div")).click();
		WebElement to = ff.findElement(By.name("to"));
		
		wait.until(ExpectedConditions.elementToBeClickable(to));
		to.sendKeys("abc@gmail.com");
		
		WebElement subbox = ff.findElement(By.name("subjectbox"));
		wait.until(ExpectedConditions.elementToBeClickable(subbox));
		subbox.sendKeys("Test Mail");
		
		ff.findElement(By.cssSelector("div[class='Am Al editable LW-avf']")).sendKeys("This is test mail");
		
		ff.findElement(By.cssSelector("tr.btC td:nth-of-type(1) div div:nth-of-type(2)")).click();
		Thread.sleep(3000);
		
		ff.findElement(By.cssSelector("div.TN.bzz.aHS-bnu div span a")).click();
		
		//Delete mails in inbox
		ff.findElement(By.cssSelector("div.TN.bzz.aHS-bnt div span a")).click();
		
		Thread.sleep(1000);
		ff.findElement(By.cssSelector("div.J-J5-Ji.J-JN-M-I-Jm span div")).click();
		ff.findElement(By.cssSelector("div.Cq.aqL div div div:nth-child(2) div.T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs.W6eDmd")).click();
		
		Thread.sleep(1000);	
			
		ff.findElement(By.cssSelector("div.gb_Sc.gb_mb.gb_Pg.gb_R a span")).click();
		ff.findElement((By.cssSelector("a[id='gb_71']"))).click();
		
		ff.close();
			
	}
}
