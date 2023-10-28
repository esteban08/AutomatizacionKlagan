package co.com.klagan.tasks;

import co.com.klagan.userinterface.googlePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class search implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Automatizacion").into(googlePage.TEXTAREA),
                Click.on(googlePage.SEARCH),
                Click.on(googlePage.OPTION),
                Click.on(googlePage.HISTORY)

        );
    }
    public static search on(){
        return new search();
    }
}
