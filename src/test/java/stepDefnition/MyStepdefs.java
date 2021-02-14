package stepDefnition;

import Utilities.Utilities;
import io.cucumber.java.en.Given;

import java.net.MalformedURLException;

public class MyStepdefs {
    Utilities utilities;
    @Given("User launches general store app")
    public void userLaunchesGeneralStoreApp() throws MalformedURLException {
        utilities=new Utilities();
        utilities.launchApp();
    }
}
