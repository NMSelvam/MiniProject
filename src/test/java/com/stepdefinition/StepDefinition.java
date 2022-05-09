package com.stepdefinition;

import org.openqa.selenium.By;

import com.baseclass.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {
	
	
	
	@Given("^user Must Launch The URL$")
	public void user_Must_Launch_The_URL() throws Throwable {

		getUrl("http://adactinhotelapp.com/");
	}

	@When("^user enter The userName In The userName Field$")
	public void user_enter_The_userName_In_The_userName_Field() throws Throwable {

		passInput(driver.findElement(By.name("username")), "hearthacker9513");
	}

	@When("^user enter The Password In The Password Field$")
	public void user_enter_The_Password_In_The_Password_Field() throws Throwable {

		passInput(driver.findElement(By.name("password")), "ABC123@");
	}

	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(driver.findElement(By.name("login")));
	}
	
	@When("^user enter The Location  In The Location Field$")
	public void user_enter_The_Location_In_The_Location_Field() throws Throwable {
	   
		selectOption(driver.findElement(By.id("location")), "Sydney");
	}

	@When("^user select The Hotels Names In The Hotels Field$")
	public void user_select_The_Hotels_Names_In_The_Hotels_Field() throws Throwable {
	    
		selectOption(driver.findElement(By.id("hotels")), "Hotel Creek");
	}

	@Then("^user Click The Submit Button And It Navigates To The Hotels List Page$")
	public void user_Click_The_Submit_Button_And_It_Navigates_To_The_Hotels_List_Page() throws Throwable {
	   
		clickOnElement(driver.findElement(By.name("Submit")));
	}

	@When("^user select the Radio Button To Choose the Hotel List$")
	public void user_select_the_Radio_Button_To_Choose_the_Hotel_List() throws Throwable {
	   
		clickOnElement(driver.findElement(By.id("radiobutton_1")));
	}

	@Then("^user Click The Continue Button And It Navigates To The Payments Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Payments_Page() throws Throwable {
	   
		clickOnElement(driver.findElement(By.name("continue")));
	}

	@When("^user enter the First Name In The First Name Field$")
	public void user_enter_the_First_Name_In_The_First_Name_Field() throws Throwable {
		
		passInput(driver.findElement(By.name("first_name")), "Panneer");
	}

	@When("^user enter the Last Name In The Last Name Field$")
	public void user_enter_the_Last_Name_In_The_Last_Name_Field() throws Throwable {
	   
		passInput(driver.findElement(By.name("last_name")), "Selvam");

	}

	@When("^user enter the Address In The Address Field$")
	public void user_enter_the_Address_In_The_Address_Field() throws Throwable {
	   
		passInput(driver.findElement(By.name("address")), "8,South Street,US");
	}

	@When("^user enter the Credit Card Number In The Credit Card Number Field$")
	public void user_enter_the_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
	    
		passInput(driver.findElement(By.name("cc_num")), "1234567890123456");

	}

	@When("^user enter the Credit Card Type In The Credit Card Type Field$")
	public void user_enter_the_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
	   
		selectOption(driver.findElement(By.id("cc_type")), "American Express");

	}

	@When("^user enter the Credit Card Expire Month In The Credit Card Expire Month Field$")
	public void user_enter_the_Credit_Card_Expire_Month_In_The_Credit_Card_Expire_Month_Field() throws Throwable {
	   
		selectOption(driver.findElement(By.id("cc_exp_month")), "December");
	}

	@When("^user enter the Credit Card Expire Year In The Credit Card Expire Year Field$")
	public void user_enter_the_Credit_Card_Expire_Year_In_The_Credit_Card_Expire_Year_Field() throws Throwable {
	    
		selectOption(driver.findElement(By.id("cc_exp_year")), "2022");

	}

	@When("^user enter the Credit Card CVV In The Credit Card CVV Field$")
	public void user_enter_the_Credit_Card_CVV_In_The_Credit_Card_CVV_Field() throws Throwable {
	    
		passInput(driver.findElement(By.name("cc_cvv")), "123");

	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
	    
		clickOnElement(driver.findElement(By.name("book_now")));

	}



}
