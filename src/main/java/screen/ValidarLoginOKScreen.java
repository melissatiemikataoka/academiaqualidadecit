package screen;

import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Utils;

public class ValidarLoginOKScreen extends Utils {

    public static String validarLoginOK() throws InterruptedException {
        webDriver = getWebDriver();
        String msg = webDriver.findElement(By.xpath("/html/body/div[1]/header/div[3]/nav/a[2]")).getText();
        return msg;

    }
       // webDriver = getNavegador();
       //WebElement loginOK = webDriver.findElement();

}
