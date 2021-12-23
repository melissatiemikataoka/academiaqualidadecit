package screen;

import org.openqa.selenium.By;
import util.MetodosGenericosUteis;
import util.Utils;

public class ExcluirRepositorioScreen extends MetodosGenericosUteis {
    public void excluirRepositorio() throws InterruptedException {
        //webDriver = getWebDriver();
        //webDriver.findElement(By.id("settings-tab")).click();
        clicar(By.id("settings-tab"));
        Thread.sleep(2000);
        //webDriver.findElement(By.xpath("/html/body/div[6]/div/main/div[2]/div/div/div[2]/div/div/div/div[10]/ul/li[4]/details/summary")).click();
        clicar(By.xpath("/html/body/div[6]/div/main/div[2]/div/div/div[2]/div/div/div/div[10]/ul/li[4]/details/summary"));
        Thread.sleep(2000);
        //webDriver.findElement(By.xpath("//*[@id=\"options_bucket\"]/div[10]/ul/li[4]/details/details-dialog/div[3]/form/p/input")).sendKeys("melissatiemikataoka/Teste");
        digitar(By.xpath("//*[@id=\"options_bucket\"]/div[10]/ul/li[4]/details/details-dialog/div[3]/form/p/input"), "melissatiemikataoka/Teste");
        //webDriver.findElement(By.xpath("/html/body/div[6]/div/main/div[2]/div/div/div[2]/div/div/div/div[10]/ul/li[4]/details/details-dialog/div[3]/form/button")).click();
        clicar(By.xpath("/html/body/div[6]/div/main/div[2]/div/div/div[2]/div/div/div/div[10]/ul/li[4]/details/details-dialog/div[3]/form/button"));
        setWebDriver(webDriver);
    }
}
