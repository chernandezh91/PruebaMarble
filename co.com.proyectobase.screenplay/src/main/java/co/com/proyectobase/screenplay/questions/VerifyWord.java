package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.FillWord;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VerifyWord implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FillWord.CONFIRM_WORD).viewedBy(actor).asString();

    }

    public static VerifyWord correctWriting() {
        return new VerifyWord();
    }
}
