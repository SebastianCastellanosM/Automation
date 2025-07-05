package co.edu.udea.certificacion.recursoshumanos.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.edu.udea.certificacion.recursoshumanos.userinterfaces.DashboardPage.USER_PROFILE_DROPDOWN;

public class UserProfile {
    // Private constructor to prevent instantiation
    private UserProfile() {}

    public static Question<Boolean> isVisible() {
        return Visibility.of(USER_PROFILE_DROPDOWN);
    }
}
