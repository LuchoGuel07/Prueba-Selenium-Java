package co.com.eltiempo.certificacion.metro.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.eltiempo.certificacion.metro.userinterfaces.ValidacionLibrosPage.VALIDACION_RESULTADO_BUSQUEDA_LIBRO;

public class Comparartexto implements Question<Boolean> {
    private final Target elemento;
    private final String text;
    public Comparartexto(Target elemento, String text) {
        this.elemento = elemento;
        this.text = text;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return elemento.resolveFor(actor).getText().equals(text);

    }

    public static Comparartexto delLibro( Target elemento ,String text ) {

        return new Comparartexto(elemento,text);
    }
}