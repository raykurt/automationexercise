package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TC6_ContactUsForm;
import utilities.Driver;
import utilities.ReusableMethods;

public class ContactusStepDefs {

    TC6_ContactUsForm contactUsForm=new TC6_ContactUsForm();

    @When("user clicks contact us button")
    public void user_clicks_contact_us_button() {

        contactUsForm.contactUsButton.click();
    }

    @And("user verifies get in touch text is visible")
    public void userVerifiesGetInTouchTextIsVisible() {

        Assert.assertTrue(contactUsForm.getInTouchText.isDisplayed());
    }

    @And("user enters name, email and subject")
    public void userEntersNameEmailAndSubject() {

        Driver.waitAndSendText(contactUsForm.nameText,"ozkan" );
        Driver.waitAndSendText(contactUsForm.emailBox,"ozkan@gmail.com");
        Driver.waitAndSendText(contactUsForm.subjectBox, "return");
        Driver.waitAndSendText(contactUsForm.messageBox, "Hello world");

    }

    @And("user uploads file")
    public void userUploadsFile() {

        //contactUsForm.uploadFile.click();
        String pathOfImage = System.getProperty("user.home")+"/Desktop/Book1.xlsx";
        Driver.waitAndSendText(contactUsForm.uploadFile, pathOfImage);

    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {

        contactUsForm.submitFile.click();

    }

    @And("user clicks on OK button")
    public void userClicksOnOKButton() throws InterruptedException {

        Thread.sleep(3000);
        Alert i = Driver.getDriver().switchTo().alert();
        i.accept();
        Thread.sleep(2000);
        contactUsForm.submitFile.click();

    }




    @And("verify success message")
    public void verifySuccessMessage() {

        Assert.assertTrue(contactUsForm.successMessage.isDisplayed());
    }

    @Then("user clicks Home button and verifies that landed to home page successfully")
    public void userClicksHomeButtonAndVerifiesThatLandedToHomePageSuccessfully() {

        contactUsForm.homeButton.click();
        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("automationexercise", pageTitle);
    }
}
