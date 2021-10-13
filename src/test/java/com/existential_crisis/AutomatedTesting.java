package com.existential_crisis;

import org.testng.annotations.Test;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AutomatedTesting {
	//declare Selenium WebDriver
	private WebDriver webDriver;
  @Test
  public void f() {
	  webDriver.navigate().to("http://localhost:9099/existential_crisis/retrievedDreads");
	  Assert.assertEquals(webDriver.getTitle(), "existential crisis");
	  System.out.println("title: "+webDriver.getTitle());
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\chromedriver.exe");

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	//Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.quit();
  }

}

