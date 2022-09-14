package tests;

import config.config_Web;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.PageLogin;

public class TestesLogin {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        config_Web webdriver = new config_Web();
        driver = webdriver.WebDriver();
    }

    @Test
    public void loginVálido(){
        String email = "db106@cstng.com";
        String senha = "cst0962";

        PageLogin pageLogin = new PageLogin(driver);

        pageLogin.preencherEmail(email);
        pageLogin.preencherSenha(senha);
        pageLogin.clicarEmEntrar();

    }
}
