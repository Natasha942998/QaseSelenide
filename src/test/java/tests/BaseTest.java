package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.LoginPage;
import page.ProductsPage;
import utils.PropertyReader;


public class BaseTest {
    LoginPage loginPage;
    ProductsPage productsPage;
    String email;
    String password;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = 10000;
        Configuration.baseUrl = PropertyReader.getProperty("qase.url");
        Configuration.browserSize = "1920x1080";
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
        email = PropertyReader.getProperty("qase.email");
        password = PropertyReader.getProperty("qase.password");
    }

    @AfterMethod
    public void closeWind() {
        WebDriverRunner.clearBrowserCache();
        Selenide.closeWebDriver();
    }
}