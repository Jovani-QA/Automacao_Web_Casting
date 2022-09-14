package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageMetas {
    private final WebDriver driver;

    //Construtor
    public PageMetas(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
