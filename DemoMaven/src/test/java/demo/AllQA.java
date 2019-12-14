package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllQA {
	WebDriver driver;

	@Test(enabled = false)
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https:\\www.rediff.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"red_container_main\"]/div[27]/p/a"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		js.executeScript("window.scrollBy(0,500)");
	}

	@Test
	public void test2() throws Throwable {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\rakyesh\\Selenium_ALL\\FinalProject\\INTERVIEWMODULUE\\Sheet\\first.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();

		driver = new ChromeDriver();

		for (int i = 1; i <= rowNum; i++) {
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			String name = sheet.getRow(i).getCell(1).getStringCellValue();
			String pass = sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(name + "||" + pass);
			driver.findElement(By.name("login")).sendKeys(name);
			driver.findElement(By.name("passwd")).sendKeys(pass);
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(5000);

		}

	}

	@Test(enabled = false)
	public void test3() {

	}

}
