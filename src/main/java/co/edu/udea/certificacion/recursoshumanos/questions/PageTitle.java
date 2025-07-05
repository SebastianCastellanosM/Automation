package co.edu.udea.certificacion.recursoshumanos.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage.DASHBOARD_TITLE;

public class PageTitle {
    // Private constructor to prevent instantiation
    private PageTitle() {}

    public static Question<Boolean> isVisibleWithText(String expectedTitle) {
        return actor -> Text.of(DASHBOARD_TITLE).answeredBy(actor).equals(expectedTitle);
    }
}