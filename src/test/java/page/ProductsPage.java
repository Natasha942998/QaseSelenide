package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    private final SelenideElement title = $x("//h1[text()='Projects']");
    private final ElementsCollection titles = $$x("//h1[text()='Projects']");

    public void waitPageLoaded(){
        title.should(Condition.exist).shouldBe(visible);
    }
}