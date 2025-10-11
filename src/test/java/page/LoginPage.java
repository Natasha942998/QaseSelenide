package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private final SelenideElement emailInput = $("[placeholder = 'Work email']");
    private final SelenideElement passwordInput = $x("//*[@placeholder='Password]");
    private final SelenideElement submit = $x("//*[text()='Sign in']");

    public LoginPage openPage() {
        open("login");
        return this;
    }

    public LoginPage fillLogin() {
        emailInput.setValue("qase.email").pressEnter();
        passwordInput.sendKeys("qase.password");
        return this;
    }

    public LoginPage submit() {
        submit.submit();
        return this;
    }
}
