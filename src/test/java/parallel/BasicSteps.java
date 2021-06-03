package parallel;

import Actions.BasicAction;
import Actions.HomeAction;
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
}
