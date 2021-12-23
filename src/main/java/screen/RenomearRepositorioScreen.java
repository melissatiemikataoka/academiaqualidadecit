package screen;

import org.openqa.selenium.By;
import util.MetodosGenericosUteis;
import util.Utils;

public class RenomearRepositorioScreen extends MetodosGenericosUteis {
    public void renomearRepositorio() throws InterruptedException {
        //webDriver = getWebDriver();
        Thread.sleep(3000);
        //webDriver.findElement(By.linkText("melissatiemikataoka/Teste")).click();
        clicar(By.linkText("melissatiemikataoka/Teste"));
        //webDriver.findElement(By.id("settings-tab")).click();
        clicar(By.id("settings-tab"));
        Thread.sleep(3000);
        //webDriver.findElement(By.id("rename-field")).sendKeys("Renomeado");
        digitar(By.id("rename-field"), "Renomeado");
        Thread.sleep(3000);
        //webDriver.findElement(By.xpath("/html/body/div[6]/div/main/div[2]/div/div/div[2]/div/div/div/form[1]/button")).click();
        clicar(By.xpath("/html/body/div[6]/div/main/div[2]/div/div/div[2]/div/div/div/form[1]/button"));
    }

}
