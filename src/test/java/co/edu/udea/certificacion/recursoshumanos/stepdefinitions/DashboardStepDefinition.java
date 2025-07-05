package co.edu.udea.certificacion.recursoshumanos.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import co.edu.udea.certificacion.recursoshumanos.tasks.Login;
import co.edu.udea.certificacion.recursoshumanos.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DashboardStepDefinition {
    @Given("que estoy autenticado en OrangeHRM")
public void queEstoyAutenticadoEnOrangeHRM() {
    OnStage.setTheStage(new OnlineCast());
    OnStage.theActorCalled("user").attemptsTo(
        Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
        Login.withValidCredentials()
    );
}

@When("navego al módulo {string}")
public void navegoAlModulo(String nombreModulo) {
    OnStage.theActorInTheSpotlight().attemptsTo(
        NavigateTo.menuOption(nombreModulo)
    );
}

@Then("debo ver el título de la página {string}")
public void deboVerElTituloDeLaPagina(String tituloEsperado) {
    OnStage.theActorInTheSpotlight().should(
        seeThat(PageTitle.isVisibleWithText(tituloEsperado), is(true))
    );
}

}