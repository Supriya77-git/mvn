package com.tissolve.testscript;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChatsModule {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement ele = allLinks.get(i);
			String url = ele.getAttribute("href");
			System.out.println(url);
		}
		Reporter.log("Hi",true);
	}
}
