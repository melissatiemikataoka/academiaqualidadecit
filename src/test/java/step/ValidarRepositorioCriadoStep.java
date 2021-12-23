package step;

import io.cucumber.java.pt.Então;

import org.junit.Assert;
import screen.ValidarRepositorioCriadoScreen;

public class ValidarRepositorioCriadoStep {

    @Então("validar repositorio criado com sucesso")
    public void ValidarRepositorioCriado() throws InterruptedException {
        ValidarRepositorioCriadoScreen validarRepositorioCriadoScreen = new ValidarRepositorioCriadoScreen();
        validarRepositorioCriadoScreen.validarRepositorioCriado();
        Assert.assertEquals(ValidarRepositorioCriadoScreen.validarRepositorioCriado(), "https://github.com/melissatiemikataoka/Teste");
    }
}
