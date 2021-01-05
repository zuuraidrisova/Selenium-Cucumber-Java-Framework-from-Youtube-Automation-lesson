package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;


public class GoogleSearch_stepDefinitions {

    @Given("User is on google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @Given("User enters a text in google search box")
    public void user_enters_a_text_in_google_search_box() {

        Driver.getDriver().findElement(By.name("q")).sendKeys("Automation Step by Step");

    }
    @Given("User hits Enter")
    public void user_hits_enter() {

        Driver.getDriver().findElement(By.name("q")).sendKeys( Keys.ENTER);

    }
    @Then("User is navigated to the search result page")
    public void user_is_navigated_to_the_search_result_page() {

        System.out.println("title is = " + Driver.getDriver().getTitle());

    }


}
