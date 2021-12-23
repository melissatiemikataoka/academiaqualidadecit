package step;

import io.cucumber.java.pt.Então;
import org.junit.Assert;
import screen.ValidarRepositorioCriadoScreen;
import screen.ValidarRepositorioRenomeadoScreen;

public class ValidarRepositorioRenomeadoStep {
    @Então("Então validar repositório renomeado com novo nome")
    public void ValidarRepositorioRenomeado() throws InterruptedException{
        ValidarRepositorioRenomeadoScreen validarRepositorioRenomeadoScreen = new ValidarRepositorioRenomeadoScreen();
        validarRepositorioRenomeadoScreen.validarRepositorioRenomeado();
        Assert.assertEquals(ValidarRepositorioRenomeadoScreen.validarRepositorioRenomeado(), "https://github.com/melissatiemikataoka/TesteRenomeado");
    }
    }

}
