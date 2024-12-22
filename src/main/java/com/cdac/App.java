package com.cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) throws InterruptedException {
//        System.out.println( "Hello World!" );

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys("tomsmith");

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		login.click();

		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		logout.click();

		Thread.sleep(3000);

		driver.quit();

	}
}
