package com.datadriventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bs_utility.ExcelUtil;

public class DataDrivenTests {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\user-1\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 ExcelUtil excel = new ExcelUtil("D:\\Day1Problems\\pom\\src\\main\\java\\bs_testdata\\FBdata.xlsx");
		String testcases =excel.getCellData("FacebookTestData","Username",3);
			//	("FacebookTestData","Username",3);
       System.out.println(testcases);
	}

	

	}

 
