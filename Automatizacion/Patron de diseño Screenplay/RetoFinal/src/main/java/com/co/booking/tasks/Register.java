package com.co.booking.tasks;

import com.co.booking.userinterfaces.RegisterPage;
import net.bytebuddy.implementation.bytecode.Throw;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("correor@examples.com").into(RegisterPage.TXT_USERNAME));
        actor.attemptsTo(Click.on(RegisterPage.BTN_ContinuarConEmail));
    }

    public static Register enter() {
        return Tasks.instrumented(Register.class);
    }
}
