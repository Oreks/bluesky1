package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginsteps {
    @Given("^That I navigate to the giftrete website$")
    public void thatINavigateToTheGiftreteWebsite() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String webpage = "https://dev.giftrt.com";
        driver.get(webpage);

        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I click on login$")
    public void iClickOnLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter the email address$")
    public void iEnterTheEmailAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter the password$")
    public void iEnterThePassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter the invalid email address$")
    public void iEnterTheInvalidEmailAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I enter the invalid password$")
    public void iEnterTheInvalidPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
