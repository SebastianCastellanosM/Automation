package co.edu.udea.certificacion.recursoshumanos.stepdefinitions;

import co.edu.udea.certificacion.recursoshumanos.questions.Leave;
import co.edu.udea.certificacion.recursoshumanos.tasks.NavigateToLeave;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class LeaveStepDefinition {

    @Given("que estoy en la página de {string}")
    public void queEstoyEnLaPaginaDe(String modulo) {
        if (modulo.equalsIgnoreCase("Leave List")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToLeave.go()
            );
        }
    }

    @When("la página se carga completamente")
    public void laPaginaSeCargaCompletamente() {
        OnStage.theActorInTheSpotlight().should(
            seeThat("El título Leave List está visible", Leave.titleIsVisible(), is(true))
        );
    }

    @Then("debo ver los filtros {string}, {string}, {string}, {string}, {string}, {string}, e {string}")
    public void deboVerLosFiltros(String f1, String f2, String f3, String f4, String f5, String f6, String f7) {
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

    @And("debo ver las columnas de la tabla {string}, {string}, {string}, {string}, {string}, {string}, {string}, y {string}")
    public void deboVerLasColumnasDeLaTabla(String c1, String c2, String c3, String c4, String c5, String c6, String c7, String c8) {
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.dateColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.employeeNameColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.leaveTypeColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.leaveBalanceColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.numberOfDaysColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.statusColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.commentsColumnIsVisible(), is(true))
        );
        OnStage.theActorInTheSpotlight().should(
            seeThat(Leave.actionsColumnIsVisible(), is(true))
        );
    }

    @And("si no hay registros, debo ver el mensaje {string}")
    public void siNoHayRegistrosDeboVerElMensaje(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(
            seeThat("Mensaje 'No Records Found' visible", Leave.noRecordsFoundMessageIsVisible(), is(true))
        );

        OnStage.theActorInTheSpotlight().should(
            seeThat("Texto del mensaje", Leave.noRecordsFoundMessageText(), equalTo(mensajeEsperado))
        );
    }
}
