package step;

import io.cucumber.java.pt.E;
import screen.ExcluirRepositorioScreen;
import screen.RenomearRepositorioScreen;

public class RenomearRepositorioStep {
    @E("renomear repositório")
    public void RenomearRepositorio() throws InterruptedException {
        RenomearRepositorioScreen renomearRepositorioScreen = new RenomearRepositorioScreen();
        renomearRepositorioScreen.renomearRepositorio();
    }
}
