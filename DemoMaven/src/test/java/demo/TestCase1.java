package demo;

import org.testng.annotations.Test;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.ReadProperies;
import util.TestBase;

public class TestCase1 extends TestBase {
	Properties pro; 
	@BeforeMethod
	public void bf() {
		pro=ReadProperies.readProp("./src/main/resources/data/OR.properties");
		
	}

	@Test(enabled = false)
	public void test() {
		openBrowser("chrome");
		openurl("http://demo.automationtesting.in/Register.html");
		enterText(By.xpath("//*[@ng-model='FirstName']"), "Rakesh");
		enterText(By.xpath("//*[@ng-model='LastName']"), "Rakesh");
		enterText(By.xpath("//*[@ng-model='Adress']"), "Pune Maharashtra");
		enterText(By.xpath("//*[@ng-model='EmailAdress']"), "rk@gmail.com");
		enterText(By.xpath("//*[@ng-model='Phone']"), "9123918209");
		selectRadio(By.xpath("//*[@ng-model='radiovalue']"), "Male");
		selectAllChkbx(By.xpath("//*[@type='checkbox']"));
		sleepFor(5);
		clickBtn(By.xpath("//*[@id=\"msdd\"]"));
		clickBtn(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
		clickBtn(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a"));
		selectDropdown(By.xpath("//*[@id=\"Skills\"]"), "C");
		selectDropdown(By.xpath("//*[@id=\"countries\"]"), "India");
		clickBtn(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		enterText(By.xpath("//input[@class='select2-search__field']"), "India");
		enterKey(By.xpath("//input[@class='select2-search__field']"));
		selectDropdown(By.xpath("//*[@id=\"yearbox\"]"), "1990");
		selectDropdown(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"), "May");
		selectDropdown(By.xpath("//*[@id=\"daybox\"]"), "1");
		enterText(By.xpath("//*[@ng-model='Password']"), "r@@akesh");
		enterText(By.xpath("//*[@ng-model='CPassword']"), "r@@akesh");
	}

	
}
