package helpers;

import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;

public class PageObjectManager {
    private final WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;


    public PageObjectManager(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }
    public ProductsPage getProductsPage() {
        return (productsPage == null) ? productsPage = new ProductsPage(driver) : productsPage;
    }
}
