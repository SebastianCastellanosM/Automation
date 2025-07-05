package co.edu.udea.certificacion.recursoshumanos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage.LEAVE_MENU;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToLeave implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(LEAVE_MENU, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(LEAVE_MENU)
        );
    }

    public static NavigateToLeave go() {
        return Tasks.instrumented(NavigateToLeave.class);
    }
}
