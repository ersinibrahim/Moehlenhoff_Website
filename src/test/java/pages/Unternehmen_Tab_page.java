package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class Unternehmen_Tab_page extends Parent {

   public Unternehmen_Tab_page() {
       PageFactory.initElements(BaseDriver.getDriver(),this);
   }


    @FindBy(xpath = "//input[@id='menu-item-23']/parent::li/a")
    public WebElement unternehmenTab;


   @FindBy(xpath = "//input[@id='menu-item-23']/following-sibling::div/ul/li")
    public List<WebElement> unternehmen_Tab_list;


   @FindBy(className = "footer-socials-linked-in")
    public WebElement linkedInButton;



}
