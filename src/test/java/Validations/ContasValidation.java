package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.ContasPage;
import Report.Report;
import Report.Screenshot;

public class ContasValidation {
	 private WebDriver driver;
	 private ContasPage contasPage;
	    
	    public ContasValidation(WebDriver driver) {
	        this.driver = driver;
	        this.contasPage = new ContasPage(this.driver);
	    }
	public void validationContasPage() {
	        
	        try {
	            
	            Assertions.assertTrue(contasPage.getLogoText().isDisplayed());
	            Report.log(Status.PASS, "Acessou a pagina de Contas corretamente", Screenshot.captureBase64(driver));
	            
	        }catch (Exception e) {
	            
	            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
	        }
	}
}
