package co.com.eltiempo.certificacion.metro.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ValidacionLibrosPage {
    public static final Target VALIDACION_RESULTADO_BUSQUEDA_LIBRO = Target.the("Book Store Titulo Libro")
            .locatedBy("//*[@id=\"title-wrapper\"]/div[2]");
}
