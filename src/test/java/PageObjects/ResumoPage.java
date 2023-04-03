package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResumoPage {
	private WebDriver driver;

	public ResumoPage(WebDriver driver) {

		this.driver = driver;
	}
	public WebElement getLogoText() {

		return driver.findElement(By.className("navbar-brand"));
	}
	public WebElement getResumoMensal() {
		return driver.findElement(By.xpath("//a[@href='/extrato']"));
	}
	public WebElement botaoBuscar() {
		return driver.findElement(By.xpath("//html/body/div[2]/form/input"));
	}
}
