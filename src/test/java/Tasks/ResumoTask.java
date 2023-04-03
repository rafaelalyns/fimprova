package Tasks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Utils.FileOperation;
import PageObjects.ResumoPage;
import Report.Report;
import Validations.ResumoValidation;


public class ResumoTask {
	private WebDriver driver;
	private ResumoPage resumoPage;
	private ResumoValidation resumoValidation;

	public ResumoTask(WebDriver driver) {

		this.driver= driver;
		this.resumoPage = new ResumoPage(this.driver);
		this.resumoValidation = new ResumoValidation(this.driver);
	}

	public void ConferirResumo() {
		
		resumoValidation.validationResumoPage();
		resumoPage.getResumoMensal().click();
		resumoPage.botaoBuscar().click();
		
		
		
	}
}
