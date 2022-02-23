package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AddProduct_TC12 {

    public AddProduct_TC12() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButton;

    @FindBy(xpath = " (//div[@class='productinfo text-center'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopButton;

    @FindBy(xpath = " (//div[@class='productinfo text-center'])[2]")
    public WebElement secondProduct;

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement addToCartButton1;

    @FindBy(xpath = "/(//a[@data-product-id='1'])[2]")
    public WebElement addToCartButtonClick1;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement addToCartButton2;

    @FindBy(linkText = "View Cart")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[@class='cart_description']")
    public List<WebElement> productsInChartList;

    @FindBy(xpath = "(//*[@class='disabled'])[1]")
    public WebElement firstQuantity;

    @FindBy(xpath = "(//*[@class='disabled'])[2]")
    public WebElement secondQuantity;

    @FindBy(xpath = "(//*[@class='cart_price'])[1]")
    public WebElement firstPrice;

    @FindBy(xpath = "(//*[@class='cart_price'])[2]")
    public WebElement secondPrice;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[1]")
    public WebElement firstTotolPrice;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[2]")
    public WebElement secondTotolPrice;

}

