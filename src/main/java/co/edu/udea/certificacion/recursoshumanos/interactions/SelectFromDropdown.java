package co.edu.udea.certificacion.recursoshumanos.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;

public class SelectFromDropdown implements Interaction {

    private final Target dropdown;
    private final String visibleText;

    public SelectFromDropdown(Target dropdown, String visibleText) {
        this.dropdown = dropdown;
        this.visibleText = visibleText;
    }

    public static SelectFromDropdown byVisibleText(Target dropdown, String visibleText) {
        return Tasks.instrumented(SelectFromDropdown.class, dropdown, visibleText);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            the(dropdown, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(dropdown),
            Click.on(Target.the("Option with text " + visibleText)
                .locatedBy("//div[@role='option']//span[text()='" + visibleText + "']"))
        );
    }
}
