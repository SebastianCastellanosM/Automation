// DashboardPage.java - User Interface
package co.edu.udea.certificacion.recursoshumanos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    // ---------- HEADER ELEMENTS ----------
   public static final Target DASHBOARD_TITLE = Target.the("Dashboard title")
    .located(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6"));

    public static final Target DASHBOARD_LOGO_IMAGE = Target.the("Dashboard logo image")
    .locatedBy("//*[@id='app']/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img");

    public static Target MAIN_MENU = Target.the("Main menu option")
    .locatedBy("//ul[contains(@class,'oxd-main-menu')]//li//span[text()='{0}']");

    
    public static final Target USER_PROFILE_DROPDOWN = Target.the("User profile dropdown")
        .locatedBy("//header//li//span//p");

    public static final Target USER_PROFILE_NAME = Target.the("User profile name")
    .located(By.xpath("//p[@class='oxd-userdropdown-name']"));

    public static final Target UPGRADE_BUTTON = Target.the("Upgrade button")
        .locatedBy("//button[contains(text(),'Upgrade')]");


    // Opciones específicas del menú principal
    public static final Target ADMIN_MENU = Target.the("Admin menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Admin']");

    public static final Target PIM_MENU = Target.the("PIM menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='PIM']");

    public static final Target LEAVE_MENU = Target.the("Leave menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Leave']");

    public static final Target TIME_MENU = Target.the("Time menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Time']");

    public static final Target RECRUITMENT_MENU = Target.the("Recruitment menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Recruitment']");

    public static final Target MY_INFO_MENU = Target.the("My Info menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='My Info']");

    public static final Target PERFORMANCE_MENU = Target.the("Performance menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Performance']");

    public static final Target DASHBOARD_MENU = Target.the("Dashboard menu item")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Dashboard']");

    public static final Target DIRECTORY_MENU = Target.the("Directory menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Directory']");

    public static final Target MAINTENANCE_MENU = Target.the("Maintenance menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Maintenance']");

    public static final Target CLAIM_MENU = Target.the("Claim menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Claim']");

    public static final Target BUZZ_MENU = Target.the("Buzz menu")
        .locatedBy("//span[contains(@class,'oxd-main-menu-item--name') and text()='Buzz']");

    // ---------- CONTENT AREA ----------
    public static final Target DASHBOARD_CONTAINER = Target.the("Dashboard container")
        .located(By.xpath("//div[@class='oxd-dashboard-content']"));
}