package co.edu.udea.certificacion.recursoshumanos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    // Private constructor to prevent instantiation
    private LoginPage() {}

        public static final Target USERNAME_FIELD = Target.the("Username field")
        .located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));


    public static final Target PASSWORD_FIELD = Target.the("Password field")
        .located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));


    public static final Target LOGIN_BUTTON = Target.the("Login button")
        .located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));


    public static final Target DASHBOARD_MENU = Target.the("Dashboard menu option")
           .located(By.xpath("//span[text()='Dashboard']"));

   public static final Target USER_PROFILE = Target.the("User profile dropdown")
            .located(By.xpath("//p[@class='oxd-userdropdown-name']"));
}