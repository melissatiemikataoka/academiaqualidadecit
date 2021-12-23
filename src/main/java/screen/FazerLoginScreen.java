package screen;

import org.openqa.selenium.By;
import util.MetodosGenericosUteis;
import util.Utils;

public class FazerLoginScreen extends MetodosGenericosUteis {
    public void fazerLogin(String email, String senha) throws InterruptedException{

        Thread.sleep(3000);
        clicar(By.linkText("Sign in"));
        Thread.sleep(3000);
        clicar(By.id("login_field"));
        digitar(By.id("login_field"), email);
        Thread.sleep(3000);
        clicar(By.id("password"));
        digitar(By.id("password"), senha);
        Thread.sleep(3000);
        clicar(By.name("commit"));
        //setWebDriver(webDriver);
    }


}
