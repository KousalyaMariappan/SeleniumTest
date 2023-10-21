package com.learn.dayfifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNgDemo
{
	//Assertions validate the values returned by the selenium scritps.
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		int count=driver.findElements(By.xpath("//*[@id='discount-checkbox']//*[@type='checkbox']")).size();
		System.out.println("Total number of checkboxes is"+count);
	}

}
