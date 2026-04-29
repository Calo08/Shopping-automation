
package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    WebDriver driver;

    @Given("User is on login page")
    public void setup() {
        BaseClass.setup();
        driver = BaseClass.driver;
    }

    @Then("Order should be placed successfully")
    public void success() {
        System.out.println("Order placed!");
    }
}
