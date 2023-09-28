package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_USERNAME = Target.the("Ingresar Usuario")
            .locatedBy("//*[@name='username']");
    public static final Target BTN_ContinuarConEmail = Target.the("clic boton Continuar con email")
            .locatedBy("//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");

//    public static final Target  = Target.the("valida el mensaje")
//            .locatedBy("//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");
//
}
