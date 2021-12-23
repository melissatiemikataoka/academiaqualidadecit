package step;

import io.cucumber.java.pt.Então;
import screen.FecharNavegadorScreen;

public class FecharNavegadorStep {

    @Então("fechar navegador")
    public void fecharNavegador() {
        FecharNavegadorScreen fecharNavegadorScreen = new FecharNavegadorScreen();
        fecharNavegadorScreen.fecharNavegador();
    }
}

