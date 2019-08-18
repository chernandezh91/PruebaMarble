package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.FillWord;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOn implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(FillWord.CONFIRM_WORD));
        return null;
    }

    public static ClickOn wordCorrect() {
        return new ClickOn();
    }
}
