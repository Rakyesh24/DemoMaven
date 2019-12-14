package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.TestBase;

public class RediffLogin {

	@Test
	public void test1() {
		TestBase.openBrowser("chrome");
		TestBase.openurl("https://mail.rediff.com/cgi-bin/login.cgi");

	}

}
