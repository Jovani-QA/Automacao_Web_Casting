package tests;

import config.config_Web;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.PageLogin;
import page.PageMensagem;

public class TesteMensagem {
    private WebDriver driver;

    @Before
    public void criarDriver() {
        config_Web webdriver = new config_Web();
        driver = webdriver.WebDriver();
    }

    @Test
    public void enviarmensagem() {

        PageLogin pageLogin = new PageLogin(driver);
        PageMensagem pageMensagem = new PageMensagem(driver);

        String email     = "db106@cstng.com";
        String senha     = "cst0962";
        String titulo    = "Meta atingida, parabéns a todos!";
        String mensagem1 = "Parabéns pessoal, atingimos as metas! Teremos uma comemoração no setor para brindar essa conquista.";
        String mensagem2 = "Infelizmente não atingimos a meta!";
        String mensagem3 = "Aviso: Reunião marcada a para dia 25/07/2023";

        pageLogin.preencherEmail(email);
        pageLogin.preencherSenha(senha);
        pageLogin.clicarEmEntrar();
        pageMensagem.clicarNoModuloMensagem();
        pageMensagem.enviarMensagem();
        pageMensagem.clicarNoCampoDestinatários();
        pageMensagem.escolherdestinatario();
        pageMensagem.clicarEmSelecionarDestinatario();
        pageMensagem.inserirTituloDaMensagem(titulo);
        pageMensagem.inserirMensagem(mensagem2);
        pageMensagem.clicarEnviarMensagem();
    }
}
