package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com\\stepdefinition") // Right Click->Run As->Run
																							// Configurations->Test
																							// runner->JUnit4
public class Test_Runner {

	public static WebDriver driver;

	public static void setup() {

		driver = Base_Class.getBrowser("chrome");
	}

	public static void tearDown() {

		Base_Class.closeBrowser();
	}
}