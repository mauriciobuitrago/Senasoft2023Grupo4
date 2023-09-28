package com.co.booking.questions;

import com.co.booking.userinterfaces.servicePageNavigationBarComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class navegationsQuestions implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Visibility.of(servicePageNavigationBarComponent.BTN_VUELOS).viewedBy(actor).asBoolean();
    }

    public static navegationsQuestions verification() {
        return new navegationsQuestions();
    }
}