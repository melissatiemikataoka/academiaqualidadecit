package screen;

import util.Utils;

public class FecharNavegadorScreen extends Utils {
    public void fecharNavegador() {
        webDriver = getWebDriver();
        webDriver.quit();
    }
}
