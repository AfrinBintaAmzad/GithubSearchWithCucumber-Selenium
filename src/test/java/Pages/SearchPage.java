package Pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    @FindBy(className = "form-control")
    public List<WebElement> searchBar;
    @FindBy(className = "v-align-middle")
    public List<WebElement> searchResult;
    @FindBy(tagName = "a")
    public List<WebElement> aboutBtn;


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void doSearch(String searchInput) throws InterruptedException {
        searchBar.get(0).sendKeys(searchInput);
        searchBar.get(0).sendKeys(Keys.ENTER);
    }

    public void clickAboutPage(){
        aboutBtn.get(186).click();
    }
}
