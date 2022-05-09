package com.MiniProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

public class MiniProject1 extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static void main(String[] args) {

		getUrl("http://adactinhotelapp.com/");

		passInput(driver.findElement(By.name("username")), "hearthacker9513");

		passInput(driver.findElement(By.name("password")), "ABC123@");

		clickOnElement(driver.findElement(By.name("login")));

		selectOption(driver.findElement(By.id("location")), "Sydney");

		selectOption(driver.findElement(By.id("hotels")), "Hotel Creek");

		clickOnElement(driver.findElement(By.name("Submit")));

		clickOnElement(driver.findElement(By.id("radiobutton_1")));

		clickOnElement(driver.findElement(By.name("continue")));

		passInput(driver.findElement(By.name("first_name")), "Panneer");

		passInput(driver.findElement(By.name("last_name")), "Selvam");

		passInput(driver.findElement(By.name("address")), "8,South Street,US");

		passInput(driver.findElement(By.name("cc_num")), "1234567890123456");

		selectOption(driver.findElement(By.id("cc_type")), "American Express");

		selectOption(driver.findElement(By.id("cc_exp_month")), "December");

		selectOption(driver.findElement(By.id("cc_exp_year")), "2022");

		passInput(driver.findElement(By.name("cc_cvv")), "123");

		clickOnElement(driver.findElement(By.name("book_now")));

	}
}
