package Flow;

import Actions.HomeAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertTrue;

public class Steps {
    HomeAction hm = new HomeAction();

    @Given("I enter valid ID")
    public void iEnterValidID(){
        assertTrue(hm.EnterMailIdLogin());
    }

    @When("I click submit button")
    public void iClickSubmitButton() {
        assertTrue(hm.ClickLoginBtn());
    }

    @Then("I verify the home page")
    public void iVerifyTheHomePage() {
        assertTrue(hm.VerifyHomePageDisplays());
    }

    @And("I verify the validity")
    public void iVerifyTheValidity() {
        assertTrue(hm.ClickLogOutBtn());
    }
}
