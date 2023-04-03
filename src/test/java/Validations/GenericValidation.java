package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.GenericPage;
import PageObjects.LoginPage;
import Report.Report;
import Report.Screenshot;

public class GenericValidation {
	private WebDriver driver;
    private LoginPage loginPage;
    private GenericPage genericPage;

    public GenericValidation(WebDriver driver) {
        
        this.driver = driver;
        this.genericPage = new GenericPage(driver);
    }
    
    public void validationGenericPage() {
        
        try {
			Assertions.assertTrue(genericPage.getBemvindo().isDisplayed());
            Report.log(Status.PASS, "Acessou a pagina home corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
