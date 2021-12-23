package screen;

import org.openqa.selenium.By;
import util.Utils;

public class AcessarGitScreen extends Utils {

    public void acessarGit() throws InterruptedException {
        webDriver = getNavegador();
        webDriver.get("https://github.com/");
        /*webDriver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(5000);
        webDriver.findElement(By.id("login_field")).click();
        webDriver.findElement(By.id("login_field")).sendKeys("melissatiemikataoka");
        webDriver.findElement(By.id("password")).click();
        webDriver.findElement(By.id("password")).sendKeys("Keniti2908");
        webDriver.findElement(By.name("commit")).click();*/
        setWebDriver(webDriver);
    }
}
