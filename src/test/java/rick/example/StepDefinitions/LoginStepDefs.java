package rick.example.StepDefinitions;

import rick.example.BaseClass;
import rick.example.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class LoginStepDefs extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
       closeDriver();
    }

    @Given("Launch Application")
    public void openApplication() {
        navigateToHome();

    }
    @Given("User opens login page")
    public void userOpensLoginPage() {
        LoginPage.navigateToLoginPage();
    }
}
