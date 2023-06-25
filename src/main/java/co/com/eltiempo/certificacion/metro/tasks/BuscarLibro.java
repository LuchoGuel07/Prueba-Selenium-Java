package co.com.eltiempo.certificacion.metro.tasks;


import net.serenitybdd.screenplay.Actor;

import static co.com.eltiempo.certificacion.metro.userinterfaces.BusquedaElementosPage.*;
import static co.com.eltiempo.certificacion.metro.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

public class BuscarLibro implements Task {
    private final String libro;
    public BuscarLibro(String libro) {
        this.libro = libro;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOOK_STORE_SECTION),
                Click.on(BOOK_STORE_SECTION),
                Click.on(INPUT_BUSQUEDA_LIBRO),
                SendKeys.of(libro).into(INPUT_BUSQUEDA_LIBRO),
                Click.on(BOTON_BUSCAR_LIBRO),
                Click.on(RESULTADO_DE_BUSQUEDA)
        );
    }

    public static BuscarLibro enDemoQA(String libro){
        return instrumented(BuscarLibro.class,libro);
    }
}
