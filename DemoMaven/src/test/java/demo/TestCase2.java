package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import util.TestBase;

import org.openqa.selenium.By;

public class TestCase2 extends TestBase {
	@Test
	public void f() {
		openBrowser("chrome");
		openurl("http://demo.automationtesting.in/Windows.html");
		clickBtn(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
	}

}
