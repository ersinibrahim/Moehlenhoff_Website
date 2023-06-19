package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Unternehmen_Tab_page;
import utilities.BaseDriver;

public class Newunternehmen_Tab_Steps {

    Unternehmen_Tab_page unternehmen_tab_page;
    WebDriver driver= BaseDriver.getDriver();

    @Given("Navigate to Moehlenhoff Website")
    public void navigateToMoehlenhoffWebsite() {

        driver.get("https://www.moehlenhoff.de/");
        driver.manage().window().maximize();

    }

    @When("Hold Unternehmen_Tab and Click Nachhaltigkeit_Tab")
    public void holdUnternehmen_TabAndClickNachhaltigkeit_Tab() {

        unternehmen_tab_page.clickFunction(unternehmen_tab_page.unternehmenTab);
        unternehmen_tab_page.clickFunction(unternehmen_tab_page.unternehmen_Tab_list.get(3));
    }

    String linkedInUrl;
    @Then("Click LinkedIn")
    public void clickLinkedIn() {
        linkedInUrl = unternehmen_tab_page.linkedInButton.getAttribute("href");

        unternehmen_tab_page.scrollToElement(unternehmen_tab_page.linkedInButton);
        unternehmen_tab_page.clickFunction(unternehmen_tab_page.linkedInButton);

    }

    @Then("Control Page URL")
    public void controlPageURL() {

        String pageUrl= driver.getCurrentUrl();

        Assert.assertEquals(linkedInUrl,pageUrl);
    }
}
