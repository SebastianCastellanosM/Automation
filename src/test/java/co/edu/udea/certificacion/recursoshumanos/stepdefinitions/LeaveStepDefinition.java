package co.edu.udea.certificacion.recursoshumanos.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import co.edu.udea.certificacion.recursoshumanos.tasks.NavigateTo;
import co.edu.udea.certificacion.recursoshumanos.userinterfaces.LeaveListPage;
import co.edu.udea.certificacion.recursoshumanos.interactions.SelectFromDropdown;
import co.edu.udea.certificacion.recursoshumanos.questions.Leave;

public class LeaveStepDefinition {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Given("que estoy en la página de {string}")
    public void queEstoyEnLaPaginaDe(String modulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            NavigateTo.menuOption(modulo)
        );
    }

    @When("la página se carga completamente")
    public void laPaginaSeCargaCompletamente() {
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.titleIsVisible(), is(true))
        );
    }

    @Then("debo ver los filtros \"From Date\", \"To Date\", \"Show Leave with Status\", \"Leave Type\", \"Employee Name\", \"Sub Unit\", e \"Include Past Employees\"")
    public void deboVerLosFiltros() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(
            seeThat(Leave.fromDateFilterIsVisible(), is(true)),
            seeThat(Leave.toDateFilterIsVisible(), is(true)),
            seeThat(Leave.statusFilterIsVisible(), is(true)),
            seeThat(Leave.leaveTypeFilterIsVisible(), is(true)),
            seeThat(Leave.employeeNameFilterIsVisible(), is(true)),
            seeThat(Leave.subUnitFilterIsVisible(), is(true)),
            seeThat(Leave.includePastEmployeesCheckboxIsVisible(), is(true))
        );
    }

    @And("debo ver las columnas de la tabla \"Date\", \"Employee Name\", \"Leave Type\", \"Leave Balance \\(Days\\)\", \"Number of Days\", \"Status\", \"Comments\", y \"Actions\"")
    public void deboVerLasColumnasDeLaTabla() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(
            seeThat(Leave.tableHeadersAreVisible(), is(true)),
            seeThat(Leave.tableRowsAreVisible(), is(true))
        );
    }

    @And("si no hay registros, debo ver el mensaje {string}")
    public void siNoHayRegistrosDeboVerElMensaje(String mensajeEsperado) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(
            seeThat(Leave.noRecordsFoundMessageIsVisible(), is(true)),
            seeThat(Leave.noRecordsFoundMessageText(), is(mensajeEsperado))
        );
    }

    @When("selecciono el tipo de licencia {string}")
    public void seleccionoElTipoDeLicencia(String tipoLicencia) {
     OnStage.theActorInTheSpotlight().attemptsTo(
        SelectFromDropdown.byVisibleText(LeaveListPage.LEAVE_TYPE_FILTER, tipoLicencia)
    );
    }

    @And("hago clic en el botón {string}")
    public void hagoClicEnElBoton(String nombreBoton) {
    if (nombreBoton.equalsIgnoreCase("Search")) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(LeaveListPage.SEARCH_BUTTON)
        );
    } else if (nombreBoton.equalsIgnoreCase("Reset")) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(LeaveListPage.RESET_BUTTON)
        );
    } else {
        throw new IllegalArgumentException("Botón no reconocido: " + nombreBoton);
    }
    }

    @Then("debo ver resultados en la tabla de licencias")
    public void deboVerResultadosEnLaTablaDeLicencias() {
     OnStage.theActorInTheSpotlight().should(
        seeThat(Leave.tableRowsAreVisible(), is(true))
    );
    }

}