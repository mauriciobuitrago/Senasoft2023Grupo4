package com.co.booking.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
public class HomePage {

    public static final Target BTN_DIVISAS = Target.the("Boton  para seleccionar divisas")
            .locatedBy("//button[@aria-label='Precios en Peso colombiano']");

    public static final Target DIVISAS = Target.the("Lista de todas las divisas disponibles")
            .locatedBy("//*[@id=\"b2searchresultsPage\"]/div[16]/div/div/div/div/div[2]/div/div[2]/div/div/ul[1]/li[1]/button/div/div[1]/span/div");
    public static final Target INPUTDESTINO = Target.the("Input para colocar el destino")
            .locatedBy("//*[@name='ss']");

    public static final Target FECHA_ENTR_SALI = Target.the("Seleccion de fecha de entrada y salida")
            .locatedBy("//*[@class='d606c76c5a']");

    public static final Target FECHA_INICIO = Target.the("Seleccionar la fecha de inicio")
            .locatedBy("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[5]/td[5]/span/span");

    public static final Target FECCHA_FIN = Target.the("Seleccionar la fecha de salida")
            .locatedBy("//*[text()='7 días']");

    public static final Target PERSONAS = Target.the("Opcion para seleccionar el total de personas")
            .locatedBy("//*[@class='a83ed08757 d47738b911 b7d08821c3']");

    public static final Target
            .locatedBy("")

}
