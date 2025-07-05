package co.edu.udea.certificacion.recursoshumanos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage.MAIN_MENU;

public class NavigateTo implements Task {
    private final String menuOption;

    public NavigateTo(String menuOption) {
        this.menuOption = menuOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(MAIN_MENU.of(menuOption))
        );
    }

    public static NavigateTo menuOption(String option) {
        return Tasks.instrumented(NavigateTo.class, option);
    }
}

