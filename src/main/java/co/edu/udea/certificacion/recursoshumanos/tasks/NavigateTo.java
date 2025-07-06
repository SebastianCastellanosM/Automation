package co.edu.udea.certificacion.recursoshumanos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage.MAIN_MENU;

public class NavigateTo implements Task {
  private final String option;
  public NavigateTo(String option){ this.option = option; }
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
      WaitUntil.the(MAIN_MENU.of(option), isVisible()).forNoMoreThan(10).seconds(),
      Click.on(MAIN_MENU.of(option))
    );
  }
  public static NavigateTo menuOption(String option){
    return Tasks.instrumented(NavigateTo.class, option);
  }
}