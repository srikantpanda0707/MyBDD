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

    @And("I click mini statement tab")
    public void iClickMiniStatementTab() {
        assertTrue(hm.ClickMiniStatBtn());
    }

    @Then("I select the statement number from the document")
    public void iSelectTheStatementNumberFromTheDocument() {
        assertTrue(hm.SelectStatementNum());
    }

    @And("I click submit button in mini statement form window")
    public void iClickSubmitButtonInMiniStatementFormWindow() {
        assertTrue(hm.ClickSubmitMSF());
    }

    @And("Verify the statement displays")
    public void verifyTheStatementDisplays() {
        assertTrue(hm.VerifyStatementDisplays());
    }

    @And("I click log out button")
    public void iClickLogOutButton() {
        assertTrue(hm.ClickLogOutBtn());
    }

    @Then("I click continue button in statement window")
    public void iClickContinueButtonInStatementWindow() {
        assertTrue(hm.ClickContinueButton());
    }
}
