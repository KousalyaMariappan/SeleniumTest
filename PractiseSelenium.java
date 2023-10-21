package com.learn.dayfifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PractiseSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkbox-example']//*[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//*[@id='checkbox-example']//*[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkbox-example']//*[@id='checkBoxOption1']")).isSelected());
		int count =driver.findElements(By.xpath("//*[@id='checkbox-example']")).size();
		System.out.println(count);
		driver.close();
	}

}
