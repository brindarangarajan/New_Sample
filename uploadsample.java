package com.org.webdriversample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadsample {
	public static void main(String[] args) throws AWTException{
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		WebDriver ff = new FirefoxDriver();
		/*ff.get("http://only-testing-blog.blogspot.com/");
		
	WebElement fileupload = ff.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[11]/div/div/div/div[2]/div[1]/form/input[10]"));
	fileupload.click();
	
	StringSelection filelocation = new StringSelection("C:\\Users\\Sridhar.SudarsananPc\\Desktop\\brinda\\cover_letter.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filelocation, null);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);*/
	
	ff.get("https://www.seleniumhq.org/");
	ff.findElement(By.linkText("Download")).click();
	
	ff.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/p[3]/a")).click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
