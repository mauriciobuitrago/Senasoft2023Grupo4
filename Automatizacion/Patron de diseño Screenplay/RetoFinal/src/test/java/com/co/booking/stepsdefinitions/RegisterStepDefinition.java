package com.co.booking.stepsdefinitions;

import com.co.booking.models.RegisterData;
import com.co.booking.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.booking.userinterfaces.RegisterPage.BTN_ContinuarConEmail;

public class RegisterStepDefinition {

    @Given("^that the user is on the user registration page$")
    public void thatTheUserIsOnTheUserRegistrationPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLSBQoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4q8QRVclVEbzdTaTV4SWxHb1UtdWtNZGxORDVRNUpRVmJjZl83ZmFKdXhZTE9uTlV1X0g0MV9CdVI5RUI1NXRjWnZfRFl6SHRhRW8xNFhZUXgxaVBYQW1ZcDdPbGk4YjY5WlJyMGZtcnMtTlpPak51eEc5S3hHb3drZjVKbVQ5d2hhNHBETUhWajN6OVJ4czREVUNGRk1hdnhKejlhMGhfNy1nVVpYSFpyakg0aWpLYVI4N1JxLWdXMlllVEV2UFE2Q3R1dEhWT2R0aDlwamdPUGRsSFptdUVWcVVDZl9ndm14Y2hRX1c3bzFHTnc0T3o2WFZweXFlSUVjcmpsWGdENi1faFFWeURMZVRhc3lPVG05ZElRNm04V2ludER2R1R6dU1JN0dyVmpVUE5oSkM2TW9ndzRFVk1KcEVnUkhUNENEWkNKZXMtRnhBakY0LXBaQVpMd2lPMHJCU2tTTDVCcW5qOEZtanlXaEl3QzQwSlZCTTdQZFJIRFVMSm5kMHNzNTJoV1UwMjNrUDZXaTVvUWFBMjNKWTRuS0xDOV80d3JxTnU3bld6bXRFSE9Hc1Z4cEtLTE9raUJxNDgyQkFkZXpfUFBiaVFRM0hETmtJcDJfQTBkQ29ZYTg4azRnS2h4Z3ZSdVZZMnJLeFk4VG5DdVktMkIzTmZSNHZPdXRlZGo5aGUyTVpMQUM1VG1OZ2R6TS1KZU83d2VTZkRhVDZTRy1pSFhJNjF4VERjeXNFSW5MWU9PcEpLSG40S0xSeTB4SlFfSlRlNHl6VHRrOD0qZXlKcFpDSTZJblJ5WVhabGJHeGxjbDlvWldGa1pYSWlmUT09QgRjb2RlKioI3tGOATDt-fud08cmOgBCAFizxNKoBpIBEHRyYXZlbGxlcl9oZWFkZXI"));
    }


    @When("^enter a common text in the email field$")
    public void enterACommonTextInTheEmailField() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.enter());
    }

    @Then("^The alert see$")
    public void theAlertSee() {

    }
}


