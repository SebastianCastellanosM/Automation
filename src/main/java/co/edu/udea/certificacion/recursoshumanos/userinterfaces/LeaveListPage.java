package co.edu.udea.certificacion.recursoshumanos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LeaveListPage {

    private LeaveListPage() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }


    // ---------- TÍTULO DE LA PÁGINA ----------
    public static final Target LEAVE_LIST_TITLE = Target.the("Leave List title")
            .located(By.xpath("//h6[text()='Leave List']"));

    // ---------- FILTROS PRINCIPALES ----------
    public static final Target FROM_DATE_FILTER = Target.the("From Date filter")
            .located(By.xpath("//label[text()='From Date']/following::input[1]"));

    public static final Target TO_DATE_FILTER = Target.the("To Date filter")
            .located(By.xpath("//label[text()='To Date']/following::input[1]"));

    public static final Target STATUS_FILTER = Target.the("Show Leave with Status filter")
            .located(By.xpath("//label[contains(text(),'Show Leave')]/following::div[contains(@class,'oxd-select-wrapper')][1]"));

    public static final Target LEAVE_TYPE_FILTER = Target.the("Leave Type filter")
            .located(By.xpath("//label[text()='Leave Type']/following::div[contains(@class,'oxd-select-wrapper')][1]"));

    public static final Target EMPLOYEE_NAME_INPUT = Target.the("Employee Name input")
            .located(By.xpath("//input[contains(@placeholder,'Type for hints...')]"));

    public static final Target SUB_UNIT_FILTER = Target.the("Sub Unit filter")
            .located(By.xpath("//label[text()='Sub Unit']/following::div[contains(@class,'oxd-select-wrapper')][1]"));

    public static final Target INCLUDE_PAST_EMPLOYEES_CHECKBOX = Target.the("Include Past Employees checkbox")
            .located(By.xpath("//label[text()='Include Past Employees']/preceding-sibling::span/input"));

    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.xpath("//button[@type='submit' and .='Search']"));

    public static final Target RESET_BUTTON = Target.the("Reset button")
            .located(By.xpath("//button[@type='button' and .='Reset']"));

    // ---------- TABLA DE RESULTADOS ----------
    public static final Target TABLE_HEADERS = Target.the("Leave List table headers")
            .located(By.xpath("//div[@class='oxd-table-header']"));

    public static final Target TABLE_ROWS = Target.the("Leave List table rows")
            .located(By.xpath("//div[@class='oxd-table-body']//div[contains(@class,'oxd-table-row')]"));

    public static final Target NO_RECORDS_FOUND_MESSAGE = Target.the("No Records Found message")
            .located(By.xpath("//span[text()='No Records Found']"));

    public static final Target FIRST_ROW_STATUS = Target.the("Status of first row")
            .located(By.xpath("(//div[@class='oxd-table-body']//div[contains(@class,'oxd-table-row')])[1]//div[6]"));

    // ---------- COLUMNAS DE LA TABLA (ENCABEZADOS) ----------
    public static final Target DATE_COLUMN = Target.the("Date column")
            .located(By.xpath("//div[@role='columnheader' and .='Date']"));

    public static final Target EMPLOYEE_NAME_COLUMN = Target.the("Employee Name column")
            .located(By.xpath("//div[@role='columnheader' and .='Employee Name']"));

    public static final Target LEAVE_TYPE_COLUMN = Target.the("Leave Type column")
            .located(By.xpath("//div[@role='columnheader' and .='Leave Type']"));

    public static final Target LEAVE_BALANCE_COLUMN = Target.the("Leave Balance (Days) column")
            .located(By.xpath("//div[@role='columnheader' and .='Leave Balance (Days)']"));

    public static final Target NUMBER_OF_DAYS_COLUMN = Target.the("Number of Days column")
            .located(By.xpath("//div[@role='columnheader' and .='Number of Days']"));

    public static final Target STATUS_COLUMN = Target.the("Status column")
            .located(By.xpath("//div[@role='columnheader' and .='Status']"));

    public static final Target COMMENTS_COLUMN = Target.the("Comments column")
            .located(By.xpath("//div[@role='columnheader' and .='Comments']"));

    public static final Target ACTIONS_COLUMN = Target.the("Actions column")
            .located(By.xpath("//div[@role='columnheader' and .='Actions']"));
}