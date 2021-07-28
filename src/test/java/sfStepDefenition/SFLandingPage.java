package sfStepDefenition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sfConfig.BaseClass;

public class SFLandingPage {
public BaseClass getdriver = new BaseClass();
static WebDriver driver;
	@Given("^Launch the browser in (.*)$")
	public void Launch_the_browser(String driverMode) throws Exception{
		driver = getdriver.driverConfig(driverMode);
		driver.get("https://scriptureforge.org");
	}
	
	@When("Navigate to the SF landing page")
    public void navigate_to_the_sf_landing_page() {
        driver.get("https://scriptureforge.org");
    }

    @Then("Verify the header components")
    public void verify_the_header_components() {
        boolean isLogoAvailable = driver.findElement(By.xpath("//img[@alt='Scripture Forge']")).isDisplayed();
        Assert.assertEquals(true,isLogoAvailable);
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
