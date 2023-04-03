package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericPage {
	private WebDriver driver;
    
    public GenericPage(WebDriver driver) {
        
        this.driver = driver;        
    }
    
    public WebElement getLogoText() {
        
        
        return driver.findElement(By.className("navbar-brand"));
    }
    public WebElement getBemvindo() {
    	return driver.findElement(By.className("alert alert-success"));
    }
   
    public WebElement getBotaoContas () {
        return driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a"));
    }
    public WebElement getAdicionar() {
        return driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a"));
    }
    public WebElement getCriarMovimentacao() {
        return driver.findElement(By.className("movimentacao"));
    }
    public WebElement getAdicionarNome() {
    	return driver.findElement(By.id("nome"));
    }
    
    public WebElement getBotaoSalvarConta() {
    	return driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button"));
    }
}
