package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.ContasPage;
import PageObjects.GenericPage;
import Validations.ContasValidation;
import Validations.GenericValidation;

public class ContasTask {
	private WebDriver driver;
    private ContasPage contasPage;
    private ContasValidation contasValidation;
   private GenericPage genericPage;
   private GenericValidation genericValidation;
    
    public ContasTask(WebDriver driver) {
        this.driver = driver;
        ContasPage contasPage = new ContasPage(this.driver);
        ContasValidation contasValidation = new ContasValidation(this.driver);
        GenericPage genericPage = new GenericPage(this.driver);
        GenericValidation genericValidation = new GenericValidation(driver);
    }
    public void criarConta() {
        genericPage.getBotaoContas().click();
        genericPage.getAdicionar().click();
        contasValidation.validationContasPage();
        contasPage.getNomeConta().sendKeys("Receita");
        contasPage.getBotaoSalvar().click();
       
    }
}
