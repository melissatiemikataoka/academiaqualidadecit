package step;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import screen.AcessarGitScreen;


public class AcessarGitStep extends AcessarGitScreen{

    @Dado("que acesso o site do Git")
    public void AcessarSiteGit() throws InterruptedException{
        AcessarGitScreen abrirSiteGitScreen = new AcessarGitScreen();
        abrirSiteGitScreen.acessarGit();
    }


}
