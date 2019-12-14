package demo;

import org.openqa.selenium.By;

import util.TestBase;

public class CloseQuit extends TestBase {

	public static void main(String[] args) {
		
		openBrowser("chrome");
		openurl("http://demo.automationtesting.in/Windows.html");
		clickBtn(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		closeWind();
		

	}

}
