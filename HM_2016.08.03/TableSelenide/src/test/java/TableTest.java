import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;


public class TableTest {

    @Test
    public void numberOfRowsAndColumns(){
        open("http://6.pogoda.by/");
        $$(By.cssSelector(".yellowThing>td")).shouldHave(size(7));
        $$(By.cssSelector("#forecast tr")).shouldHave(size(32));
    }

    @Test
    public void verifyTextInCell(){
        open("http://6.pogoda.by/");
        $$(By.cssSelector("#forecast tr")).get(3).shouldHave(Condition.text("Ясно.Без осадков."));
    }

}

