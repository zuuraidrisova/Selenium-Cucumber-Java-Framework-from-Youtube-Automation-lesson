package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {

    /*
    What are HOOKS?
Blocks of code that runs before OR after each scenario
Hooks in Cucumber are like Listeners in TestNG
Can define hooks by using annotations @Before  @After import from io.cucumber
Scenario Hooks - runs before and after each scenario
    When to use HOOKS?
Whenever you have some common setup and teardown actions to be executed
before each scenario
     */
    @Before
    public void setUp(){

        Driver.getDriver().get("https://example.testproject.io/web/");

    }

    @After
    public void tearDown() throws InterruptedException{

        Thread.sleep(2000);

        Driver.closeDriver();

    }

    /*
    What is Background in Feature file?
A Step or a group of steps that are common to all the scenarios in a feature
Is defined once in the feature
Runs before every scenario of the feature

    Why use Background?
To avoid repeating the common steps in every scenario
For better readability & maintenance
Unlike hooks, background is visible to the readers of the feature file

    When to use Background?
Whenever there are common repeating steps in a feature
When you want the common steps to be visible to the readers
     */

}
