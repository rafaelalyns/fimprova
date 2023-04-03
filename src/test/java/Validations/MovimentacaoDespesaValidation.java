package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.MovimentacaoDespesaPage;
import PageObjects.MovimentacaoPage;
import Report.Report;
import Report.Screenshot;

public class MovimentacaoDespesaValidation {
    private WebDriver driver;
    private MovimentacaoDespesaPage movimentacaoDespesaPage;
    
    

    public MovimentacaoDespesaValidation(WebDriver driver) {
        this.driver = driver;
        this.movimentacaoDespesaPage = new MovimentacaoDespesaPage(this.driver);
        
    }
    public void movimentacaoContasDespesaValidation() {

        try {
            Assertions.assertTrue(movimentacaoDespesaPage.getCriarMovimentacao().isDisplayed());
            Report.log(Status.PASS, "Acessou a p�gina de movimentacao corretamente", Screenshot.captureBase64(driver));

        }catch (Exception e) {

            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
