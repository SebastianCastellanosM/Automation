package co.edu.udea.certificacion.recursoshumanos.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.LeaveListPage.*;

public class Leave {

    private Leave() {
        // Constructor privado para evitar instanciación
    }

    // ===================== TÍTULO =====================
    public static Question<Boolean> titleIsVisible() {
        return Visibility.of(LEAVE_LIST_TITLE);
    }

    // ===================== FILTROS =====================
    public static Question<Boolean> fromDateFilterIsVisible() {
        return Visibility.of(FROM_DATE_FILTER);
    }

    public static Question<Boolean> toDateFilterIsVisible() {
        return Visibility.of(TO_DATE_FILTER);
    }

    public static Question<Boolean> statusFilterIsVisible() {
        return Visibility.of(STATUS_FILTER);
    }

    public static Question<Boolean> leaveTypeFilterIsVisible() {
        return Visibility.of(LEAVE_TYPE_FILTER);
    }

    public static Question<Boolean> employeeNameFilterIsVisible() {
        return Visibility.of(EMPLOYEE_NAME_INPUT);
    }

    public static Question<Boolean> subUnitFilterIsVisible() {
        return Visibility.of(SUB_UNIT_FILTER);
    }

    public static Question<Boolean> includePastEmployeesCheckboxIsVisible() {
        return Visibility.of(INCLUDE_PAST_EMPLOYEES_CHECKBOX);
    }

    // ===================== COLUMNAS DE LA TABLA =====================
    public static Question<Boolean> tableHeadersAreVisible() {
        return Visibility.of(TABLE_HEADERS);
    }

    public static Question<Boolean> tableRowsAreVisible() {
        return Visibility.of(TABLE_ROWS);
    }

    // ===================== MENSAJE "No Records Found" =====================
    public static Question<Boolean> noRecordsFoundMessageIsVisible() {
        return Visibility.of(NO_RECORDS_FOUND_MESSAGE);
    }

    public static Question<String> noRecordsFoundMessageText() {
        return Text.of(NO_RECORDS_FOUND_MESSAGE);
    }
    
}
