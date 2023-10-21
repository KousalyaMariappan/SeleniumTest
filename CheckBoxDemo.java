package com.learn.dayfifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		boolean isselected=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		if(isselected)
		{
			System.out.println("CheckBox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		int count=driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println("Total number of checkboxes is"+count);
	}

}
