package step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Amazon.CareerPage;
import pages.Amazon.HomePage;

import static org.testng.Assert.assertTrue;

public class StepDef {
    private WebDriver driver;
    protected HomePage homePage;
    protected CareerPage cp;

    @Given("User is on Home page")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/-/en/");
        homePage = new HomePage(driver);
        throw new io.cucumber.java.PendingException();
    }

    @When("User Navigate to Careers Page")
    public void user_navigate_to_careers_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        CareerPage cp = homePage.displayCareerPage();
        Thread.sleep(2000);
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters job name")
    public void user_enters_job_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cp.sendJobName("Automation Engineer");
        Thread.sleep(2000);
        throw new io.cucumber.java.PendingException();
    }

    @Then("Jobs available are displayed Successfully")
    public void jobs_available_are_displayed_successfully() {
        // Write code here that turns the phrase above into concrete actions
            assertTrue( cp.getJobName(1).contains("Automation"));

        throw new io.cucumber.java.PendingException();
    }



}
