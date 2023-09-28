package com.co.booking.stepsdefinitions;

import com.co.booking.models.RegisterData;
import com.co.booking.questions.navegationsQuestions;
import com.co.booking.tasks.Register;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class servicepagenavigationbarStepdefinitionAlquiler {
    @Then("^user will then see on the screen the page title Compara y reserva vuelos fácilmente Alquiler de coches$")
    public void userWillThenSeeOnTheScreenThePageTitleComparaYReservaVuelosFácilmenteAlquilerDeCoches() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(navegationsQuestions.verification(), Matchers.is(true)));
    }
}
