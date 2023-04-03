package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.MovimentacaoPage;
import Report.Report;
import Report.Screenshot;

public class MovimentacaoValidation {
	private WebDriver driver;
	private MovimentacaoPage movimentacaoPage;
	

	public MovimentacaoValidation(WebDriver driver) {
		this.driver = driver;
		this.movimentacaoPage = new MovimentacaoPage(this.driver);
		
	}
	public void movimentacaoContasValidation() {

		try {
			Assertions.assertTrue(movimentacaoPage.getCriarMovimentacao().isDisplayed());
			Report.log(Status.PASS, "Acessou a p�gina de movimentacao corretamente", Screenshot.captureBase64(driver));

		}catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}
}
