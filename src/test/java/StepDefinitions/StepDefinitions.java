package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import Pages.SearchPage;
import Setup.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions extends Setup {
    SearchPage searchPage;

    @Given("Guest visit the github website")
    public void visit_github_page() {
        driver.get("https://github.com/");
    }

    @When("Guest search with {string}")
    public void search_react_app(String searchInput) throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchPage.doSearch(searchInput);
        Thread.sleep(3000);
    }

    @Then("Guest verify the {string}")
    public void verify_facebook_react_app(String verifyOutput) {
        String searchActual = searchPage.searchResult.get(8).getText();
        Assert.assertTrue(searchActual.contains(verifyOutput));
    }

    @And("Guest click on the github About page")
    public void click_on_about_page() throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchPage.clickAboutPage();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));
    }
   @After()
   public void tearDown() {
       driver.quit();
   }
}
