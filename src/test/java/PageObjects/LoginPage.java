package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	private WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;        
	}

	public WebElement getSuccesfulRegistrationText() {

		return driver.findElement(By.xpath("/html/body/div[1]"));
	}

	public WebElement getEmailInput() {

		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordInput() {

		return driver.findElement(By.id("senha"));
	}

	public WebElement getEnterButton() {

		return driver.findElement(By.xpath("//button[@type='submit']"));
	}

}
