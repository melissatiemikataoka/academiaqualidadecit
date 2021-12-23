package step;

import io.cucumber.java.pt.Então;
import org.junit.Assert;
import screen.ValidarLoginOKScreen;
import util.Utils;

import static org.junit.Assert.assertEquals;

public class ValidarLoginOKStep extends Utils {
    @Então("estará logado na conta do Git")
    public void validarLoginOK() throws InterruptedException {
        ValidarLoginOKScreen validarLoginOKScreen = new ValidarLoginOKScreen();
        Assert.assertEquals(ValidarLoginOKScreen.validarLoginOK(), "Pull requests");

    }
}
