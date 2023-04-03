package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.ContasDespesaPage;
import PageObjects.ContasPage;
import Report.Report;
import Report.Screenshot;

public class ContasDespesaValidation {
    private WebDriver driver;
    private ContasDespesaPage contasDespesaPage;
       
       public ContasDespesaValidation(WebDriver driver) {
           this.driver = driver;
           this.contasDespesaPage = new ContasDespesaPage(this.driver);
       }
   public void validationContasDespesaPage() {
           
           try {
               
               Assertions.assertTrue(contasDespesaPage.getLogoText().isDisplayed());
               Report.log(Status.PASS, "Acessou a pagina de Contas corretamente", Screenshot.captureBase64(driver));
               
           }catch (Exception e) {
               
               Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
           }
   }

}
