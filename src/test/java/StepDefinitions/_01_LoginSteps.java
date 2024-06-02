package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter valid username and password and click login button")
    public void enterValidUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.userName,"Student_6");
        dc.mySendKeys(dc.password,"S12345");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.welcomeText,"Welcome");
    }

    @When("Enter invalid username and password and click login button")
    public void enterInvalidUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.userName,"Student6");
        dc.mySendKeys(dc.password,"S12345");
        dc.myClick(dc.loginButton);
    }

    @Then("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        Tools.Wait(2);
        Assert.assertTrue(dc.loginButton.isEnabled());

    }
}
