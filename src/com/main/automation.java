package com.main;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.veltechmultitech.org/");
//		 driver.get("file:///C:/Users/prave/eclipse-workspace/CarRental/public/Rental/htmlFile.html");
		driver.findElement(By.id("menu-item-26")).click();
		driver.findElement(By.id("menu-item-26")).click();
		driver.findElement(By.id("menu-item-900")).click();
		driver.findElement(By.id("menu-item-146")).click();

		WebElement name = driver.findElement(By.xpath("//input[@name='your-name']"));
		// WebElement name =
		// driver.findElement(By.xpath("//input[@name='customerName']"));
		name.sendKeys("Praveen");

		WebElement email = driver.findElement(By.xpath("//input[@name='your-email']"));
		email.sendKeys("abc@gmail.com");

		WebElement subject = driver.findElement(By.xpath("//input[@name='your-subject']"));
		subject.sendKeys("dadhadh");

		WebElement message = driver.findElement(By.xpath("//textarea[@name='your-message']"));
		message.sendKeys("djgydfiuhhcsg");

	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
