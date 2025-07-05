package co.edu.udea.certificacion.recursoshumanos.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage.DASHBOARD_TITLE;

public class Dashboard {
    private Dashboard() {}

    public static Question<Boolean> isVisible() {
    return Visibility.of(DASHBOARD_TITLE);
}
}