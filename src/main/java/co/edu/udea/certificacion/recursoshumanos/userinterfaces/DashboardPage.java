// DashboardPage.java - User Interface
package co.edu.udea.certificacion.recursoshumanos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    public static final Target DASHBOARD_TITLE = Target.the("Dashboard title")
            .located(By.xpath("//h6[contains(@class,'oxd-topbar-header-breadcrumb-module') and contains(text(),'Dashboard')]"));

    public static final Target MAIN_MENU = Target.the("Main menu option")
            .locatedBy("//span[contains(text(),'{0}')]");

    public static final Target DASHBOARD_CONTAINER = Target.the("Dashboard container")
            .located(By.xpath("//div[@class='oxd-dashboard-content']"));

    public static final Target MAIN_MENU1 = Target.the("Main menu")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]"));

    public static final Target USER_PROFILE_DROPDOWN = Target.the("User profile dropdown")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));

    public static final Target USER_PROFILE_NAME = Target.the("User profile name")
            .located(By.xpath("//p[@class='oxd-userdropdown-name']"));

    public static final Target UPGRADE_BUTTON = Target.the("Upgrade button")
            .located(By.xpath("//button[contains(text(),'Upgrade')]"));

    // Opciones del menú principal
    public static final Target ADMIN_MENU = Target.the("Admin menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Admin']"));

    public static final Target PIM_MENU = Target.the("PIM menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='PIM']"));

    public static final Target LEAVE_MENU = Target.the("Leave menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Leave']"));

    public static final Target TIME_MENU = Target.the("Time menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Time']"));

    public static final Target RECRUITMENT_MENU = Target.the("Recruitment menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Recruitment']"));

    public static final Target MY_INFO_MENU = Target.the("My Info menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='My Info']"));

    public static final Target PERFORMANCE_MENU = Target.the("Performance menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Performance']"));

    public static final Target DASHBOARD_MENU = Target.the("Dashboard menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Dashboard']"));

    public static final Target DIRECTORY_MENU = Target.the("Directory menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Directory']"));

    public static final Target MAINTENANCE_MENU = Target.the("Maintenance menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Maintenance']"));

    public static final Target CLAIM_MENU = Target.the("Claim menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Claim']"));

    public static final Target BUZZ_MENU = Target.the("Buzz menu")
            .located(By.xpath("//span[contains(@class,'oxd-main-menu-item--name') and text()='Buzz']"));
}