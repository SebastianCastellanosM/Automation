package co.edu.udea.certificacion.recursoshumanos.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageTitle {

    private static final Target PAGE_TITLE = Target.the("Page title")
        .located(By.xpath("//h6"));

    private PageTitle() {
        // Previene instanciación
    }

    public static Question<Boolean> isVisibleWithText(String expectedTitle) {
        return actor -> Text.of(PAGE_TITLE).answeredBy(actor).equalsIgnoreCase(expectedTitle);
    }
}