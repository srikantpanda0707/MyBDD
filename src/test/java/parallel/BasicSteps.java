package parallel;

import Actions.BasicAction;
import Tools.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class BasicSteps {
    private final BasicAction ba = new BasicAction(BaseClass.getDriver());

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

    @Given("I click the check box option")
    public void iClickTheCheckBoxOption() {
        assertTrue(ba.ClickCheckBoxOptionBtn());
    }

    @When("I click the check box and verify in check box option")
    public void iClickTheCheckBoxAndVerifyInCheckBoxOption() {
        assertTrue(ba.ClickAndVerifyThecheckBoxOption());
    }

    @Given("I click the radio button demo option")
    public void iClickTheRadioButtonDemoOption() {
        assertTrue(ba.ClickRadioButtonOptionBtn());
    }

    @When("I check radio button demo and verify")
    public void iCheckRadioButtonDemoAndVerify() {
        assertTrue(ba.ClickRadioButtonandVerify());
    }

    @Then("I check group radio button and verify")
    public void iCheckGroupRadioButtonAndVerify() {
        assertTrue(ba.ClickGroupRadioButtonandVerify());
    }

    @Given("I click drop down demo option")
    public void iClickDropDownDemoOption() {
        assertTrue(ba.ClickDropDownOptionBtn());
    }

    @When("I Select a day from the dropdown and verify")
    public void iSelectADayFromTheDropdownAndVerify() {
        assertTrue(ba.SelectSingleDropDownAndVerify());

    }

    @Then("I check group dropdown selected")
    public void iCheckGroupDropdownSelected() {
        assertTrue(ba.SelectGroupDropDownAndVerify());
    }

    @Given("I click the js alert option")
    public void iClickTheJsAlertOption() {
        assertTrue(ba.ClickJSAlterOption());

    }

    @When("I Accept and dismiss the alert")
    public void iAcceptAndDismissTheAlert() {
        assertTrue(ba.AcceptandDismissAlertJSA());
    }

    @Then("I enter value and accept alert and verify the text displays")
    public void iEnterValueAndAcceptAlertAndVerifyTheTextDisplays() {
        assertTrue(ba.EntervalueAcceptAlert());
    }

    @And("I enter value and dismiss alert and verify text not displays")
    public void iEnterValueAndDismissAlertAndVerifyTextNotDisplays() {
        assertTrue(ba.EntervalueDismissAlert());
    }

    @Given("I click the Window popup modal option")
    public void iClickTheWindowPopupModalOption() {
        assertTrue(ba.ClickWindowPopupOption());
    }

    @When("I click the twiter pop and verify the window")
    public void iClickTheTwiterPopAndVerifyTheWindow() {
        assertTrue(ba.ClickTwiterPopAndVerify());
    }
}
