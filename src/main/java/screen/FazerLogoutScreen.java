package screen;

import org.openqa.selenium.By;
import util.MetodosGenericosUteis;
import util.Utils;

public class FazerLogoutScreen extends MetodosGenericosUteis {
    public void fazerLogout () {

        //webDriver = getWebDriver();
        //webDriver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary/img")).click();
        clicar(By.xpath("/html/body/div[1]/header/div[7]/details/summary/img"));
        //setWebDriver(webDriver);
    }
}
