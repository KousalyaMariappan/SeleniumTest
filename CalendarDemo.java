package com.learn.dayfifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//select the city name
		driver.findElement(By.xpath("//div[@id='dropdownGroup1']//div//*[contains(text(),'BLR')]")).click();
		//select the to city
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//select the city name
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']//div//*[contains(text(),'Chennai')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		driver.close();
	}

}
