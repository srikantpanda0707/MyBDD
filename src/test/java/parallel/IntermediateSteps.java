package parallel;


import Actions.IntermediateAction;
import io.cucumber.java.en.Given;

import static org.junit.Assert.assertTrue;

public class IntermediateSteps {
    IntermediateAction IA = new IntermediateAction();

    @Given("I click the input form option from input form drop down")
    public void i_click_the_input_form_option_from_input_form_drop_down() {
        assertTrue(IA.SelectInputFormOption());
    }
}
