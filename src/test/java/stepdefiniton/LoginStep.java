package stepdefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;
import support.TestContext;
import support.WaitHelper;

public class LoginStep {

    LoginPage loginPage;
    ProductsPage productsPage;
    TestContext testContext;

    public LoginStep(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
        productsPage = testContext.getPageObjectManager().getProductsPage();
    }

    @Given("^the user logs in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void validLogin(String username, String password){
        loginPage.validLogin(username,password);
    }

    @And("^wait for the page to finish loading$")
    public void waitforPagetoLoad(){
        loginPage.waitForPageLoad();
    }

    @Then("^products page title is displayed$")
    public void displayProductsPageTitle(){
        Assert.assertTrue(productsPage.productTitleDisplayed());
    }
}
