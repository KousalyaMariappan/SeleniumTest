package com.learn.dayfifteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//*[@id='divpaxOptions']//span[@id='hrefIncAdt']")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("Done");
		driver.close();
	}

}


