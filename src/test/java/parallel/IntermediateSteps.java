package parallel;


import Actions.IntermediateAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class IntermediateSteps {
    IntermediateAction IA = new IntermediateAction();

    @Given("I click the input form option from input form drop down")
    public void i_click_the_input_form_option_from_input_form_drop_down() {
        assertTrue(IA.SelectInputFormOption());
    }

    @When("I Enter valid input form and verify the status")
    public void iEnterValidInputFormAndVerifyTheStatus() {
        assertTrue(IA.EnterInputFormAndVerify());
    }

    @Then("I Verify the form sent")
    public void iVerifyTheFormSent() {
        assertTrue(IA.VerifyFormSentIFS());
    }

    @Given("I click the Ajax form submit from input drop down")
    public void iClickTheAjaxFormSubmitFromInputDropDown() {
        assertTrue(IA.SelectAjaxFormOption());
    }

    @When("I Verify the mandatory field with empty text")
    public void iVerifyTheMandatoryFieldWithEmptyText() {
        assertTrue(IA.VerifyMaditoryFieldByEmptyText());
    }

    @Then("I enter valid input in ajax form and send request")
    public void iEnterValidInputInAjaxFormAndSendRequest() {
        assertTrue(IA.EnterValdTextAndVerify());
    }

    @And("I verify the ajax successful message")
    public void iVerifyTheAjaxSuccessfulMessage() {
        assertTrue(IA.VerifytheSuccessmessage());
    }
}
