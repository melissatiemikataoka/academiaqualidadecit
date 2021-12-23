package screen;

import util.MetodosGenericosUteis;
import util.Utils;

public class ValidarRepositorioRenomeadoScreen extends Utils {
    public String validarRepositorioRenomeado() throws InterruptedException {
    webDriver = getWebdriver();
    String linkRenomeado = webDriver.getCurrentUrl();
    return linkRenomeado;

}
