package com.cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleTest {

	WebDriver driver;

	@BeforeTest
	public void before() {
		driver = new ChromeDriver();

		driver.get("https://testpages.eviltester.com/styled/search");

	}

	@Test
	public void test() throws InterruptedException {

		Thread.sleep(3000);

		driver.manage().window().maximize();
		

		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/form/p[1]/input"));
		searchBox.sendKeys("tomsmith");
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div/form/input"));
		submitButton.click();

		Thread.sleep(3000);

		WebElement result = driver.findElement(By.xpath("//*[@id=\"resultList\"]/li[1]/a"));
		System.out.println("First result: " + result.getText());
		Thread.sleep(3000);

	}

	@AfterTest
	public void after() {
		
		driver.quit();
	}

}
