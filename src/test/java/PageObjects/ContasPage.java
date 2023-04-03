package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContasPage {
	
	private WebDriver driver;
	   public ContasPage(WebDriver driver) {
	       this.driver = driver;
	   }
	   public WebElement getLogoText() {
	       
	       
	       return driver.findElement(By.className("navbar-brand"));
	   }
	   public WebElement getNomeConta() {
	       return driver.findElement(By.id("nome"));
	   }
	   public WebElement getBotaoSalvar() {
	       return driver.findElement(By.xpath("//div[@class = 'btn-group']/div[@class = 'btn btn-primary]"));
	   }
}
