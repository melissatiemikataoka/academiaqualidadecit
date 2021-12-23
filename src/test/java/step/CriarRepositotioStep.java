package step;

import io.cucumber.java.pt.E;
import screen.CriarRepositorioScreen;

public class CriarRepositotioStep {

    @E("criar um repositorio")
    public void criarRepositorio() throws InterruptedException {
        CriarRepositorioScreen criarRepositorioScreen = new CriarRepositorioScreen();
        criarRepositorioScreen.criarRepositorio();
    }
}
