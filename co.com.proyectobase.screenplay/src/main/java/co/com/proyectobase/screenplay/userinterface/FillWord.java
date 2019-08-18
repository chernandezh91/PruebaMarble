package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FillWord extends PageObject {

    public static final Target CONFIRM_WORD = Target.the("EXPECTED WORD").located(By.xpath("//*[@id=\"fprsl\"]"));

    public static final Target CLICK_SEARCH_BAR = Target.the("CLICK SEARCH BAR").
            located(By.xpath("//*[@class=\"gLFyf gsfi\"]"));

    public static final Target ENTER_WORD = Target.the("ENTER WORD").
            located(By.xpath("//*[@class=\"gLFyf gsfi\"]"));

    public static final Target CLICK_BUTTON_SEARCH = Target.the("CLICK BODY").
            located(By.xpath("//div[@jsname='VlcLAe']//input[@name='btnK']"));

}
