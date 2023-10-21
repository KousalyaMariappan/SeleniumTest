package com.learn.dayfifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabled {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//one way
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//select round trip
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.close();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
	}

}
