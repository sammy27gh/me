package com.maven.me;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class helloTest {

	@Test
	public void me(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
	}
}
