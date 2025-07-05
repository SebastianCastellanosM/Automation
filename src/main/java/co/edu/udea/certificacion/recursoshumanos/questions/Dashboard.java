package co.edu.udea.certificacion.recursoshumanos.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


import co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage;

public class Dashboard {
    private Dashboard() {}

    public static Question<Boolean> isVisible() {
    return Visibility.of(DashboardPage.DASHBOARD_LOGO_IMAGE);
}

}