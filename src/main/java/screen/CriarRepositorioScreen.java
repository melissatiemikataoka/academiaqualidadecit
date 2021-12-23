package screen;

import org.openqa.selenium.By;
import util.Utils;

public class CriarRepositorioScreen extends Utils {

    public void criarRepositorio() throws InterruptedException {
        webDriver = getWebDriver();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[6]/div/aside/div[2]/div[1]/div/h2/a")).click();
        webDriver.findElement(By.id("repository_name")).click();
        webDriver.findElement(By.id("repository_name")).sendKeys("Teste");
        webDriver.findElement(By.id("repository_description")).sendKeys("Teste para criar repositorio");
        webDriver.findElement(By.id("repository_visibility_private")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[6]/main/div/form/div[4]/button")).click();
        Thread.sleep(3000);
        setWebDriver(webDriver);
    }
}
