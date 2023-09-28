package com.co.booking.questions;

import com.co.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Alert implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegisterPage.ALERT).viewedBy(actor).asString();
    }
    public static Alert seealert() {
        return new Alert();
    }
}
