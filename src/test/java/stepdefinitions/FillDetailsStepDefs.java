package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FillDetailsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class FillDetailsStepDefs {

    FillDetailsPage fillDetailsPage = new FillDetailsPage();

    @When("user fills details")
    public void user_fills_details() {
        fillDetailsPage.genderBox.click();
        fillDetailsPage.passwodBox.sendKeys("12345");
        Driver.selectByIndex(fillDetailsPage.dayDropdown,3);
        Driver.selectByIndex(fillDetailsPage.monthDropdown, 2);
        Driver.selectByIndex(fillDetailsPage.yearDropdown,22);
    }
    @When("user selects checkbox signup for our newslater")
    public void user_selects_checkbox_signup_for_our_newslater() {
        fillDetailsPage.newsletterSignupBox.click();
    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {
        fillDetailsPage.specialOfferBox.click();
    }

    @When("user fills details2")
    public void user_fills_details2() {
        fillDetailsPage.firstNameBox.sendKeys("Recepppp");
        fillDetailsPage.lastNameBox.sendKeys("Aliiii");
        fillDetailsPage.companyBox.sendKeys("apple");
        fillDetailsPage.addressBox.sendKeys(Faker.instance().address().fullAddress());
        Driver.selectByIndex(fillDetailsPage.countryDropdown,3);
        fillDetailsPage.stateBox.sendKeys("Batman");
        fillDetailsPage.cityBox.sendKeys("Bursa");
        fillDetailsPage.zipcodeBox.sendKeys("67300");
        fillDetailsPage.mobileNumberBox.sendKeys("5444444441");

    }

    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        ReusableMethods.waitFor(2);
        fillDetailsPage.createAccountButton.click();
    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {
        Assert.assertTrue(fillDetailsPage.createAccountConfirm.isDisplayed());
    }
}
