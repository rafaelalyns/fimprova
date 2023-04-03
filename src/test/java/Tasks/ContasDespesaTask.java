package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.ContasDespesaPage;
import PageObjects.ContasPage;
import PageObjects.GenericPage;
import Validations.ContasDespesaValidation;
import Validations.ContasValidation;

public class ContasDespesaTask {
    private WebDriver driver;
    private ContasDespesaPage contasDespesaPage;
    private ContasDespesaValidation contasDespesaValidation;
   private GenericPage genericPage;
    
    public ContasDespesaTask(WebDriver driver) {
        this.driver = driver;
        ContasDespesaPage contasDespesaPage = new ContasDespesaPage(this.driver);
        ContasValidation contasValidation = new ContasValidation(this.driver);
        GenericPage genericPage = new GenericPage(this.driver);
    }
    public void criarContaDespesa() {
        contasDespesaValidation.validationContasDespesaPage();
        genericPage.getBotaoContas().click();
        genericPage.getAdicionar().click();
        contasDespesaPage.getNomeConta().sendKeys("Despesa");
        contasDespesaPage.getBotaoSalvar().click();
       genericPage.getCriarMovimentacao().click();
    }
}
