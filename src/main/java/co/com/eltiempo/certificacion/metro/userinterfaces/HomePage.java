package co.com.eltiempo.certificacion.metro.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")

public class HomePage extends PageObject {
    public static final Target BOOK_STORE_SECTION = Target.the("Opcion para abrir Book Store Aplication")
            .located(By.xpath("//h5[contains(text(),'Book Store Application')]/.."));

}
