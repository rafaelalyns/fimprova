package TestCases;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Browser.Waits;
import Report.Report;
import Report.ReportType;
import Report.Screenshot;
import Tasks.ContasDespesaTask;
import Tasks.ContasTask;
import Tasks.FinishTask;
import Tasks.GenericTask;
import Tasks.LoginTask;
import Tasks.MovimentacaoDespesaTask;
import Tasks.MovimentacaoTask;
import Tasks.NovoUsuarioTask;
import Tasks.ResumoTask;



public class RealizarCompraComSucessoTest extends TestBase{

    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    NovoUsuarioTask novoUsuarioTask = new NovoUsuarioTask(driver);
    GenericTask genericTask = new GenericTask(driver);
    MovimentacaoTask movimentacaoTask = new MovimentacaoTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    ResumoTask resumoTask = new ResumoTask(driver);
    MovimentacaoDespesaTask movimentacaoDespesaTask = new MovimentacaoDespesaTask(driver);
    ContasTask contasTask = new ContasTask(driver);
    ContasDespesaTask contasDespesaTask = new ContasDespesaTask(driver);
    @Test
    public void realizarMovimentacao() {
        try {
            Report.createTest("Realizar Movimentacao com Sucesso", ReportType.SINGLE);
            novoUsuarioTask.IrPaginaNovoUsuario();
            novoUsuarioTask.CriarNovoUsuario();
            loginTask.efetuarLogin();
            genericTask.CriarConta();
            movimentacaoTask.criarMovimentacao();
            movimentacaoDespesaTask.criarMovimentacaoDespesa();
            resumoTask.ConferirResumo();
            finishTask.Sair();

        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));

        }


    }
}
