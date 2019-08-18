package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.FillWord;
import co.com.proyectobase.screenplay.util.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenceWord implements Task {

    public static DiligenceWord testsCorrectly() {
        return instrumented(DiligenceWord.class);
    }

    WaitSeconds ws = new WaitSeconds();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(FillWord.CLICK_SEARCH_BAR));
        actor.attemptsTo(Enter.theValue("pruebaz").into(FillWord.ENTER_WORD));
        actor.attemptsTo(Click.on(FillWord.CLICK_BUTTON_SEARCH));
        ws.waitThreeSeconds();
    }
}
