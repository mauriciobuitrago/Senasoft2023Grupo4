package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class servicePageNavigationBarComponent {

    public static final Target BTN_VUELOS = Target.the("Navigation to page flights ")
            .locatedBy("//*[contains(text(), \"Vuelos\")]");
    public static final Target BTN_AlQUILER_DE_COCHES = Target.the("Navigation to page CAR RENTAL ")
            .locatedBy("//*[contains(text(), \"Alquiler de coches\")]");
    public static final Target BTN_ATRACCIONES_TURISTICAS = Target.the("Navigation to tourist attractions  ")
            .locatedBy("//*[contains(text(), \"Atracciones turísticas\")]");
    public static final Target BTN_TAXISAEROPUERTO = Target.the("Navigation to page cabs ")
            .locatedBy("//*[contains(text(), \"Taxis aeropuerto\")]");
    public static final Target BTN_ALOJAMIENTO = Target.the("Navigation to page hosting ")
            .locatedBy("//*[contains(text(), \"Alojamiento\")]");
    /*
     * title mapping section */
    public static final Target TXT_H1_VUELOS = Target.the("page title flights ")
            .locatedBy("//*[contains(text(), 'Compara y reserva vuelos fácilmente')]");
    public static final Target TXT_H1_ALQUILERCOCHES = Target.the("page title cars ")
            .locatedBy("//*[contains(text(), 'Alquiler de coches para cualquier tipo de viaje')]");
    public static final Target TXT_H1_ATRACCIONESTURISTICAS = Target.the("page title tourist attractions")
            .locatedBy("//*[contains(text(), 'Atracciones, actividades y experiencias')]");
    public static final Target TXT_H1_TAXIS = Target.the("page title cabs ")
            .locatedBy("//*[contains(text(), 'Reserva un taxi desde o al aeropuerto')]");
    public static final Target TXT_H1_ALOJAMIENTOS = Target.the("title of page accommodation ")
            .locatedBy("//*[contains(text(), 'Encuentra tu próxima estancia')]");
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
    public static final Target INDEX = Target.the("Index")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[3]/div/header/nav[1]/div[1]/div/span/a/svg");

}
