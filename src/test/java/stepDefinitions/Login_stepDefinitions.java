package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class Login_stepDefinitions {

    // A sample login test
    //Demo site - https://example.testproject.io/web/

    @Given("User is on login page")
    public void user_is_on_login_page() {

       //Driver.getDriver().get("https://example.testproject.io/web/");
    }

    LoginPage loginPage = new LoginPage();

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {

       // Driver.getDriver().findElement(By.id("name")).sendKeys("Zuura");
       // Driver.getDriver().findElement(By.id("password")).sendKeys("12345");

        loginPage.usernameInput.sendKeys("Zuura");
        loginPage.passwordInput.sendKeys("12345");
    }

    @When("User clicks Enter button")
    public void user_clicks_enter_button() {

       // Driver.getDriver().findElement(By.id("login")).click();

        loginPage.loginButton.click();
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {

        System.out.println("Title is = " + Driver.getDriver().getTitle());

        String expectedTitle = "TestProject Demo";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.equals(actualTitle));

        System.out.println("Verification Passed");
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {

       // Driver.getDriver().findElement(By.id("name")).sendKeys(username);
       // Driver.getDriver().findElement(By.id("password")).sendKeys(password);

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }

}
