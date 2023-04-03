package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.FinishPage;
import Report.Report;
import Report.Screenshot;

public class FinishValidation {
	private WebDriver driver;
	private FinishPage finishPage;

	public FinishValidation(WebDriver driver) {
		this.driver = driver;
		this.finishPage = new FinishPage(driver);
	}
	public void validationContasPage() {

		try {

			Assertions.assertTrue(finishPage.getLogoText().isDisplayed());
			Report.log(Status.PASS, "Acessou a p�gina de Login corretamente", Screenshot.captureBase64(driver));

		}catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}
}
