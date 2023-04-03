package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.LoginPage;
import PageObjects.NovoUsuarioPage;
import Report.Report;
import Report.Screenshot;

public class NovoUsuarioValidation {
	private  WebDriver driver;
	private NovoUsuarioPage novoUsuarioPage;

	public NovoUsuarioValidation(WebDriver driver) {

		this.driver = driver;
		this.novoUsuarioPage = new NovoUsuarioPage(this.driver);
	}
	public void validationUsuarioPage() {

		try { 
			Assertions.assertTrue(novoUsuarioPage.getLogoText().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de Cadastro corretamente", Screenshot.captureBase64(driver));

		}catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	
	}
}
