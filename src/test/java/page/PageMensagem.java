package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageMensagem {
    private final WebDriver driver;

    //Construtor
    public PageMensagem(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    //Mapping mensagem
    @FindBy(how = How.XPATH, using = "//*[@id=\"logoutForm\"]/ul/li[5]/a")
    private WebElement moduloMensagem;

    @FindBy(how = How.XPATH, using = "//*[@id=\"logoutForm\"]/ul/li[5]/ul/li[1]/a")
    private WebElement enviarMensagem;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
    private WebElement campoDestinatarios;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/label[1]/input[1]")
    private WebElement destinatarioOtavioRocha;

    @FindBy(how = How.ID, using = "selDest")
    private WebElement clicarEmSelecionar;

    @FindBy(how = How.ID, using = "txtTitulo")
    private WebElement inserirTitulo;

    @FindBy(how = How.ID, using = "txtMensagem")
    private WebElement inserirMensagem;

    @FindBy(how = How.ID, using = "btnEnvio")
    private WebElement btnEnvio;


    //Actions mensagem
    public void clicarNoModuloMensagem(){moduloMensagem.click();}
    public void enviarMensagem(){enviarMensagem.click();}

    public void clicarNoCampoDestinatários(){campoDestinatarios.click();}

    public void escolherdestinatario(){destinatarioOtavioRocha.click();}

    public void clicarEmSelecionarDestinatario(){clicarEmSelecionar.click();}

    public void inserirTituloDaMensagem(String titulo){inserirTitulo.sendKeys(titulo);}

    public void inserirMensagem(String mensagem1){inserirMensagem.sendKeys(mensagem1);}

    public void clicarEnviarMensagem(){btnEnvio.click();}

}
