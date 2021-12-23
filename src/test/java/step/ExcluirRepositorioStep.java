package step;

import io.cucumber.java.pt.Então;
import screen.ExcluirRepositorioScreen;

public class ExcluirRepositorioStep {
    @Então("excluir um repositório")
    public void excluirRepositorio() throws InterruptedException {
        ExcluirRepositorioScreen excluirRepositorioScreen = new ExcluirRepositorioScreen();
        excluirRepositorioScreen.excluirRepositorio();
    }
}
