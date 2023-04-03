package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

import Framework.Browser.Waits;
import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import PageObjects.NovoUsuarioPage;
import Validations.LoginValidation;
import Validations.NovoUsuarioValidation;

public class NovoUsuarioTask {
	private WebDriver driver;
	private LoginPage loginPage;
	private LoginValidation loginValidation;
	private NovoUsuarioPage novoUsuarioPage;
	NovoUsuarioValidation novoUsuarioValidation;
	private Waits wait;
	FakersGeneration fakers = new FakersGeneration();

	public NovoUsuarioTask(WebDriver driver) {

		this.driver= driver;
		this.novoUsuarioValidation = new NovoUsuarioValidation(this.driver);
		this.novoUsuarioPage = new NovoUsuarioPage(this.driver);
		this.fakers = new FakersGeneration();
		this.wait = new Waits(this.driver);
	}

	public void IrPaginaNovoUsuario() {
		novoUsuarioValidation.validationUsuarioPage(); 
		WebElement element = novoUsuarioPage.getNovoUsuarioBotao();
		wait.loadElement(element);
		element.click();
	}
	public void CriarNovoUsuario() {
	
		String name = fakers.getNome();
		String email = fakers.getEmail();
		String senha = fakers.getSenha();
		FileOperation.setProperties("form", "name", name);
		FileOperation.setProperties("form", "email", email);
		FileOperation.setProperties("form", "senha", senha);   

		novoUsuarioValidation.validationUsuarioPage();              
		novoUsuarioPage.getNovoNomeUsuario().sendKeys(name);
		novoUsuarioPage.getNovoEmailUsuario().sendKeys(email);
		novoUsuarioPage.getNovaSenhaUsuario().sendKeys(senha);
		novoUsuarioPage.getBotaoCadastrar().click();
	}

}
