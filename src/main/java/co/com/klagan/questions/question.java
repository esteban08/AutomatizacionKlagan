package co.com.klagan.questions;

import co.com.klagan.userinterface.googlePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class question implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(googlePage.TITLE).viewedBy(actor).asString();
    }

public static question in(){return new question();}
}
