package parallel;

import Actions.BasicAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class BasicSteps {
    BasicAction ba = new BasicAction();

    @Given("I verify selenium easy page opens")
    public void i_verify_selenium_easy_page_opens() {
        assertTrue(ba.VerifySeleniumEasyDisplays());

    }


    @When("I click demo home button selenium easy page")
    public void iClickDemoHomeButtonSeleniumEasyPage() {
        assertTrue(ba.ClickDemoHomeBtn());
    }

    @Then("I verify the home demo page displays")
    public void iVerifyTheHomeDemoPageDisplays() {
        assertTrue(ba.VerifyDemoHomePageDisplays());
    }

    @And("I click start practice")
    public void iClickStartPractice() {
        assertTrue(ba.ClickStartPracticeBtn());
    }

    @Given("I clicked the sample form demo option")
    public void iClickedTheSampleFormDemoOption() {
        assertTrue(ba.ClickSimpleFormDemoBtn());
    }

    @When("I enter Valid Message In the simple input text box")
    public void iEnterValidMessageInTheSimpleInputTextBox() {
        assertTrue(ba.EnterMessageSimpleInputTxtBox());
    }

    @Then("I verify the entered message displays")
    public void iVerifyTheEnteredMessageDisplays() {
        assertTrue(ba.VerifyMessageDisplaysSFD());
    }

    @When("I Enter Two input details")
    public void iEnterTwoInputDetails() {
        assertTrue(ba.EnterValueIntwoInputTxtBox());
    }

    @Then("I verify the added details displays")
    public void iVerifyTheAddedDetailsDisplays() {
        assertTrue(ba.VerifyGetTotalDisplaysSFD());
    }
}
