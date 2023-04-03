package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.MovimentacaoPage;
import Validations.MovimentacaoValidation;

public class MovimentacaoTask {
	private WebDriver driver;
    private MovimentacaoPage movimentacaoPage;
    private MovimentacaoValidation movimentacaoValidation;
    
    public MovimentacaoTask(WebDriver driver) {
        this.driver=driver;
       this.movimentacaoPage = new MovimentacaoPage(this.driver);
        this.movimentacaoValidation = new MovimentacaoValidation(this.driver);
    }
        public void criarMovimentacao() {
            movimentacaoValidation.movimentacaoContasValidation();
            movimentacaoPage.getCriarMovimentacao().click();
            movimentacaoPage.getMovimentacao().sendKeys("Receita");
            movimentacaoPage.getDataMovimentacao().sendKeys("12/03/2023");
            movimentacaoPage.getDataPagamento().sendKeys("12/03/2023");
            movimentacaoPage.getDescricao().sendKeys("Receita");
            movimentacaoPage.getInteressado().sendKeys("pedro");
            movimentacaoPage.getValor().sendKeys("100");
            movimentacaoPage.getConta().sendKeys("Receita");
            movimentacaoPage.getSituacaoPendente().click();
            movimentacaoPage.getSalvarBotao().click();
        }
            
}
