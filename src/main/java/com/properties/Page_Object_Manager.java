package com.properties;

import org.openqa.selenium.WebDriver;
import com.pomclass.Login_page;

public class Page_Object_Manager {
	public WebDriver driver;
	private Login_page lp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;

	}

	public Login_page getInstanceLogin() {
		if (lp == null) {
			lp = new Login_page(driver);

		}
		return lp;
	}

}
