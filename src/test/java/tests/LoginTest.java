package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void projectLogin() {
        loginPage.openPage()
                .fillLogin()
                .submit();

        productsPage.waitPageLoaded();
    }
}
