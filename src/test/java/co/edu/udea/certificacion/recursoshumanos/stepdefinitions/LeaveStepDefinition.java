package co.edu.udea.certificacion.recursoshumanos.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import co.edu.udea.certificacion.recursoshumanos.tasks.NavigateTo;
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
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.fromDateFilterIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.toDateFilterIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.statusFilterIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.leaveTypeFilterIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.employeeNameFilterIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.subUnitFilterIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.includePastEmployeesCheckboxIsVisible(), is(true))
        );
    }

    @And("debo ver las columnas de la tabla \"Date\", \"Employee Name\", \"Leave Type\", \"Leave Balance \\(Days\\)\", \"Number of Days\", \"Status\", \"Comments\", y \"Actions\"")
    public void deboVerLasColumnasDeLaTabla() {
         OnStage.theActorInTheSpotlight().should(
         seeThat(Leave.tableHeadersAreVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
         seeThat(Leave.tableRowsAreVisible(), is(true))
        );
    }


    @And("si no hay registros, debo ver el mensaje {string}")
    public void siNoHayRegistrosDeboVerElMensaje(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.noRecordsFoundMessageIsVisible(), is(true))
        );

        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.noRecordsFoundMessageText(), is(mensajeEsperado))
        );
    }
}