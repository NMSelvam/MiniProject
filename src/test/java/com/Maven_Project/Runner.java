package com.Maven_Project;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.properties.Page_Object_Manager;

public class Runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) {
		getUrl("http://adactinhotelapp.com/");

		passInput(pom.getInstanceLogin().getuserName(), "hearthacker9513");

		passInput(pom.getInstanceLogin().getPassword(), "ABC123@");

		clickOnElement(pom.getInstanceLogin().getLogin());
	}
}
