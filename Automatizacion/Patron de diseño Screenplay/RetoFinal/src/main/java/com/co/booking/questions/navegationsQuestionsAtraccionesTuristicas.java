package com.co.booking.questions;

import com.co.booking.userinterfaces.servicePageNavigationBarComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


public class navegationsQuestionsAtraccionesTuristicas implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  Visibility.of(servicePageNavigationBarComponent.TXT_H1_ATRACCIONESTURISTICAS).viewedBy(actor).asBoolean();
    }

    public static navegationsQuestionsAtraccionesTuristicas verification() {
        return new navegationsQuestionsAtraccionesTuristicas();
    }
}
