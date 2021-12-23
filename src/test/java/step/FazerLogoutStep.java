package step;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import screen.FazerLogoutScreen;

public class FazerLogoutStep {
    @Então("fazer logout")
    public void fazerLogout() {
        FazerLogoutScreen fazerLogoutScreen = new FazerLogoutScreen();
        fazerLogoutScreen.fazerLogout();

    }

}
