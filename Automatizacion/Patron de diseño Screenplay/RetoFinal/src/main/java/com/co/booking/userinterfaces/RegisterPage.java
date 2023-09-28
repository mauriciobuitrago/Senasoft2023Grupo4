package com.co.booking.userinterfaces;

import net.bytebuddy.implementation.bytecode.Throw;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_USERNAME = Target.the("Ingresar Usuario")
            .locatedBy("//*[@name='username']");
    public static final Target BTN_ContinuarConEmail = Target.the("clic boton Continuar con email")
            .locatedBy("//*[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    public static final Target ALERT = Target.the("valida el mensaje")
          .locatedBy("//*[@id='username-note']");

}
