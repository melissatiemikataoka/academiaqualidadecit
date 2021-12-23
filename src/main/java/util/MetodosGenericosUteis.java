package util;

import org.openqa.selenium.By;

public class MetodosGenericosUteis extends Utils{

    public void clicar(By elemento){
        webDriver = getWebDriver();
        webDriver.findElement(elemento).click();
        setWebDriver(webDriver);
    }

    public void digitar(By elemento, String texto) {
        webDriver = getWebDriver();
        webDriver.findElement(elemento).sendKeys(texto);
        setWebDriver(webDriver);
    }
}
