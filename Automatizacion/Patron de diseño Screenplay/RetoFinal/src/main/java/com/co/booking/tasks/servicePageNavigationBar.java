package com.co.booking.tasks;

import com.co.booking.userinterfaces.servicePageNavigationBarComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
public class servicePageNavigationBar implements Task{


    String Destino;

    public servicePageNavigationBar(String Destino) {
        this.Destino = Destino;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(servicePageNavigationBarComponent.POP_BAD));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        switch (Destino) {
            case "Vuelos":
                actor.attemptsTo(Click.on(servicePageNavigationBarComponent.BTN_VUELOS));
                break;
            case "Alquiler de coches":
                actor.attemptsTo(Click.on(servicePageNavigationBarComponent.BTN_AlQUILER_DE_COCHES));
                break;
            case "Atracciones turisticas":
                actor.attemptsTo(Click.on(servicePageNavigationBarComponent.BTN_ATRACCIONES_TURISTICAS));
                break;
            case "Taxis aeropuerto":
                actor.attemptsTo(Click.on(servicePageNavigationBarComponent.BTN_TAXISAEROPUERTO));
                break;
            case "button Alojamiento":
                actor.attemptsTo(Click.on(servicePageNavigationBarComponent.BTN_ALOJAMIENTO));
                break;
            default:
                actor.attemptsTo(Click.on(servicePageNavigationBarComponent.BTN_VUELOS));

        }
    }

    public static servicePageNavigationBar navigation(String destino) {
        return Tasks.instrumented(servicePageNavigationBar.class, destino);
    }

}
