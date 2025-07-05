package co.edu.udea.certificacion.recursoshumanos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateTo implements Task {

    private final String moduleName;

    public NavigateTo(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target dynamicMenuOption = Target.the(moduleName + " menu option")
            .locatedBy("//ul[contains(@class,'oxd-main-menu')]//li//span[normalize-space(text())='" + moduleName + "']");

        actor.attemptsTo(
            WaitUntil.the(dynamicMenuOption, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(dynamicMenuOption)
        );
    }

    public static NavigateTo menuOption(String moduleName) {
        return Tasks.instrumented(NavigateTo.class, moduleName);
    }
}
