package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registrationsteps {
    @Given("^I navigate to the giftrete site$")
    public void iNavigateToTheGiftreteSite() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://dev.giftrt.com");


        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I click on registration button$")
    public void iClickOnRegistrationButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter first name$")
    public void iEnterFirstName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter last name$")
    public void iEnterLastName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter a valid email$")
    public void iEnterAValidEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter confirm password$")
    public void iEnterConfirmPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on the sign up Button$")
    public void iClickOnTheSignUpButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be able to registered$")
    public void iShouldBeAbleToRegistered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter an invalid email$")
    public void iEnterAnInvalidEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
