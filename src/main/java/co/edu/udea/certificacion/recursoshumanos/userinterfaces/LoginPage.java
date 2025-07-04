package co.edu.udea.certificacion.recursoshumanos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("Username field")
            .located(By.name("username"));

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.name("password"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target DASHBOARD_TITLE = Target.the("Dashboard title")
            .located(By.xpath("//h6[contains(@class,'oxd-topbar-header-breadcrumb-module') and text()='Dashboard']"));
}
