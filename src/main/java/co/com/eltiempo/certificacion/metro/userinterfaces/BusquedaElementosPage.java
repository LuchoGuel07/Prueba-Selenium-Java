package co.com.eltiempo.certificacion.metro.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaElementosPage {
    public static final Target INPUT_BUSQUEDA_LIBRO = Target.the("Contenedor Para Busqueda de Libros")
            .locatedBy("//*[@id=\"searchBox\"]");
    public static final Target BOTON_BUSCAR_LIBRO = Target.the("Boton para Buscar Libros")
            .locatedBy("//*[@id=\"searchBox-wrapper\"]/div[1]/div/div");
    public static final Target RESULTADO_DE_BUSQUEDA = Target.the("Opcion para Seleccionar Libro")
            .locatedBy("//*[@id=\"see-book-Understanding ECMAScript 6\"]");
}
