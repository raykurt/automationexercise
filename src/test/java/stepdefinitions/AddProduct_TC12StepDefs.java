package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddProduct_TC12;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class AddProduct_TC12StepDefs {

    AddProduct_TC12 addProduct = new AddProduct_TC12();

    @When("user hover over first product and click add to cart")
    public void user_hover_over_first_product_and_click_add_to_cart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(3);
        ReusableMethods.hover(addProduct.addToCartButton1);
        Driver.wait(1);
        Driver.clickWithJS(addProduct.addToCartButton1);
        Driver.wait(1);
    }
    @When("user clicks continue shopping button")
    public void user_clicks_continue_shopping_button() {
        addProduct.continueShopButton.click();
        Driver.wait(2);
    }
    @When("hover over second product and click add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        Driver.wait(2);
        ReusableMethods.hover(addProduct.addToCartButton2);
        addProduct.addToCartButton2.click();
    }
    @When("user clicks view cart button")
    public void user_clicks_view_cart_button() {
        addProduct.cartButton.click();
    }
    @Then("user verifies both products are added to cart")
    public void user_verifies_both_products_are_added_to_cart() {
        Assert.assertEquals(2, addProduct.productsInChartList.size());
    }
    @Then("user verifies their prices quantity and total price")
    public void user_verifies_their_prices_quantity_and_total_price() {
        int firstPrice = Integer.parseInt(addProduct.firstPrice.getText().toString().replaceAll("[^0-9]",""));
        int secondPrice = Integer.parseInt(addProduct.secondPrice.getText().toString().replaceAll("[^0-9]",""));
        String firstTotalPrice = addProduct.firstTotolPrice.getText().toString().replaceAll("[^0-9]","");
        String secondTotalPrice = addProduct.secondTotolPrice.getText().toString().replaceAll("[^0-9]","");

        Assert.assertEquals(500,firstPrice);
        Assert.assertEquals(400,secondPrice);
        Assert.assertEquals("1",addProduct.firstQuantity.getText());
        Assert.assertEquals("1",addProduct.secondQuantity.getText());
        Assert.assertEquals("500",firstTotalPrice);
        Assert.assertEquals("400",secondTotalPrice);

    }
}
