package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {

    @Given("I print Hello world")
    public void i_print_hello_world() {
        System.out.println("Hello world");
    }
    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("We are happy");
    }

    @Given("I run cucumber test")
    public void i_run_cucumber_test() {
        for (int i=0; i < 10; i++){
            System.out.println("Cucumber test");
        }
    }
    @Then("verify it is Cucumber")
    public void verify_it_is_cucumber() {
        for (int i =0; i< 7; i++){
            System.out.println("Gherkin test");
        }
    }


}
