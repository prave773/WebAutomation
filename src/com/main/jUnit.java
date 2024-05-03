package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jUnit {
	@Test
	public void testPlacementPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.veltechmultitech.org/");
		driver.findElement(By.id("menu-item-26")).click();
		assertEquals("", "");
	}
}
