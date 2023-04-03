package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.FinishPage;
import Validations.FinishValidation;



public class FinishTask {
	private WebDriver driver;
    private FinishPage finishPage;
    private FinishValidation finishValidation;
    
    public FinishTask(WebDriver driver) {
    	this.driver = driver;
    	this.finishPage = new FinishPage(driver);
    	this.finishValidation = new FinishValidation(driver);
    }
    public void Sair() {
    	finishPage.getSairBotao().click();
    }
}
