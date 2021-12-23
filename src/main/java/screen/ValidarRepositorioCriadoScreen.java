package screen;

import util.Utils;

public class ValidarRepositorioCriadoScreen extends Utils {

    public String validarRepositorioCriado() throws InterruptedException {
        webDriver = getWebDriver();
//		WebElement link = webDriver.findElement(By.id("empty-setup-clone-url"));
        Thread.sleep(0);
        String link = webDriver.getCurrentUrl();
        return link;
    }
}
