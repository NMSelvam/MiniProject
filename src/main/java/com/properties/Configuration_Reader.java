package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\selvam\\eclipse-workspace\\example\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getUrl() throws Throwable {
		String url = p.getProperty("url");
		return url;

	}

	public String getUsername() throws Throwable {
		String username = p.getProperty("userName");
		return username;

	}

	public String getPassword() throws Throwable {
		String password = p.getProperty("password");
		return password;
	}
}
