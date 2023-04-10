package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private final WebDriver webDriver;

    public ProductsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//span[@class= 'title' and text()='Products']")
    private WebElement productTitle;

    public boolean productTitleDisplayed(){
        boolean isProductTitleDisplayed = productTitle.isDisplayed();
        return isProductTitleDisplayed;

    }

}
