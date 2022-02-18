package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC2_LoginPage {

    public TC2_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginYourAccountText;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "(//p)[1]")
    public WebElement negativeLoginText;
}
