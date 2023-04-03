package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.MovimentacaoDespesaPage;
import PageObjects.MovimentacaoPage;
import Validations.MovimentacaoDespesaValidation;
import Validations.MovimentacaoValidation;

public class MovimentacaoDespesaTask {
    private WebDriver driver;
    private MovimentacaoDespesaPage movimentacaoDespesaPage;
    private MovimentacaoDespesaValidation movimentacaoDespesaValidation;
    
    public MovimentacaoDespesaTask(WebDriver driver) {
        this.driver=driver;
       this.movimentacaoDespesaPage = new MovimentacaoDespesaPage(this.driver);
        this.movimentacaoDespesaValidation = new MovimentacaoDespesaValidation(this.driver);
    }
        public void criarMovimentacaoDespesa() {
            movimentacaoDespesaValidation.movimentacaoContasDespesaValidation();
            movimentacaoDespesaPage.getCriarMovimentacao().click();
            movimentacaoDespesaPage.getMovimentacao().sendKeys("Despesa");
            movimentacaoDespesaPage.getDataMovimentacao().sendKeys("12/03/2023");
            movimentacaoDespesaPage.getDataPagamento().sendKeys("12/03/2023");
            movimentacaoDespesaPage.getDescricao().sendKeys("Despesa");
            movimentacaoDespesaPage.getInteressado().sendKeys("pedro");
            movimentacaoDespesaPage.getValor().sendKeys("100");
            movimentacaoDespesaPage.getConta().sendKeys("Despesa");
            movimentacaoDespesaPage.getSituacaoPago().click();
            movimentacaoDespesaPage.getSalvarBotao().click();
        }
}
