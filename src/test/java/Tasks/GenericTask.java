package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.GenericPage;
import PageObjects.LoginPage;
import Validations.GenericValidation;
import Validations.LoginValidation;

public class GenericTask {
    private WebDriver driver;
    private GenericPage genericPage;
    private GenericValidation genericValidation;


    public GenericTask(WebDriver driver) {

        this.driver= driver;
        genericPage = new GenericPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
    }
    public void CriarConta() {
        genericValidation.validationGenericPage();
        genericPage.getBotaoContas().click();
        genericPage.getAdicionar().click();
        genericPage.getAdicionarNome().sendKeys("Receita");
        genericPage.getBotaoSalvarConta().click();
        genericPage.getBotaoContas().click();
        genericPage.getAdicionar().click();
        genericPage.getAdicionarNome().sendKeys("Despesa");
        genericPage.getBotaoSalvarConta().click();
    }
}


