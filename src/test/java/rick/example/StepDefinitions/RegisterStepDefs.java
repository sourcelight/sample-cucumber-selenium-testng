package rick.example.StepDefinitions;

import rick.example.RegisterPage;
import io.cucumber.java.en.Given;

public class RegisterStepDefs {

    @Given("User opens registration page")
    public void userOpensRegistrationPage() {
        RegisterPage.navigateToRegisterPage();
    }
}
