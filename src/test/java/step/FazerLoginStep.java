package step;

import io.cucumber.java.pt.Quando;
import screen.FazerLoginScreen;
import util.Utils;

public class FazerLoginStep extends FazerLoginScreen {

    @Quando("clicar em Sign in inserindo um {string} e {string} válidos")
    public void FazerLogin(String email, String senha) throws InterruptedException{
        //FazerLoginScreen logarSiteGitScreen = new FazerLoginScreen();
        fazerLogin(email, senha);
    }
}
