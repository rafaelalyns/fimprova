package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
	private WebDriver driver;
	
	public FinishPage(WebDriver driver) {
		this.driver = driver;
	}
    public WebElement getLogoText() {
        
        return driver.findElement(By.xpath(("//div[@class = 'navbar-header']/div[@class='navbar-brand']")));
    }
    public WebElement getSairBotao() {
        return driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/a"));
    }
}
