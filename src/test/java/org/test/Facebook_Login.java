package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri Sai kumar\\eclipse-workspace\\Selinium_First_Project\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://phptravels.org/index.php?rp=/login");
		
		WebElement txtUserName = driver.findElement(By.id("inputEmail"));
		txtUserName.sendKeys("srisai.veerakumar@gmail.com");
		
		WebElement txtPass = driver.findElement(By.id("Pass"));
		txtPass.sendKeys("12356");
		
		WebElement btnClick = driver.findElement(By.name("Button"));
		btnClick.click();
		

		WebElement txtPaass = driver.findElement(By.id("Pass"));
		txtPaass.sendKeys("12356");
		
		WebElement btnCllick = driver.findElement(By.name("Button"));
		btnCllick.click();
		
		Thread.sleep(300);
		System.out.println("Facebook");
		System.out.println("Insta");

		System.out.println("Whatsapp");

	

		
		
	}

}
