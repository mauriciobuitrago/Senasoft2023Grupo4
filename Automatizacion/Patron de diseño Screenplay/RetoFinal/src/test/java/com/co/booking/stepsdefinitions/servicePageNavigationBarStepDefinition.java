package com.co.booking.stepsdefinitions;


import com.co.booking.models.RegisterData;
import com.co.booking.tasks.Register;
import com.co.booking.tasks.servicePageNavigationBar;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
public class servicePageNavigationBarStepDefinition {

    @Given("^the user is on the home page of the application$")
    public void theUserIsOnTheHomePageOfTheApplication() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/index.es.html?label=msn-TO1IkuujWTyc4RQsVlQntQ-80401975799486%3Atikwd-80402149099264%3Aloc-43%3Aneo%3Amte%3Alp142142%3Adec%3Aqsbooking&utm_source=bing&utm_medium=cpc&utm_term=TO1IkuujWTyc4RQsVlQntQ&utm_content=Booking+-+Desktop&utm_campaign=Spanish_Colombia+ES+CO&aid=2369661&sid=97fd026c4782552dc9e72c6477f529c2"));
    }

    @When("^the user clicks on a navigation button \"([^\"]*)\"$")
    public void theUserClicksOnANavigationButton(String destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(servicePageNavigationBar.navigation(destino));
    }

}
