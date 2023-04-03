package Tasks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Report.Report;
import Report.Screenshot;
import Validations.LoginValidation;

public class LoginTask {

	private WebDriver driver;
	private LoginPage loginPage;
	private LoginValidation loginValidation;

	public LoginTask(WebDriver driver) {

		this.driver= driver;
		loginPage = new LoginPage(this.driver);
		loginValidation = new LoginValidation(this.driver);
	}

	public void efetuarLogin() {
		
		loginValidation.validationLoginPage();
		loginPage.getSuccesfulRegistrationText();
		
		Properties props = FileOperation.getProperties("form");
		String email = props.getProperty("email");
		String senha = props.getProperty("senha");
		
		Report.log(Status.INFO, "Email: " + email + " Senha: " + senha);
		
		loginPage.getEmailInput().sendKeys(email);
		loginPage.getPasswordInput().sendKeys(senha);
		loginPage.getEnterButton().click();
		
	}
}



