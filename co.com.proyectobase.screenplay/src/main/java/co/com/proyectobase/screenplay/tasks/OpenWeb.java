package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private GooglePage googlePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googlePage));
    }

    public static OpenWeb googlePage() {
        return instrumented(OpenWeb.class);
    }
}
