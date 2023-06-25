package co.com.eltiempo.certificacion.metro.stepdefinitions;

import co.com.eltiempo.certificacion.metro.exceptions.GeneralExceptions;
import co.com.eltiempo.certificacion.metro.questions.Comparartexto;
import co.com.eltiempo.certificacion.metro.tasks.BuscarLibro;
import co.com.eltiempo.certificacion.metro.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.eltiempo.certificacion.metro.userinterfaces.ValidacionLibrosPage.VALIDACION_RESULTADO_BUSQUEDA_LIBRO;
import static co.com.eltiempo.certificacion.metro.util.ConstantesExceptions.ERROR_DATOS_INCORRECTOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InteractuarElementosStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private final Actor actor = Actor.named("Luis");
    private final HomePage homepage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("Ingresar al portal")
    public void ingresarAlPortalHttpsDemoqaCom() {
        actor.wasAbleTo(
                Open.browserOn(homepage)
        );

    }

    @When("Seleccionar la opcion de Book Store Aplicattion y buscar el libro {}")
    public void seleccionarLaOpcionDeBookStoreAplicattionYBuscarElLibro(String libro) {
        actor.attemptsTo(
                BuscarLibro.enDemoQA(libro)
        );
    }

    @Then("Puedo ver la informacion del libro con el titulo {}")
    public void puedoVerLaInformacionDelLibroConElTituloUnderstandingECMAScript(String libro) {
        actor.should(
                seeThat(Comparartexto.delLibro(VALIDACION_RESULTADO_BUSQUEDA_LIBRO, libro)).orComplainWith(GeneralExceptions.class,ERROR_DATOS_INCORRECTOS)
        );
    }
}
