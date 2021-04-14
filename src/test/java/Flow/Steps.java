package Flow;

import Actions.HomeAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.URL;

import static org.junit.Assert.assertTrue;

public class Steps {
private HomeAction Haction;
    @Given("I launch the browser")
    public void i_launch_the_browser() {
        assertTrue(Haction.LaunchChrome());
    }
    @When("I get the url")
    public void i_get_the_url() {
        assertTrue(Haction.GetID());
    }
    @Then("I verify the home page")
    public void i_verify_the_home_page() {
        assertTrue(Haction.VerifyHomeLogo());
    }
    @And("I close the browser")
    public void i_close_the_browser() {
        assertTrue(Haction.CloseChrome());
    }
}
