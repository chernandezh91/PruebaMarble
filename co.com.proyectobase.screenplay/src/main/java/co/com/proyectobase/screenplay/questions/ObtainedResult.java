package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ObtainedResult implements Question<Boolean> {

    WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    @Override
    public Boolean answeredBy(Actor actor) {

        int con = 0;
        int expectedResults = 6;
        List<WebElement> webElementResults = driver.findElements(By.xpath("//*[@class=\"med\"]//*[@class=\"g\"]"));

        for (int i = 0; i < webElementResults.size(); i++) {
            con ++;
        }
        if (con >= expectedResults){
            return true;
        }else{
            return false;
        }
    }

    public static ObtainedResult greaterThanSix() {
        return new ObtainedResult();
    }
}
