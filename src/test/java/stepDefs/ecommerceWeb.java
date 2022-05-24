package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerceWeb {

    WebDriver driver;
    private WebDriverWait w;

    public <ScenarioContext> void StepDefinition(ScenarioContext scenarioContext)
    {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\ElizeReyes\\Documents\\chromedriver_win32");
        driver = new ChromeDriver(); //launches Chrome browser
        driver.get("https://www.edgewordstraining.co.uk/demo-site/my-account/");
    }


    @Given("these details")
    public void these_details(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Given("I am logged in")
    public void i_am_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I add an {string} into my cart")
    public void i_add_an_into_my_cart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("provide {string} discount code")
    public void provide_discount_code(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("my total should update correctly with a discount of {string}%")
    public void my_total_should_update_correctly_with_a_discount_of(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
