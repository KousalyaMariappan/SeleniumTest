package com.learn.dayfifteen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeScenarios {

	public static void main(String[] args)
	{
		String[] gpm_list={"Cucumber","Brocolli","Carrot"};
		//ArrayList<String> products=new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		List<WebElement> gpm = driver.findElements(By.xpath("//*[@class='product-name']"));
		for (int i = 0; i <= gpm.size(); i++) 
		{
			String gpm_name = gpm.get(i).getText();
			if (gpm_name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				break;
			}
		}
	}

}
