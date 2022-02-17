package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC2_LoginPage;

import java.util.List;

public class TC2_LoginFunctionalityStepDefs {

    TC2_LoginPage tc2_loginPage = new TC2_LoginPage();

    @When("user verifies login to your account is visible")
    public void user_verifies_login_to_your_account_is_visible() {
        Assert.assertTrue(tc2_loginPage.loginYourAccountText.isDisplayed());
    }
    @When("user enters correct email_address and password")
    public void user_enters_correct_email_address_and_password(io.cucumber.datatable.DataTable dataTable) {

        List<String> loginCredentials = dataTable.row(1);
        tc2_loginPage.emailBox.sendKeys(loginCredentials.get(0));
        tc2_loginPage.password.sendKeys(loginCredentials.get(1));
    }

    @When("user clicks login box")
    public void user_clicks_login_box() {
        tc2_loginPage.loginButton.click();
    }

    @When("user clicks logout button")
    public void user_clicks_logout_button() {
        tc2_loginPage.logoutButton.click();
    }

}